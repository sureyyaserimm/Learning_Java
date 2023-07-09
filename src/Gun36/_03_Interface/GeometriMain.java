package Gun36._03_Interface;

public class GeometriMain {
    public static void main(String[] args) {

        Cember cember1=new Cember();
        cember1.ciz(); //Çember çizildi

        Dikdortgen dikdortgen1=new Dikdortgen();
        dikdortgen1.ciz(); //dikdörtgen çizildi

        //interfacelerden nesne üretilemez fakat referans tipi oluşturulabilir.
        //bu bize Polymorphism sağladı.

        ICizdirir cember2=new Cember();
        cember2.ciz(); //Çember çizildi
        //direkt olarak sadece Interface'teki ismi verilmiş olanlar metodlara erişebilirsin.

        cizdirme(cember1);
        cizdirme(dikdortgen1);

    }

    public static void cizdirme(ICizdirir cizdirir){

        cizdirir.ciz();
    }






}
