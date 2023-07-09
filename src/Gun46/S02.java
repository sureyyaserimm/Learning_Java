package Gun46;

public class S02 {
    public static void main(String[] args) {
        //bu kodun çıktısı nedir?
        int[][] arr=new int[2][4];

        arr[0]=new int[]{1,3,5,7};
        arr[1]=new int[]{1,3};

        for (int[] a: arr){
            for (int i : a){
                System.out.print(i+" ");
            }
            System.out.println();
        }

//cevap
// 1 3 5 7
// 1 3


        /*************************************/
        //***** tek boyutlularda yöntem aynı ilk oluşturma anında {} değer ataması yapılabilir
        //***** sonrasında {} atamak için new int[] kullanılmalı.
        int[] dizi1=new int[]{2,5,6,7};
        int[] dizi={2,5,6,7};
        dizi=new int[]{1,2,3,4,5,6,7,77};

        int[][] tablo={
                {3,25,55},
                {234,22,33}
        };

        //2 boyutlularda da durum aynı
        int[][] arr2=new int[2][40]; //2.boyut yani sütun aşağıda yeniden boyutlandırılıyor.
        //burada 40 olması yazdırmayı etkilemez. ama 2yi değiştirirsek default değeri 0 olduğu için girdiğimiz değer kadar 0 girer.

        arr2[0]=new int[]{1,3,5,7}; //satır 0 : bu satırı yeniden oluştuuruyor.
        arr2[1]=new int[]{1,3};     //satır 1 : bu satırı yeniden oluştuuruyor.

        //biz fori ile yazdırmıştık önceden. bu soruda ise foreach ileçözüm yapılmış..
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                System.out.print(i+" ");
            }
            System.out.println();
        }


    }
}


