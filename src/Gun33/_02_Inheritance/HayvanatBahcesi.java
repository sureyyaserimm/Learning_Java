package Gun33._02_Inheritance;

public class HayvanatBahcesi {
//    Bir hayvanat bahçesi için bir program yazılmak isteniyor.
//    Kediler için (renk,kilo,cinsi)
//    kopekler için (renk,kilo, cinsi)
//    yılanlar için renk, kilo, cinsi, uzunluk)
//    ordek için (renk, kilo, cinsi, kanatAcikligi)
//    bütün hayvanların konustu metodu vardır.(çıkardığı sesler)
    public static void main(String[] args) {

        Kopek kopek1=new Kopek("beyaz",50,"kangal");
        kopek1.konustu();

        Kedi kedi1=new Kedi("siyah", 7,"van");
        kedi1.konustu();

        Yilan yilan1=new Yilan("kırmızı",3,"zehirli",5);
        yilan1.konustu();

        Ordek ordek1=new Ordek("beyaz",3,"gövel",90);
        ordek1.konustu();

    }
}
