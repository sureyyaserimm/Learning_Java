package Gun29._03_Protected.iki;

import Gun29._03_Protected.bir.Doctor;

public class HastaneIstanbul {
    public static void main(String[] args) {

        Doctor doctor1=new Doctor("mehmet"); //public Doctor (String name) {this.name=name;}
        //burdan doktorun adına ulaştık ama diğerlerine ulaşamıyz.
        // sadece public olanlara diğer paketlerden erişebilir.
        doctor1.hastaneAd="Istanbul Hastanesi";


        //Doctor dok2=new Doctor();
        //default sadece
        //kendi paketi ulaşır.





    }
}
