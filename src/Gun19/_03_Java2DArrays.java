package Gun19;

import java.util.Arrays;
import java.util.Scanner;

public class _03_Java2DArrays {
    public static void main(String[] args) {
        // Günün Sorusu :  3x2 lik bir diziyi kullanıcıdan sayı alarak
        // doldurduktan sonra sadece tek elemenlarını tek boyutlu bir
        // diziye atayınız.

        Scanner input = new Scanner(System.in);
        int[][] array = new int[2][3];

        //okuma işlemi
        int tekMik = 0;
        for (int satir = 0; satir < array.length; satir++) {
            for (int sutun = 0; sutun < array.length; sutun++) {
                System.out.print("Enter a number=");
                array[satir][sutun] = input.nextInt();

                if (array[satir][sutun] % 2 != 0)
                    tekMik++;
            }
        }
        int[] teklerinDizisi = new int[tekMik];

        tekMik = 0;
        for (int satir = 0; satir < array.length; satir++) {
            for (int sutun = 0; sutun < array[satir].length; sutun++) {

                if (array[satir][sutun] % 2 != 0) {
                    teklerinDizisi[tekMik] = array[satir][sutun];
                    tekMik++;

                }
            }
        }

        System.out.println(Arrays.toString(teklerinDizisi));


    }
}

