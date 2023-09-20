import java.util.Scanner;

public class People {
    private String hoTen;
    private String diaChi;
    private int SDT;

    public People(String hoTen, String diaChi, int SDT) {
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.SDT = SDT;
    }

    public People() {
        getHoTen();
        getDiaChi();
        getSDT();
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public int getSDT() {
        return SDT;
    }

    @Override
    public String toString() {
        return "People{" +
                "hoTen='" + hoTen + '\'' +
                ", diaChi='" + diaChi + '\'' +
                ", SDT=" + SDT +
                '}';
    }

    public void setSDT(int SDT) {
        this.SDT = SDT;
    }
    public void inputInfo(){
        System.out.print("nhap ho ten");
        this.setHoTen(new Scanner(System.in).nextLine());
        System.out.print("nhap dia chi");
        this.setDiaChi(new Scanner(System.in).nextLine());
        System.out.print("nhap SDT");
        this.setSDT(new Scanner(System.in).nextInt());

    }
}
