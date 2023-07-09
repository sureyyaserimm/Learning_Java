package Gun29._03_Protected.bir;

public class HastaneAnkara {
    public static void main(String[] args) {
        Doctor doctor1=new Doctor();
        doctor1.name="ismet";
        doctor1.hastaneAd="Ankara Hastanesi";
        doctor1.department="Dahiliye";
        //doctor1.SicilNo private

        Doctor doctor2=new Doctor("Mehmet");


    }
}
