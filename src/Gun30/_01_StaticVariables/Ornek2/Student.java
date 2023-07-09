package Gun30._01_StaticVariables.Ornek2;

public class Student {

    int ID;
    String fullName;
    static int count=1; //sen bitanesin
    // static olmadan herzaman 0 la başlıyordu
    // static olduğunda artık bir tane oladuğundan
    // değerini korudu ve hep 1 tane arttı
    // tüm nesnelere ait olan bilgileri veya
    // sayac gibi işlemler için static kullanılır.

    public Student(int ID,String fullName) {
        this.ID = ID;
        this.fullName = fullName;
    }

    public Student(String fullName) {
        this.ID = count++; //önce var olan değeri
        this.fullName = fullName;
    }


    @Override
    public String toString() {
        return "Student{" +
                "ID=" + ID +
                ", fullName='" + fullName + '\'' +
                '}';
    }
}
