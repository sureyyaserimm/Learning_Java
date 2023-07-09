package Gun05;

import java.util.Scanner;

public class _06_Ornek {
    public static void main(String[] args) {
        //Bir karenin kenarını kullanıcıdan isteyerek çevresini ve alanını bulunuz yazdırınız.

        Scanner oku=new Scanner(System.in);
        System.out.println("Karenin bir kenarini giriniz= ");
        int kenar= oku.nextInt();

        int alan=kenar*kenar;
        System.out.println("alan = " + alan);

        int cevre=4*kenar;
        System.out.println("cevre = " + cevre);





    }
}
