package Gun05;

import java.util.Scanner;

public class _09_Ornek {
    public static void main(String[] args) {
        //Kullanıcıdan agırlığını double, boyunu double olarak alınız.
        //bir satırda boyunuz.... ve kilonuz... şeklinde yazdırınız.
        //vücut kitle indexini de bularak yazdırınız.

        Scanner oku=new Scanner(System.in);
        System.out.print("kilonuzu giriniz= ");
        double kilo= oku.nextDouble();

        System.out.print("boyunuzu giriniz= ");
        double boy= oku.nextDouble();

        System.out.println("boyunuz = " +boy+" "+"Kilonuz"+ " "+kilo);

        double index=kilo/(boy*boy);
        System.out.println("index = " + index);


        int a =10;
        int b=4;
        double bolum=(double) a/b; // burada double yazmazsan int şeklinde sonuç verir.

        System.out.println(bolum); //bölüm yine de int şeklindedir. 2.0



    }
}
