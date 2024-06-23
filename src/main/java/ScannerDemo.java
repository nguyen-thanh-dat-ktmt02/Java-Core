import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        System.out.println("Mời bạn nhập vào họ tên: ");
        String fullname= scanner.nextLine();
        System.out.println("Họ tên của bạn là: "+ fullname);

        System.out.println("Mời bạn nhập vào tuổi: ");
        int age = scanner.nextInt();
        System.out.println("Tuổi của bạn là: "+age);

        System.out.println("Mời bạn nhập vào giới tính: ");
        System.out.println("1. Nam");
        System.out.println("2. Nữ");
        int menu= scanner.nextInt();
        Gender gender = null;
        if(menu == 1){
            gender = Gender.MALE;
        } else if (menu == 2) {
            gender = Gender.FEMALE;
        }
        System.out.println("giới tính của bạn là: "+ gender);
    }
}

