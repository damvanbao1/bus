public class Main {
    public static void main(String[] args) {
        People people=new People();
        Driver driver=new Driver();
        Buses buses= new Buses();
        driver.inputDriver();
        Driver.saveDriver(driver);
        Driver.showDriver();
        Buses buses1= new Buses();
        buses1.inputBuses();
        buses1.showBuses();


    }
}
