package Gun32._02_Encapsulation;

import java.util.Scanner;

public class ArabaMain {

    // Bir araba nesnesi oluşturulmak isteniyor. fields(Renk, Model, MotorHacmi,KapiSayisi)
    // Bu nesnenin verilerini OOP kurallarına uygun olarak verip alınız.
    // Main de 1 tane nesne oluşturup bunu kontrol ediniz.

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Model giriniz=");


    Araba araba1=new Araba();
    araba1.setKapiSayisi(5);
    araba1.setModel(2022);
    araba1.setRenk("kırmızı");
    araba1.setMotorHacmi(1599);
        System.out.println("araba1 = " + araba1);

        Araba araba2=new Araba("mavi",2030,1600,4);
        System.out.println("araba2 = " + araba2);
        //biz modele 2023ten bütük olmasını istemedik
        // yine de atama yaptı.
        //bunu önlemek için public Arabanın içine setRenk(renk);....
        //şeklinde tanımlama yaptık.


        int arabaModeli= araba1.getModel();




    }
}
