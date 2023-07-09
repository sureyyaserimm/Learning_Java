package Gun26._02_Ornek;

import java.util.ArrayList;
import java.util.Arrays;

public class Company {
    public static void main(String[] args) {
        // 1- Adım : Person isimli bir class tanımlayınız : name, surname, age
        // 2- Adım : main de 2 tane bu sınıftan nesne oluşturup deger atayınız.
        // 3- Adım : Bu degerlerı yazıdırınız.
        // 4- Adım : getBirthYear isminde Person a ait bir metod yazınız,
        //           çalıştığında kişinin doğum yılını versin.
        // 5- Adım : getInitials isminde kişinin adının ilk harfi.soyadının ilk harfi
        //           şeklinde (Büyük harf) veren metodu yazınız. örnek ahmet demir : A.D.

        Person worker1 = new Person();
        worker1.name = "Hatice";
        worker1.surname = "Demir";
        worker1.age = 30;

        Person worker2 = new Person();
        worker2.name = "Muhammed";
        worker2.surname = "Gurdal";
        worker2.age = 35;


        //1.Solution
        System.out.println("worker1 name= " + worker1.name);
        System.out.println("worker1 surname= " + worker1.surname);
        System.out.println("worker1 age= " + worker1.age);

        System.out.println("worker2 name= " + worker2.name);
        System.out.println("worker2 surname= " + worker2.surname);
        System.out.println("worker2 age= " + worker2.age);

        //2.solution

        writeInformation(worker1);
        writeInformation(worker2);

        //3.solution---->Good solution
        worker1.writeInformation();
        worker2.writeInformation();



//        int[] array=new int[5];
//        System.out.println("Array= " + Arrays.toString(array));
//
//        ArrayList<Integer> arrayList=new ArrayList<>();
//        System.out.println("arrayList.toString() = " + arrayList.toString());
        //aslında burda da toString var ama metod olarak girildiği için görünmüyor.

        //4.solution---->Best solution ever!!!
        System.out.println("worker1 = " + worker1);
        System.out.println("worker2 = " + worker2);

        worker1.getBirthYear();
        worker2.getBirthYear();

        System.out.println("worker1 = " + worker1.getBirthYear2());
        System.out.println("worker2 = " + worker2.getBirthYear2());

        worker1.getInitials();
        worker2.getInitials();


    }

    public static void writeInformation(Person worker) {
        System.out.println("worker1 name= " + worker.name);
        System.out.println("worker1 surname= " + worker.surname);
        System.out.println("worker1 age= " + worker.age);


    }

}
