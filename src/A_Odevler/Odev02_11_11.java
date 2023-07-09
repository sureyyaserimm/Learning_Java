package A_Odevler;

import java.util.Scanner;

public class Odev02_11_11 {
    public static void main(String[] args) {
        //1- Bir String oluşturun. Konsol'a isminizi girin.İsminizi yazdırın.
        //2- Bir int oluşturun.Konsol'a herhangi bir sayı giriniz.Bu sayıyı yazdırın.
        //3- Bir String oluşturun.Konsol'a sevdiğiniz bir meyveyi yazın.O meyveyi yazdırınız.
        //4- Bir int oluştur.Konsol'a arabanızdaki kapı sayısını girin.Bu int'i yazdırın.
        //5- Bir String oluştur.Konsol'a 10 sene önceki yaşadığın şehri yazın.Bu String'i yazdırın.
        //6- Bir string oluşturunuz.Doğum gününüzü konsola giriniz.String'i yazdırınız.
        //7- Bir boolean oluşturunuz.Konsola "Bir Banka Hesabınız Var mı ? " yazınız.
        //    Varsa True , yoksa False olarak  konsoldan cevap veriniz.Boolean'ı yazdırınız.
        //8- Bir byte oluşturunuz.Konsola kg cinsinden bir ağırlık yazınız.Byte'ı yazdırınız.
        //9- Bir float oluşturunuz.Konsola boyunuzu giriniz.Float'ı yazdırınız.

        //1
        Scanner read=new Scanner(System.in);
        System.out.print("What is your name?= ");
        String name=read.nextLine();
        System.out.println("name = " + name);

        //2
        Scanner read2=new Scanner(System.in);
        System.out.print("write a number= ");
        int number= read2.nextInt();
        System.out.println("number = " + number);

        //3
        Scanner read3=new Scanner(System.in);
        System.out.print("What is your favorite fruit's name?= ");
        String name3=read3.nextLine();
        System.out.println("Your favorite fruit's name is= " + name3);

        //4
        Scanner read4=new Scanner(System.in);
        System.out.print("How many doors does your car have?= ");
        int Numberofdoors= read4.nextInt();
        System.out.println("Number of doors = " + Numberofdoors);

        //5
        Scanner read5=new Scanner(System.in);
        System.out.print("Where did you live 10 years before?= ");
        String Cityname=read5.nextLine();
        System.out.println("City name is " + Cityname);

        //6
        Scanner read6=new Scanner(System.in);
        System.out.println("Wheer did you born? = ");
        String Cityname2=read6.nextLine();
        System.out.println("City name is " + Cityname2);

        //7
        Scanner read7=new Scanner(System.in);
        System.out.println("Do you have any bank account? ");
        boolean bankAccount= read7.nextBoolean();
        System.out.println("Answer= " + bankAccount);

        //8
        Scanner read8=new Scanner(System.in);
        System.out.print("How much is your weight? ");
        byte weight= read8.nextByte();
        System.out.println("Your weight is " + weight);

        //9
        Scanner read9=new Scanner(System.in);
        System.out.println("What is your height?");
        float height= read9.nextFloat();
        System.out.println("Your height is " + height);









    }
}
