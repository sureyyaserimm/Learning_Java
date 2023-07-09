package Gun11;

import java.util.Scanner;

public class _07_JavaMath {
    public static void main(String[] args) {
        //  Math.max yöntemi ile girilen 3 sayıdan büyük olanını bulunuz

        Scanner read=new Scanner(System.in);
        System.out.println("Write a number");
        int a=read.nextInt();

        System.out.println("Write a number");
        int b=read.nextInt();

        System.out.println("Write a number");
        int c=read.nextInt();

        //1.solution
        int max=Math.max(a,b);
        max=Math.max(max,c);
        System.out.println("max = " + max);

        //2.solution
        int max2=Math.max(a,Math.max(b,c));
        System.out.println("max2 = " + max2);




    }
}
