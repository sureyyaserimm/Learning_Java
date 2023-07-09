package Gun10;

import java.util.Scanner;

public class _07_IfElse {
    public static void main(String[] args) {
        // yan yana aralarında bir boslukla girilen 2 int sayının
        // birbirine eşit olup olmadığını bulunuz
        // 45 67

        Scanner read=new Scanner(System.in);
        System.out.println("Write two numbers");
        String numbers=read.nextLine();
        int blank= numbers.indexOf(" ");

        String strNumber1=numbers.substring(0,blank);
        String strNumber2=numbers.substring(blank+1);

        int firstNumber=Integer.parseInt(strNumber1);
        int secondNumber=Integer.parseInt(strNumber2);

        if (firstNumber==secondNumber)
            System.out.println("Equal");

        else
            System.out.println("Not Equal");

    }
}
