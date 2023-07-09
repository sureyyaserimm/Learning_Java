package Gun38._03_abstract;

public class FoodMain {
    public static void main(String[] args) {

        Baklava baklava1=new Baklava();
        baklava1.setName("Baklava=");
        baklava1.madeIn();
        baklava1.taste();

        CheeseCake cake1=new CheeseCake();
        cake1.setName("Cheesecake=");
        cake1.madeIn();
        cake1.taste();

        GreekSalad salad1=new GreekSalad();
        salad1.setName("Greek Salad=");
        salad1.madeIn();
        salad1.taste();

        SezarSalad salad2=new SezarSalad();
        salad2.setName("Sezar Salad=");
        salad2.madeIn();
        salad2.taste();




    }
}
