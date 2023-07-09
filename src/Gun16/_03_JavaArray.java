package Gun16;

public class _03_JavaArray {
    public static void main(String[] args) {
        int [] array=new int[5];  //0,1,2,3,4 indexli 5 elemanlı dizi
        int [] array2={5,6,34,77,66}; //5 elemanlı bir dizi, hem tanımladım hem de ilke değerlerini verdim.

        String[] words= new String[5]; //5 tane kelime saklayabilen bir dizi değişkeni
        boolean[] array3=new boolean[5]; //5 tane boolean(true/false) saklayabilen bir dizi değişkeni
        double[] rate=new double[5]; //5 tane oran saklayabilen bir dizi değişkeni

        for (int i = 0; i < array.length; i++) {
            System.out.println("array = " + array[i]);
        }

        for (int i = 0; i < words.length; i++) {
            System.out.println("words = " + words[i]);
        }

        for (int i = 0; i < rate.length; i++) {
            System.out.println("rate = " + rate[i]);
        }

        for (int i = 0; i < array3.length; i++) {
            System.out.println("array3 = " + array3[i]);
        }









    }
}
