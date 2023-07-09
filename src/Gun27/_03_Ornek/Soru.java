package Gun27._03_Ornek;

import Gun27._01_Ornek.Utility;

public class Soru {
    public static void main(String[] args) {
        // Bir Üniversitede öğrencilere ders kaydı yapılacaktır.
        // 1- Lesson : fields : name, saat (1-10 arasında değer alıyor).
        // 2- Student: fields : name, maxSaat, dersleri adında derslerini listesini tutacak bir liste.
        // 3- 3 adet ders oluşturunuz.
        // 4- 1 adet öğrenci tanımlayınız alabileceği maxCredit si 10 olsun.
        // 5- Bu öğrencinin ders listesine açılmış dersleri ekleyiniz.
        //    ders eklerken max alabileceği Saati geçmemeli, geçerse
        //    uyarı versin, alabileceğiniz max Saati doldu şeklinde.
        // 6- Unıversıte kurallarını yazdıran 2 maddelik bir not yazdıran metod ekleyinız.en basta
        //    yazdırınız.



        Student.theRulesOfUniversity();

        Lesson lesson1=new Lesson();
        lesson1.lessonName="Algoritma";
        lesson1.lessonHours=4;

        Lesson lesson2=new Lesson();
        lesson2.lessonName="Java";
        lesson2.lessonHours=4;

        Lesson lesson3=new Lesson();
        lesson3.lessonName="Test Tools";
        lesson3.lessonHours=3;

        Student student=new Student();
        student.studentName="Sureya";
        student.studentMaxHours=10;

        student.addLesson(lesson1);
        student.addLesson(lesson2);
        student.addLesson(lesson3);

        student.writeLessons();

        






    }
}
