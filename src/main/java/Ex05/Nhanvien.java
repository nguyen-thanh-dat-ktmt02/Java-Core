package Ex05;

public class Nhanvien extends Canbo{
    private String congviec;

    public Nhanvien(String hoten, int tuoi, Gioitinh gioitinh, String diachi, String congviec) {
        super(hoten, tuoi, gioitinh, diachi);
        this.congviec = congviec;
    }

    @Override
    public String toString() {
        return "Nhanvien{" +
                "congviec='" + congviec + '\'' +
                ", hoten='" + hoten + '\'' +
                ", tuoi=" + tuoi +
                ", gioitinh=" + gioitinh +
                ", diachi='" + diachi + '\'' +
                '}';
    }
}
