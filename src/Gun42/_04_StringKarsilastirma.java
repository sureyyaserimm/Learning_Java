package Gun42;

public class _04_StringKarsilastirma {
    public static void main(String[] args) {
        //Stringlerde neden == yerine equals kullanılıyor?
        String cumle1="Bugün hava çok güzel";
        String cumle2="Bugün hava çok güzel";

        //ilkel tiplerde karşılaştırıldığından 2sinde de değerleri karşılaştırır.
        //Çünkü başka bir şeyi yok.
        if(cumle1 == cumle2)
            System.out.println("cümle1 cümle2ye eşit");
        else
            System.out.println("cümle1 cümle2ye eşit değil");

        if(cumle1.equals(cumle2))
            System.out.println("cümle1 cümle2ye eşit");
        else
            System.out.println("cümle1 cümle2ye eşit değil");

        //*****referans tiplerde durum******//
        //scannerle ekrandan okuduğunda aşağıdaki gibi oluyor
        String cumle3=new String("Bugün hava çok güzel");
        String cumle4=new String("Bugün hava çok güzel");

        if(cumle3 == cumle4) //adresleri karşılaştırır
            System.out.println("cümle3 cümle4e eşit");
        else
            System.out.println("cümle3 cümle4e eşit değil");

        if(cumle1.equals(cumle2)) //değerleri karşılaştırır.
            System.out.println("cümle3 cümle4e eşit");
        else
            System.out.println("cümle3 cümle4e eşit değil");

    }
}
