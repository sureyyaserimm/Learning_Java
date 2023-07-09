package Gun15;

public class _05_JavaNestedLoop {
    public static void main(String[] args) {
        // Aşağıdaki görüntüyü veren programı yazınız(yanlızca 1 yıldız ile yapınız)
        // *
        // **
        // ***
        // ****
        // *****
        // *****
        // ****
        // ***
        // **
        // *


        for (int satir=1;satir<=5;satir++) {

            for (int i =0; i < satir; i++)
                System.out.print("*");
            System.out.println(" ");
        }
        for (int satir=5;satir>=0;satir--) {

            for (int i =0; i < satir; i++)
                System.out.print("*");
            System.out.println(" ");
        }




    }
}
