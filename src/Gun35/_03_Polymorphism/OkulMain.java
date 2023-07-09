package Gun35._03_Polymorphism;

public class OkulMain {
    public static void main(String[] args) {

        Ogrenci ogrenci1=new Ogrenci("ismet","temur","sınıf başkanı","5B");
        Calisan calisan1=new Calisan("ahmet","yılmaz","müdür","ilokul");

//      System.out.println("calisan1 = " + calisan1);
//      System.out.println("calisan1 = " + calisan1);

//      eğer bu şekilde yazdırırsak her class kendi toStringini kullanıyor.
//      ama bizden tek bir metod istenildiği için Ortak özelliklerin olduğu
//      super classta metod yazarak her iki classın tek bir classtan yazdırılmasını
//      sağlarız. diğer iki classtaki toStringlere aslında ihtiyacımız yok, bu soru için.
//      her bir class kendi toStringini kullanıyor, bu yüzden tek metod değil.

        OrtakOzellikler.kimlikYaz(ogrenci1);
        OrtakOzellikler.kimlikYaz(calisan1);


    }


}
