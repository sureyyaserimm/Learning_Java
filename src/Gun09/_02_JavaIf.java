package Gun09;

import java.util.Scanner;

public class
_02_JavaIf {
    public static void main(String[] args) {
        //girilen bir sayının negatif mi pozitif mi olduğunu yazdırınız
        //0 ise sıfır yazdırınız

        Scanner oku=new Scanner(System.in);
        System.out.print("Sayı giriniz=");
        int sayi= oku.nextInt();

        if (sayi>0)
        {  System.out.println("sayi=pozitif");  }

        if (sayi<0)
        {  System.out.println("sayi=negatif");  }

        if (sayi==0)
        {  System.out.println("sayi=0");  }


    }
}
