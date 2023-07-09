package Gun16;

import javafx.scene.transform.Scale;

import java.util.Scanner;

public class _01_JavaArray {
    public static void main(String[] args) {
            //Java Dizi
        int ogrNot; // 1 tane not saklar

        // 50 kişi var
        int ogr1Not;
        int ogr2Not;
        int ogr3Not;
        //....
        //....
        //....
        int ogr50Not;

        // bana bir tanımlamada BIRDEN FAZLA değer tutabilen bir değişkene ihtiyacım var;
        // ÇÖZÜM :
        int   ogrNot20=0;

        int[] note  =new int[50]; // 50 tane int saklayabilen notlar isimli değişken

        note [0]=75;
        note [1]=88;
        //...
        //...
        note[49]=95; // en son eleman sayısı-1 length-1dir böyle de 0-49 indextir.
        //notlar[50]=56; challenger patlar

        System.out.println("notlar = " + note);

        System.out.println("note.length = " + note.length); //50 yani toplam eleman sayısını verir.
        //dizinin eleman sayısını verir.

        //dizi nasıl okutulur?

        Scanner input=new Scanner(System.in);
        for (int i=0;i<note.length;i++)
        {
            System.out.print("Enter the note.");
            note[i]=input.nextInt();
        }

        for (int i=0;i<note.length;i++)
        {
            System.out.println(note[i]); //i ->0,1,2,3,4,.....49
        }







    }

}
