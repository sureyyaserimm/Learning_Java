package Gun20;

import java.util.Scanner;

public class _02_JavaMethod {
    public static void main(String[] args) {
        // Kullanıcının gireceği 2 sayıdan büyük olanını bulma işlemini bir metodda
        // yaptıktan sonra main de yazdırınız.

        Scanner input = new Scanner(System.in);

        System.out.print("Enter 1. number.");
        int number1 = input.nextInt();

        System.out.print("Enter 2. number.");
        int number2 = input.nextInt();

        int enb = findBiggest(number1, number2);
        System.out.println("enb = " + enb);
    }

    public static int findBiggest(int n1, int n2) {
        //1.solution
//        int donecek;
//        if (n1 > n2)
//            donecek = n1;
//        else
//            donecek = n2;
//        return donecek; //bu çözüm doğru ama çok uzun

        //2.solution
      //  return n1 > n2 ? n1 : n2;

        //3.solution
        if (n1>n2)
            return n1;
        else
            return n2;


    }


}
