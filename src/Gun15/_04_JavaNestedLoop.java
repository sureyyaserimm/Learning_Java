package Gun15;

public class _04_JavaNestedLoop {
    public static void main(String[] args) {
        // Aşağıdaki görüntüyü veren programı yazınız(yanlızca 1 yıldız ile yapınız)
        // *****    1.Satırda 5
        // ****     2.Satırda 4
        // ***      3.Satırda 3
        // **       4.Satırda 2
        // *        5.Satırda 1

        //1.solution
        for (int satir=5;satir>=0;satir--) {

            for (int i =0; i < satir; i++)
                System.out.print("*");
            System.out.println(" ");
        }
        //2.solution
        for (int satir=1;satir<=5;satir++) {

            for (int i = satir; i <= 5; i++)
                System.out.print("*");
            System.out.println(" ");


        }

    }
}
