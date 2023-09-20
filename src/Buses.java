import java.util.Scanner;

public class Buses {
    private static Buses[] bus= new Buses[100];
    private static int id_bus=100;
    private int maTuyen;
    private double khoangCach;
    private int soDiem;

    public Buses(int maTuyen, double khoangCach, int soDiem) {
        this.maTuyen = ++id_bus;
        this.khoangCach = khoangCach;
        this.soDiem = soDiem;
    }

    public Buses() {
    }

    protected void inputBuses() {
        System.out.println("co bao nhieu tuyen moi");
        int busesNum=new Scanner(System.in).nextInt();
        for (int i = 0; i < busesNum; i++) {
            System.out.print("nhap thong tin tuyen "+ (i+1));
            Buses buses= new Buses();
            System.out.print("nhap khoang cach di ");
            this.khoangCach= new Scanner(System.in).nextDouble();
            System.out.println("nhap so diem dung ");
            this.soDiem= new Scanner(System.in).nextInt();
        saveBuses(buses);
        }
    }

   public static void saveBuses(Buses buses) {
        for (int i = 0; i <bus.length; i++) {
            if (bus[i]==null){
                bus[i]=buses;
                break;
            }

        }
    }

   public void showBuses() {
       for (int i = 0; i < bus.length; i++) {
           if (bus[i]!=null){
               System.out.println(bus[i]);
           }
       }
    }
}
