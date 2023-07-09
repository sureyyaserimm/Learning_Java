package Gun37._01_Soru;

import java.util.ArrayList;

public class VehicleMain {
    public static void main(String[] args) {
        ArrayList<Vehicle> vehicles=new ArrayList<>();
        TeslaCar teslaCar1=new TeslaCar("Long Range", 5000);
        ToyotaPrius toyotaPrius1=new ToyotaPrius("Prius",3500);
        Bus bus1=new Bus("Mercedes", 7000);
        vehicles.add(teslaCar1);
        vehicles.add(toyotaPrius1);
        vehicles.add(bus1);
        System.out.println(vehicles);

        for (Vehicle v:vehicles) {
            System.out.println("-----------------");
            System.out.println(v.getClass().getSimpleName()); //classın adını verir.
            System.out.println("-----------------");
            System.out.println("Modeli = " + v.getModel());
            System.out.println("Engine = " + v.getEngine());

            if (v instanceof TeslaCar) {
                System.out.println(((TeslaCar)v).drive());
                System.out.println(((TeslaCar)v).changeBattery());
            }
            else
                if (v instanceof ToyotaPrius){
                    System.out.println(((ToyotaPrius)v).drive());
                    System.out.println(((ToyotaPrius)v).changeBattery());
                    System.out.println(((ToyotaPrius)v).changeOil());
                }
                else
                    if (v instanceof Bus){
                        System.out.println(((Bus)v).drive());
                        System.out.println(((Bus)v).changeDiesel());
                    }
        }

    }
}
