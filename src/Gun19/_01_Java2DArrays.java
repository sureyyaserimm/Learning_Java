package Gun19;

public class _01_Java2DArrays {
    public static void main(String[] args) {
        int [][] tablo={
                {3,4,55},
                {234,22,33}
        }; //2 satır 3 sütunluk bir tablo

        System.out.println("row's lenght = " + tablo.length); //2 // satır sayısı
        System.out.println("0.row's lenght = " + tablo[0].length);//3   0.satırın sütun uzunluğu
        System.out.println("1.row's length = " + tablo[1].length);//3   1.satırın sütun uzunluğu

        for (int i = 0; i < tablo.length; i++) {

            for (int j = 0; j < tablo[i].length; j++) {
                System.out.print(tablo[i][j]+"\t");
            }
            System.out.println();
        }





    }
}
