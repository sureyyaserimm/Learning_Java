package A_Odevler.Odev10_01_09_2023.Soru3;

import java.util.ArrayList;

public abstract class Phone {

    static ArrayList<String> cart = new ArrayList<>();

    static int getSum(ArrayList<String> list) {
        int toplam = 0;
        for (String text : list) {
            text = text.replaceAll("[^0-9]", "");
            int ucret = Integer.parseInt(text);
            toplam += ucret;
        }
        return toplam;
    }

    abstract void options(String a, String b);

}
