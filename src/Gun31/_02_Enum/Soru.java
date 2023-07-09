package Gun31._02_Enum;

public class Soru {// Bir User yetkilendirme modülü yapılması isteniyor.
    // USER ROLÜ : ADMIN, MUDUR, SATIS, PERSONEL
    // USER STATUSU : AKTIF, PASIF
    // Yukarıdaki şekilde bir USER(username,role ,statu) class ı tanımlayınız
    // Farklı yetki ve statüde 2 kullanıcı ve bir de ADMIN
    // kullanıcısı tanımlayınız.
    // UserSilme isimli fonksiyona bu userları gönderiniz.
    // ADMIN kullanıcısı için bu user silinemez uyarısı verdirelim


    //bunları buraya yazmaktansa new java classta isimleri girip
    // Enum oluşturmak daha iyidir.

//    enum Role{ADMIN, MUDUR, SATIS, PERSONEL}
//
//    enum Statu {AKTIF, PASIF}

    public static void main(String[] args) {

        User user1=new User("ismet",Role.ADMIN,Statu.AKTIF);
        User user2=new User("Mehmet",Role.MUDUR,Statu.PASIF);
        User user3=new User("Ayse", Role.SATIS, Statu.AKTIF);

        UserSil(user1);
        UserSil(user2);
        UserSil(user3);

        System.out.println(user1);
    }
    public static void UserSil(User user){
        if (user.role==Role.ADMIN)
            System.out.println(user.username+"  Admin silinemez.");
    }



}
