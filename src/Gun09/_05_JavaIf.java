package Gun09;

import java.util.Scanner;

public class _05_JavaIf {
    public static void main(String[] args) {
        //Girilen bir öğrencinin notuna göre 50 ve üstü ise geçtiniz, altı ise kaldınız diye yazdırınız.

        Scanner oku=new Scanner(System.in);
        System.out.print("Öğrencinin notunu giriniz=");
        int ogrNot= oku.nextInt();

        if (ogrNot>=50)
            System.out.println("Geçti");

        if (ogrNot<50)
            System.out.println("Kaldı");




    }
}
