package Gun44;

public class S09 {
    public static void main(String[] args) {
        //Bu dizinin her bir elemanını tek tek yazdıracak 2 çözüm yolunu işaretleyiniz.
        int[] intArr={8,16,32,64,128};

        //a out of bounds hatası
//        for (int i: intArr)
//            System.out.print(intArr[i]+" ");


        for (int i: intArr){
            System.out.print(i+" ");
        }


        //compile error
//        for (int i=0:intArr){
//            System.out.print(intArr[i]+" ");
//        }


        //burada elemanlar değil indexler yazdırılır.
//        for (int i = 0; i < intArr.length; i++) {
//            System.out.println(i+" ");
//        }


        System.out.println();

        for (int i = 0; i < intArr.length; i++) {
            System.out.print(intArr[i]+" ");
        }


        //int i'ye değer verilmediği için compile error
//        for (int i; i < intArr.length; i++) {
//            System.out.print(intArr[i]+" ");
//        }



    }
}
