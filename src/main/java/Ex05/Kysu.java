package Ex05;

public class Kysu extends  Canbo{
    private String ngangdaotao;

    public Kysu(String hoten, int tuoi, Gioitinh gioitinh, String diachi, String nganhDaoTao) {
        super(hoten, tuoi, gioitinh, diachi);
        this.ngangdaotao = ngangdaotao;
    }

    @Override
    public String toString() {
        return "Kysu{" +
                "ngangdaotao='" + ngangdaotao + '\'' +
                ", hoten='" + hoten + '\'' +
                ", tuoi=" + tuoi +
                ", gioitinh=" + gioitinh +
                ", diachi='" + diachi + '\'' +
                '}';
    }
}
