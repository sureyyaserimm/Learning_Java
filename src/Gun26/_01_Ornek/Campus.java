package Gun26._01_Ornek;

public class Campus {
    public static void main(String[] args) {
        // Bir kampus programı için asagıdaki özellikte bilgilerin
        // kaydedileceği clasları yazınız.
        // Okul :  adı, mudurAdi, ucreti(double)  -> tip
        // Ogrenci : okulNo, tamAd, okulu  -> Tip

        // bu şekilde 1 öğrenci tanımlayıp bütün bilgileri kendiniz
        // atayıp  yazdırınız.

        Student stu=new Student();
        stu.schoolNum=1;
        stu.name="Sureya Serim";

        //1.solution
        stu.school=new School();
        stu.school.schoolName="Kayapinar İlkokulu";
        stu.school.managerName="Vildan Gördük İpek";
        stu.school.price=50000;

        //2.solution
        School school=new School();
        school.schoolName="Kayapinar İlkokulu";
        school.managerName="Vildan Gördük İpek";
        school.price=50000;
        stu.school=school;

        System.out.println("student's school number = " + stu.schoolNum);
        System.out.println("student's name = " + stu.name);
        System.out.println("student's school's name = " + stu.school.schoolName);
        System.out.println("student's school's manager name = " + stu.school.managerName);
        System.out.println("student's school's price = " + stu.school.price);


    }
}
