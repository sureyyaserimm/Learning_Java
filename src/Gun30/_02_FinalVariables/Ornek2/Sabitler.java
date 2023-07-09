package Gun30._02_FinalVariables.Ornek2;

public class Sabitler {
    final static int gundekiSaat=24;
    final static int saattekiDakika=60;
    final static int dakikadakiSaniye=60;

    public static int hesapla(int gun,int saat,int dakika){
        int toplamSaniye=
                gun
                        *Sabitler.gundekiSaat
                        *Sabitler.saattekiDakika
                        *Sabitler.dakikadakiSaniye+
                        saat
                                *Sabitler.saattekiDakika
                                *Sabitler.dakikadakiSaniye+
                        dakika
                                *Sabitler.dakikadakiSaniye;

        return toplamSaniye;

    }
}

