package Gun42;

import java.util.Arrays;

public class _02_JavaVeriTipleri {
    public static void main(String[] args) {

        //ilkel tipler, primitive tipler : short,byte,lonf,float,double,boolean
        int sayi1=5;
        int sayi2=10;

        sayi1=sayi2; //sayi1=10 //eşitlersen değerler atanı kendi hücreleri yine aynı kalır.
        sayi1=34;
        sayi2=45;
        System.out.println("sayi1 = " + sayi1);
        System.out.println("sayi2 = " + sayi2);

        //Referans Tipler : classlar,diziler,arraylar,nesneler
        int[] dizi1={1,2,3,4};
        int[] dizi2={5,6};
        System.out.println("dizi1 = " + Arrays.toString(dizi1));
        System.out.println("dizi2 = " + Arrays.toString(dizi2));

        dizi1=dizi2;
        System.out.println("dizi1 = " + Arrays.toString(dizi1)); //5,6
        System.out.println("dizi2 = " + Arrays.toString(dizi2)); //5,6

        dizi1[0]=67;
        System.out.println("dizi1 = " + Arrays.toString(dizi1)); //67,6
        System.out.println("dizi2 = " + Arrays.toString(dizi2)); //67,6

        dizi2[0]=55;
        System.out.println("dizi1 = " + Arrays.toString(dizi1)); //55,6
        System.out.println("dizi2 = " + Arrays.toString(dizi2)); //55,6

        //Nesne Tipler:NULL alabilen ilkel tipler
        //String, Integer,Double,Long
        String ad1="mehmet";
        String ad2="ismet";
        //Referans ama davranışı ilkel

        ad1=ad2;
        System.out.println("ad1 = " + ad1); //ismet farklı kutucuk
        System.out.println("ad2 = " + ad2); //ismet farklı kutucuk

        ad1="Ali";
        System.out.println("ad1 = " + ad1); //ali
        System.out.println("ad2 = " + ad2); //ismet



    }
}
