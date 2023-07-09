package Gun36._06_Interface;

public class GeometriMain {
    public static void main(String[] args) {

        Dikdortgen dikdortgen1=new Dikdortgen();
        System.out.println("dikdörtgen alanı="+dikdortgen1.alan(5,6));
        System.out.println("dikdörtgen çevresi="+dikdortgen1.cevre(5,6));

        Kare kare1=new Kare();
        System.out.println("karenin alanı="+kare1.alan(5));
        System.out.println("karenin çevresi="+kare1.cevre(5));







    }
}
