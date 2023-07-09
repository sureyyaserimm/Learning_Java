package Gun14;

import java.util.Scanner;

public class _04_forLoop {
    public static void main(String[] args) {
        //kullanıcının gireceği bir rakama kadar olan sayıların toplamını bulunuz.
        Scanner input= new Scanner(System.in);
        System.out.println("Enter a number.");
        int number= input.nextInt();
        int total=0;

        for (int i=0; i<=number; i++)

            total=total+i; //total+=i;

        System.out.println("total = " + total);



    }
}
