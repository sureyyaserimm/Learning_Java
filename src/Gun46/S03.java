package Gun46;

public class S03 {
    public static void main(String[] args) {
        //bu kodun çıktısı nedir?
        int[][] arr=new int[2][4];

        arr[0]=new int[]{1,3,5,7};
        arr[1]=new int[]{1,3};

        for (int[] a: arr){ //a burada arr'nin elemanları yani satırlarını temsil ediyor sırasıyla
            for (int i=0;i< arr.length;i++){ //arr.length satır sayısını, a.length ise her satırın eleman sayısını temsil eder.
                                             //arr.length 2 olduğu için sutünlardaki ilk 2 elemanı yazdırır.
                System.out.print(a[i]+" ");
            }
            System.out.println();
        }

    }
}
//cevap
//1 3
//1 3
