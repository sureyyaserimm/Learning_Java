package Gun05;

import java.util.Scanner;

public class _07_Ornek {
    public static void main(String[] args) {
     //Bir dikdörtgenin gerekli kenar uzunluklarını kullanıcıdan isteyip
        // çevresini ve alanını bulup yazdırınız.
        Scanner oku=new Scanner(System.in);
        System.out.print("Dikdörtgenin 1.kenar uzunlugunu giriniz= " );
        int kenar1= oku.nextInt();
        System.out.print("Dikdörtgenin 2.kenar uzunlugunu giriniz = ");
        int kenar2= oku.nextInt();

        int alan=kenar1*kenar2;
        System.out.println("alan = " + alan);

        int cevre=2*(kenar1+kenar2);
        System.out.println("cevre = " + cevre);





    }
}
