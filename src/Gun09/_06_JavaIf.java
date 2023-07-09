package Gun09;

import java.util.Scanner;

public class _06_JavaIf {
    public static void main(String[] args) {
        //Girilen bir cümlede a harfini geçip geçmediğini bulunuz.
        //geiyor ise EVET, geçmiyorsa HAYIR yazdırınız.

        Scanner oku=new Scanner(System.in);
        System.out.print("Bir cümle giriniz=");
        String cumle= oku.next();

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
