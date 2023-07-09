package Gun26._04_Ornek;

import java.util.Scanner;

public class ElectricAccount {
    int totalConsumption=0;
    double unitPrice=0.7;
    double bill=0;

    public void addConsumption(int monthlyConsumption) {
        totalConsumption+=monthlyConsumption;
        }
    public void writeTotalConsumption(){
        System.out.println("Total Consumption = " + totalConsumption);
    }
        public void writeTheBill(String name){

            bill=totalConsumption*unitPrice;
            System.out.println("****************");
            System.out.println("   Your bill    ");
            System.out.println("****************");
            System.out.println("Costumer="+name);
            System.out.println("Total Consumption="+totalConsumption);
            System.out.println("Toplam Amount="+Math.round(bill));
            System.out.println("****************");
        }
    }





