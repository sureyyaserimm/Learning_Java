package Gun26._04_Ornek;

public class Ornek {
    public static void main(String[] args) {
        /* 1.Adım  :Musteri isimli (fields: name) isimli bir class tanımlayınız.
        2.Adım  :ElektrikHesabi isimli (fields : toplamTuketim(int), birimFiyat(double),
        fatura(double))  class tanımlayınız
        3.Adım  :Musteri a bir ElektrikHesabi ekleyiniz.
        4.Adım  :1 tane müşteri oluşturunuz,
        5.Adım  :Musteriye ait her ay tüketilen enerjiyi toplayacak bir metod yazınız.
        tuketimEkle olsun her verilen aylık rakamı toplayarak biriktirsin.
        6.Adım  :Ödenecek rakamı  toplam tüketimi  oran(0.7) ile çarparak hesaplatınız, yazdırınız.

        ipucu : hesabı olşuturduktan sonra tuketimEkle metoduna 2,3 ay tüketim ekletiniz,
       faturayı ondan sonra toplam alarak çıkartınız  */

        Costumer cos1=new Costumer();
        cos1.name="Sureya Serim";

        cos1.electricAccount=new ElectricAccount();
        cos1.electricAccount.addConsumption(50);
        cos1.electricAccount.addConsumption(60);
        cos1.electricAccount.addConsumption(70);

        cos1.electricAccount.writeTotalConsumption();

        cos1.electricAccount.writeTheBill(cos1.name);



    }
}
