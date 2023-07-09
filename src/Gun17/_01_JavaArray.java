package Gun17;

public class _01_JavaArray {
    public static void main(String[] args) {
        // 50 elemanlı bir dizi tanımlayınız, 10 a kadar olan sayılardan Random atayarak
        // doldurunuz. Sonrasında ayrı bir döngü ile tek olanlar 1, çift olanlara 0 atayınız  yazdırınız.

        int [] array=new int[50];

        for (int i = 0; i < array.length; i++) {
            array[i]=(int) (Math.random()*11); //50 dahil olsun diye 51 ile çarpılır.

        }
        //dizi öncesi
        for (int i = 0; i < array.length; i++) {
            System.out.println("arrayfirst = " + array[i]);

        }

        for (int i = 0; i < array.length; i++) {
            if (array[i]%2==0) //çiftse
                array[i]=0;
            else
                array[i]=1; //tekse

        }
        //dizi sonra
        for (int i = 0; i < array.length; i++) {
            System.out.println("arraylast = " + array[i]);

        }




    }
}
