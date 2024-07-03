package Ex05;

public class Congnhan extends  Canbo{
    private int bac;

    public Congnhan(String hoten, int tuoi, Gioitinh gioitinh, String diachi, int bac) {
        super(hoten, tuoi, gioitinh, diachi);
        this.bac = bac;
    }

    @Override
    public String toString() {
        return "Congnhan{" +
                "bac=" + bac +
                ", hoten='" + hoten + '\'' +
                ", tuoi=" + tuoi +
                ", gioitinh=" + gioitinh +
                ", diachi='" + diachi + '\'' +
                '}';
    }
}
