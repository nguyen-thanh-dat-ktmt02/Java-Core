package Ex05;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

public class QLCB {
    private Scanner scanner = new Scanner(System.in);
    private List<Canbo> canboList = new LinkedList<>();

    public void showMenu(){
        while (true){
            System.out.println("1. Thêm cán bộ");
            System.out.println("2. Tìm kiếm");
            System.out.println("3. Hiển thị");
            System.out.println("4. xóa cán bộ");
            System.out.println("5. Thoát");
            System.out.println("Mời bạn chọn chức năng: ");
            int menu = Integer.parseInt(scanner.nextLine());
            if(menu ==1){
                themCanBo();
            } else if (menu == 2) {
                timKiemTheoHoTen();
            } else if (menu == 3) {
                hienThiDanhSachCanBo();
            } else if (menu == 4) {
                xoaTheoTen();
            } else if (menu == 5) {
                return;
            }else {
                System.out.println("Nhập lại");
            }
        }
    }

    private void xoaTheoTen(){
        System.out.println("Nhap vao ten: ");
        String ten = scanner.nextLine();
        Predicate<Canbo> predicate = new Predicate<Canbo>() {
            @Override
            public boolean test(Canbo canbo) {
                int lastIndexOf = canbo.hoten.lastIndexOf(" ");
                String tenCanBo = canbo.hoten.substring(lastIndexOf + 1);
                return tenCanBo.equals(ten);
            }
        };
        canboList.removeIf(predicate);
    }

    private void hienThiDanhSachCanBo(){
        for (Canbo canbo : canboList) {
            System.out.println(canbo);
        }
    }

    private void timKiemTheoHoTen(){
        String hoTen = nhapVaoHoTen();
        for (Canbo canbo : canboList) {
            if(canbo.hoten.equals(hoTen)){
                System.out.println(canbo);
            }
        }
    }

    private void themCanBo(){
        System.out.println("1. Công nhân");
        System.out.println("2. Kỹ sư");
        System.out.println("3. Nhân viên");
        System.out.printf("Chọn Menu: "+"\n");
        int menu =Integer.parseInt(scanner.nextLine());
        if(menu <1 || menu >3) return;
        String hoTen = nhapVaoHoTen();
        int tuoi = nhapVaoTuoi();
        Gioitinh gioitinh = nhapVaogioitinh();
        String diachi = nhapVaoDiaChi();
        if(menu==1){
            System.out.println("Nhập vào bậc: ");
            int bac = Integer.parseInt(scanner.nextLine());
            Congnhan congnhan = new Congnhan(hoTen, tuoi, gioitinh, diachi, bac);
            canboList.add(congnhan);
        } else if (menu == 2) {
            System.out.println("Nhap vao nganh dao tao: ");
            String nganhDaoTao = scanner.nextLine();
            Kysu kysu = new Kysu(hoTen, tuoi, gioitinh, diachi, nganhDaoTao);
            canboList.add(kysu);
        }else {
            System.out.println("Nhap vao cong viec: ");
            String congViec = scanner.nextLine();
            Nhanvien nhanvien = new Nhanvien(hoTen, tuoi, gioitinh, diachi, congViec);
            canboList.add(nhanvien);
        }
    }

    private String nhapVaoHoTen(){
        System.out.printf("Nhập vào họ tên: "+"\n");
        return scanner.nextLine();
    }

    private int nhapVaoTuoi(){
        System.out.printf("Nhập vào tuổi: "+"\n");
        return Integer.parseInt(scanner.nextLine());
    }

    private Gioitinh nhapVaogioitinh(){
        System.out.printf("Chọn giới tính: "+"\n");
        System.out.println("1. Nam");
        System.out.println("2. Nữ");
        System.out.println("3. Khác");
        String m = scanner.nextLine();

        if(m.equals("1")){
            return Gioitinh.Nam;
        } else if (m.equals("2")) {
            return Gioitinh.Nu;
        } else {
            return Gioitinh.Khac;
        }
    }

    private String nhapVaoDiaChi(){
        System.out.println("Nhập vào địa chỉ: ");
        return scanner.nextLine();
    }
}
