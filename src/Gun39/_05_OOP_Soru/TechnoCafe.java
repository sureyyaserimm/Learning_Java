package Gun39._05_OOP_Soru;

import Gun39.MyFunc;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TechnoCafe {
    public static void main(String[] args) {

        List<IFood> siparisler=new ArrayList<>();
        Scanner oku=new Scanner(System.in);
        int secim=0;
        int adet=0;
        do {
            menu();
            secim= oku.nextInt();
            switch (secim){
                case 1:
                    AdanaKebap ak=new AdanaKebap();
                    siparisler.add(ak);
                    adet++;
                    break;
                case 2:
                    IFood lh=new Lahmacun();
                    siparisler.add(lh);
                    adet++;
                    break;
                case 3:
                    Borsh bo=new Borsh();
                    siparisler.add(bo);
                    adet++;
                    break;
                case 4:
                    IFood pl=new Palov();
                    siparisler.add(pl);
                    adet++;
                    break;
            }

        }while (secim<5);


        System.out.println("Alınan Siparişler");
        for(IFood f:siparisler){
            System.out.println(f.getClass().getSimpleName());
        }
        MyFunc.Bekle(2);
        System.out.println("Siparişeriniz hazırlanıyor...\n");
        double toplam=0;
        for(IFood f:siparisler){
            TechnoKitchen.hazirla(f);
            toplam+=f.ucret();
        }
        System.out.println("*****************");
        System.out.println("Toplam sipariş adeti = " + adet);
        System.out.println("Toplam Ücret="+toplam);


    }
    public static void menu(){
        System.out.print(
                "\n*****Menü*****\n" +
           "1-Adana Kebap (75 TL)\n" +
           "2-Lahmacun (20 TL)\n" +
           "3-Borsh (40 TL)\n" +
           "4-Palov (20 TL)\n" +
           "5-Tamam"+
           "\nSeçiminiz="
        );

    }
}
