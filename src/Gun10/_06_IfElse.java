package Gun10;

import java.util.Scanner;

public class _06_IfElse {
    public static void main(String[] args) {
        // Girilen yeni bir password un kurallara uygunluğunu kontrol ediniz.
        // kurallar :
        // 1) en az 8 karakter olmalı
        // 2) içinde pass kelimesi olmamalı
        // 3) en fazla 12 karakter olmalı.

        Scanner read=new Scanner(System.in);
        System.out.println("Write a password");
        String password=read.nextLine();
        int length=password.length();
        boolean isAny=password.toLowerCase().contains("pass");

        if (length>=8 && length<=12 && isAny==false)
            System.out.println("It's okay!");

        else
            System.out.println("It's not okay!");

        // 2.solution
        if (password.length()>=8 && password.length()<=12 && password.toLowerCase().contains("pass")==false)
            System.out.println("It's okay!");

        else
            System.out.println("It's not okay!");

        //3.solution
        if (password.length()>=8 && password.length()<=12 && !password.toLowerCase().contains("pass"))
            System.out.println("It's okay!");

        else
            System.out.println("It's not okay!");









    }
}
