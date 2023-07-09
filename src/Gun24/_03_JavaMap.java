package Gun24;

import java.util.HashMap;
import java.util.Map;

public class _03_JavaMap {
    public static void main(String[] args) {
        //Bir kartvizit uygulamasını iki kişi için yapjnız.

        HashMap<String, String> sKartvizit = new HashMap<>();
        sKartvizit.put("isim", "Süreya Serim");
        sKartvizit.put("email", "sureyyaserimm@gmail.com");
        sKartvizit.put("adres", "San Francisco/California");
        sKartvizit.put("telefon", "05534560613");

        System.out.println("uKartvizit.get(\"isim\") = " + sKartvizit.get("isim"));
        System.out.println("uKartvizit.get(\"telefon\") = " + sKartvizit.get("telefon"));

        HashMap<String, String> aKartvizit = new HashMap<>();
        aKartvizit.put("isim", "Ayşe Bayrak");
        aKartvizit.put("email", "ayse@gmail.com");
        aKartvizit.put("adres", "Şişli/İstanbul");
        aKartvizit.put("telefon", "05423618596");

        HashMap<String, HashMap<String, String>> kartvizitler = new HashMap<>();
        kartvizitler.put("Süreya", sKartvizit);
        kartvizitler.put("Ayşe", aKartvizit);

        System.out.println("Süreya'nın kartviziti= " + kartvizitler.get("Süreya"));
        System.out.println("Ayşe'nin kartviziti = " + kartvizitler.get("Ayşe"));

        System.out.println("Ayşe'nin adresi = " + kartvizitler.get("Ayşe").get("adres"));

        for (Map.Entry<String, HashMap<String, String>> kv :kartvizitler.entrySet()) {
            System.out.println("Sadece Mailler= " + kv.getValue().get("email"));
             }

    }
}
