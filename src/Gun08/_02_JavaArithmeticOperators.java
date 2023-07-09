package Gun08;

public class _02_JavaArithmeticOperators {
    public static void main(String[] args) {
        int sayac=0;

        sayac=sayac+1;  //sayacın değerini 1 tane arttırır :1
        sayac++;        //sayacın değerini 1 tane arttırır :2
        ++sayac;        //sayacın değerini 1 tane arttırır :3

        sayac=sayac-1;  //sayacın değerini 1 tane azaltır :2
        sayac--;        //sayacın değerini 1 tane azaltır :1
        --sayac;        //sayacın değerini 1 tane azaltır :0

        /******************************/
        int toplam=5 + sayac;  //5 olur
        System.out.println("toplam = " + toplam); //5
        System.out.println("sayac = " + sayac);   //0

        toplam=5 + sayac++;   //toplam =5+sayac sonra sayac=sayac+1
        //toplam=5 sayac=1
        System.out.println("toplam = " + toplam);  //5
        System.out.println("sayac = " + sayac);    //1

        toplam= 5+ ++sayac; //sayac=sayac+1 sonra toplam=5+sayac  7 olur
        System.out.println("toplam = " + toplam);  //7
        System.out.println("sayac = " + sayac);    //2

        //Özet: ++lar sağda ise ömce işlem sonra artış
        //      ++lar solda ise önce artış sonra işlem


        //toplam=toplam+sayac;
        //sayac=sayac+1
        //toplam=toplam+sayac++

        //sayac=sayac+1
        //toplam=toplam+sayac;
        //toplam=toplam ++sayac;

        //sayac++
        //sayac--






    }
}
