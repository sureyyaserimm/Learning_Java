package Gun04;

public class _08_Ornek {
    public static void main(String[] args) {
        //String olarak verilen 2 adet bagis parasının toplamini yazdiriniz.
        String bagis1="500";
        String bagis2="1500";
        System.out.println(bagis1+bagis2); //5001500 yazar

        int intBagis1= Integer.parseInt(bagis1);
        int intBagis2= Integer.parseInt(bagis2);

        int toplamBagis=intBagis1+intBagis2;
        System.out.println("toplamBagis = " + toplamBagis);



    }
}
