package Gun31._04_EnumSoru;

import java.util.ArrayList;
import java.util.Scanner;

public class PizzaSiparisHatti {
    public static void main(String[] args) {
        // Bir pizza sipariş hattı yapılmak isteniyor.
        // Kullanıcıya Pizza için 1-Small,2-Medium,3-Large, 4-Goster
        // seçeneklerini bir menü şeklinde vererek, verdiği pizzaları
        // bir ARRAYLIST e atınız.
        // Goster (4) ü seçtiğinde her pizzadan kaçar tane sipariş
        // verdiğini bir metodda yazdırınız.
        //TODO:Her pizza tipi için ücret belirleyerek toplam ücreti yazdırınız.


        Scanner input = new Scanner(System.in);
        ArrayList<Pizza> siparisler = new ArrayList<>();
        int secim = 0;
        do {

            //menu
            menu();
            secim = input.nextInt();
            //scannerla secimi alalım
            //secilen pizza arrayliste ekleyelim
            switch (secim) {
                case 1:
                    Pizza sp = new Pizza(PizzaSize.SMALL);
                    siparisler.add(sp);
                    break;
                case 2:
                    Pizza mp = new Pizza(PizzaSize.MEDIUM);
                    siparisler.add(mp);
                    break;
                case 3:
                    Pizza lp = new Pizza(PizzaSize.LARGE);
                    siparisler.add(lp);
                    break;
                case 4:
                    siparisYazdir(siparisler);
                    //eğer 4ü seçerse arraylisti bir metoda gönder
                    //orada hangi pizzadan kaç sipaiş verdiğini göster
                case 5:
                    siparisUcretYaz(siparisler);

            }
        } while (secim <= 4);

    }

    public static void menu() {

        System.out.println("******* Pizza Menü ********");
        System.out.println("1-Small");
        System.out.println("2-Medium");
        System.out.println("3-Large");
        System.out.println("4-İşleme Al-Siparişi Gönder");
        System.out.println("5-Çıkış");
        System.out.print("Seçiminiz=");

    }

    public static void siparisYazdir(ArrayList<Pizza> siparisler) {
        int s = 0, m = 0, l = 0;
        for (Pizza p : siparisler) {
            if (p.size == PizzaSize.SMALL) s++;
            else if (p.size == PizzaSize.MEDIUM) m++;
            else if (p.size == PizzaSize.LARGE) l++;

        }
        System.out.println("***** Siparişleriniz *****");
        System.out.println("Small Pizza Count = " + s);
        System.out.println("Medium Pizza Count = " + m);
        System.out.println("Large Pizza Count = " + l);

    }

    public static void siparisUcretYaz(ArrayList<Pizza> pizzas) {
        int s = 10, m = 15, l = 20;
        int total = 0;
        for (Pizza p : pizzas) {
            if (p.size == PizzaSize.SMALL) total += s ;
            else if (p.size == PizzaSize.MEDIUM) total += m ;
            else if (p.size == PizzaSize.LARGE) total += l ;
        }

        System.out.print("Toplam Ücretiniz=" + total + "$");
    }

}
