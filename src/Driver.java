import java.util.Scanner;

public class Driver extends People{
    private static Driver[] drivers =new Driver[100];
    private static int id=10000;
    private int maLX;
    private Level level;

    public Driver(String hoTen, String diaChi, int SDT) {
        super(hoTen, diaChi, SDT);
        this.maLX=id;
        id++;
    }

    public Driver() {
        super();
    }

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        Driver.id = id;
    }

    public int getMaLX() {
        return maLX;
    }

    public void setMaLX(int maLX) {
        this.maLX = maLX;
    }

    public Level getLevel() {
        return level;
    }

    public void setLevel(Level level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "maLX=" + maLX +
                ", level=" + level.value+
                '}';
    }
   public void inputDriver() {
       System.out.println("co bao nhieu lai xe moi");
       int driverNum = new Scanner(System.in).nextInt();
       for (int i = 0; i < driverNum; i++) {
           System.out.println("nhap thong tin lai xe thu " + (i + 1));
           Driver driver = new Driver();
           super.inputInfo();
           System.out.println("nhan vao trinh do phu hop, chon 1 trong cac loai sau: ");
           System.out.println("1. A");
           System.out.println("2. B");
           System.out.println("3. C");
           System.out.println("4. D");
           System.out.println("5. E");
           System.out.println("6. F");
           int type = new Scanner(System.in).nextInt();
           switch (type) {
               case 1 -> this.setLevel(Level.A);
               case 2 -> this.setLevel(Level.B);
               case 3 -> this.setLevel(Level.C);
               case 4 -> this.setLevel(Level.D);
               case 5 -> this.setLevel(Level.E);
               case 6 -> this.setLevel(Level.F);
           }

       }
   }
    public static void saveDriver(Driver driver) {
        for (int j = 0; j < drivers.length; j++) {
            if (drivers[j] == null){
                drivers[j]=driver;
                break;
            }
        }
    }
    public static void showDriver() {
        for (int i = 0; i < drivers.length; i++) {
            if (drivers[i]!=null);{
                System.out.println(drivers[i]);
            }
        }
    }

}
