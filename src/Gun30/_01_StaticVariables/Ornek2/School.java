package Gun30._01_StaticVariables.Ornek2;

public class School {
    public static void main(String[] args) {

        Student ogr1=new Student(1,"ismet temur");
        Student ogr2=new Student(2,"ayse solmaz");
        Student ogr3=new Student(3,"ahmet cemil");
        //Problem: hem ID'yi takip etmek zorundayım
        // hem de hata olasılığı yüksek

        Student ogr10=new Student("ismet temur");
        Student ogr11=new Student("ayse solmaz");
        Student ogr12=new Student("ahmet cemil");
        System.out.println("ogr10"+ogr10);
        System.out.println("ogr11"+ogr11);
        System.out.println("ogr12"+ogr12);





    }
}
