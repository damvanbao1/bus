public class BangPhanCong {
    private static BangPhanCong[] bangPhanCong= new BangPhanCong[500];
    private Driver driver;
    private Buses buses;
    private int soLuotLai;

    public BangPhanCong(Driver driver, Buses buses, int soLuotLai) {
        this.driver = driver;
        this.buses = buses;
        this.soLuotLai = soLuotLai;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public Buses getBuses() {
        return buses;
    }

    public void setBuses(Buses buses) {
        this.buses = buses;
    }

    public int getSoLuotLai() {
        return soLuotLai;
    }

    public void setSoLuotLai(int soLuotLai) {
        this.soLuotLai = soLuotLai;
    }

}
