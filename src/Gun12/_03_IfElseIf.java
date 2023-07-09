package Gun12;

import java.util.Scanner;

public class _03_IfElseIf {
    public static void main(String[] args) {
        Scanner read=new Scanner(System.in);
        System.out.println("Öğrencinin ders ve notunu giriniz.");
        String dersVeNot= read.nextLine();

        int ind=dersVeNot.indexOf(":");
        int harfNot=Integer.parseInt(dersVeNot.substring(ind+1));

        //2.solution
        int harfNot2=Integer.parseInt(dersVeNot.replaceAll("[^0-9]",""));

        if (harfNot>=90)
            System.out.println("A");
        else
            if (harfNot>=80)
                System.out.println("B");
            else
            if (harfNot>=70)
                System.out.println("C");
                else
                if (harfNot>=60)
                    System.out.println("D");
                    else
                    if (harfNot>=40)
                        System.out.println("E");
                        else
                            System.out.println("F");



    }
}
