package Gun38._02_abstract;

public class SekilMain {
    public static void main(String[] args) {

        Dikdortgen dikdortgen1=new Dikdortgen(3,5);
        dikdortgen1.setName("dikdortgen1");
        dikdortgen1.alan();
        dikdortgen1.cevre();
        dikdortgen1.ciz();
        System.out.println(dikdortgen1);


        Daire daire1=new Daire(5);
        daire1.setName("daire1");
        daire1.alan();
        daire1.cevre();
        daire1.ciz();
        System.out.println(daire1);

    }
}
