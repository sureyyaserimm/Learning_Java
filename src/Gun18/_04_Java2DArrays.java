package Gun18;

import java.util.Scanner;

public class _04_Java2DArrays {
    public static void main(String[] args) {
        // 2 ye 3 lük bir tabloyu kullanıcıdan sayı alarak doldurunuz
        // daha sonra ayrı bir döngüde en büyük sayıyı bulunuz.

        Scanner input=new Scanner(System.in);
        int[] [] array=new int[2][3];

        //okuma işlemi
        for (int satir = 0; satir < 2; satir++) {
            for (int sutun = 0; sutun < 3; sutun++) {
                System.out.print("Enter a number");
                array[satir][sutun]=input.nextInt();
            }
        }
        //tabloyu görmek için
        for (int satir = 0; satir < 2; satir++) {
            for (int sutun = 0; sutun < 3; sutun++) {
                System.out.print(array[satir][sutun]+"\t");

            }
            System.out.println();
        }

        //en büyük değeri bulma işlemi
        int enb=array[0][0];
        for (int satir = 0; satir < 2; satir++) {
            for (int sutun = 0; sutun < 3; sutun++) {

                if (array[satir][sutun]>enb)
                    enb=array[satir][sutun];

            }
            System.out.println("enb = " + enb);
        }


    }
}
