package Gun09;

import java.util.Scanner;

public class _07_JavaIf {
    public static void main(String[] args) {
        //Girilen bir cümledeki küçük veya büyük a harfinin olup olmadığını yazdırınız. VAR veya YOK şeklinde

        Scanner oku=new Scanner(System.in);
        System.out.print("Bir cümle giriniz=");
        String cumle= oku.next();

        cumle=cumle.toLowerCase(); //bütün büyük harfleri küçük harfe çevirip a,A

        // cumle=cumle.toUpperCase();

        if (cumle.contains("a"))
            System.out.println("EVET");

        if (!cumle.contains("a")) //cümle başına ! koymak 'değilse,yoksa' manasına gelir
            System.out.println("HAYIR");

        //2.yol

        if (cumle.indexOf("a") != -1)
            System.out.println("EVET");

        if (cumle.indexOf("a") == -1)
            System.out.println("HAYIR");

        //3.yol
        boolean varMi=cumle.contains("a");
        if (varMi==true)
            System.out.println("EVET");

        if (varMi==false)
            System.out.println("HAYIR");




    }
}
