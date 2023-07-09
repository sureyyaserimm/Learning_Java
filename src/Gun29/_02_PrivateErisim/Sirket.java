package Gun29._02_PrivateErisim;

public class Sirket {
    public static void main(String[] args) {

        Calisan calisan1=new Calisan();
        calisan1.ID=1;
        calisan1.name="ismet";
        calisan1.surname="temur";
        //calisan1.password="1234";
        //artık private kendi paketinden bile çağrılamaz.


        calisan1.sifreAta("1234");
        calisan1.sifreAta("M123_sdf23");
        calisan1.sifreGoster();





    }
}
