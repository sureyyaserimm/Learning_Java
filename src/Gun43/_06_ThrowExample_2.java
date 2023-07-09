package Gun43;

import java.util.Scanner;

public class _06_ThrowExample_2 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.print("Yeni şifre oluşturma");

        System.out.print("Yeni şifreniz =");
        String newPassword=scan.nextLine();

        try {

            if (newPassword.length() < 8)
               throw new Exception("Şifre en az 8 karakterden oluşmalı.");
                //log tutma

            if (newPassword.length() > 15)
                throw new Exception("Şifre en fazla 15 karakterden oluşmalı.");
                //log tutma
        }
        catch (Exception ex)
        {
            //hatalar bir yere toplanıp hepsi için yapılması gereken işlemler
            // bir arada burda yapılabilri.mesela log tutma gibi
            System.out.println("Lütfen Dikkat!");
            System.out.println(ex.getMessage());
            //log tutma

        }
    }
}
