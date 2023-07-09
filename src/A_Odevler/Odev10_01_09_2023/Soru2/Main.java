package A_Odevler.Odev10_01_09_2023.Soru2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.print("Enter first number=");
        int firstnum= input.nextInt();
        System.out.print("Enter second number=");
        int secondnum= input.nextInt();

        Sum sum1=new Sum();
        System.out.println("Sum="+sum1.calculating(firstnum,secondnum));

        Divide divide1=new Divide();
        System.out.println("Divide= " + divide1.calculating(firstnum, secondnum));

        Multiply multiply1=new Multiply();
        System.out.println("Multiply= " + multiply1.calculating(firstnum, secondnum));

        Substract substract1=new Substract();
        System.out.println("Substract= " + substract1.calculating(firstnum, secondnum));




    }
}
