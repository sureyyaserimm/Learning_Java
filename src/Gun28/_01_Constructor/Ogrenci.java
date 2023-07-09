package Gun28._01_Constructor;

public class Ogrenci {
    int ID;
    String ad;
    String soyad;
    int sinifi;

    public Ogrenci(){ //yapıcı metodlar: Constructor Methods
        System.out.println("nesne oluşturuldu.");
    } //nesne oluşturulurken yapmak istediklerin için burayı kullan.

    public Ogrenci(int ID,String ad,String soyad,int sinifi) {
        this.ID = ID; //this.id:class'ın id2si, id:local değişken parametresi
        this.ad = ad;
        this.soyad = soyad;
        this.sinifi = sinifi;
    }
         public Ogrenci(int ID,String ad,String soyad){
//            this.ID = ID;
//            this.ad = ad;
//            this.soyad = soyad; //bunları teker teker yazmak yerine daha kısa yolu var.
             this(ID,ad,soyad,0);
    }

}

//    mühendisin arabayı çizdiği kağıttaki modeller: class, tipin adı, türün adı
//        buna bakarak yapılmış araba ise nesne, araba üretilirken yapılan işlemlerin
//        yapıldığı metos ise Constructor yani yapıcı metodlar