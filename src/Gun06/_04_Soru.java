package Gun06;

import java.util.Scanner;

public class _04_Soru {
    public static void main(String[] args) {
        //Girilen bir stringin sadece son harfini yazdırınız.

        System.out.println("Bir cümle giriniz" );
        Scanner oku=new Scanner(System.in);

        // 01234 ->oda numaraları
        // bugun ->son harfın oda numarası uzunluğun 1 eksiği
        String cumle=oku.nextLine();

        int uzunluk=cumle.length();
        char sonharf=cumle.charAt(uzunluk-1);
        System.out.println("son harf = " + sonharf);

        //2.yöntem
        System.out.println("sonharf = "+cumle.charAt(cumle.length()-1) );




    }
}
