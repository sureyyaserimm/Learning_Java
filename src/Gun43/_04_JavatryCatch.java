package Gun43;

import java.util.InputMismatchException;
import java.util.Scanner;

public class _04_JavatryCatch {
    public static void main(String[] args) {
        System.out.println("program başladı");
        try{
            Scanner oku=new Scanner(System.in);

            System.out.print("Sayi1=");
            int sayi1 = oku.nextInt();

            System.out.print("Sayi2=");
            int sayi2 = oku.nextInt();

            int bolum = sayi1 / sayi2;
            System.out.println("bolum = " + bolum);

//            String kelime="";
//            kelime.charAt(3);     //genel hataya düşmesi için yapıldı.

        }
        catch (InputMismatchException ex) //belirl bir hata
        {
            System.out.println("Lütfen sayı giriniz.");
        }
        catch (ArithmeticException ex)  //belirl bir hata
        {
            System.out.println("Sıfıra bölme hatası!");
        }
        catch (Exception ex)  //yukarıdaki hatalar dışında oluşan hatalar için
        {
            System.out.println("Hata oluştu"+ ex.getMessage());
        }
        System.out.println("Program bitti.");
    }
}
