package A_Odevler.Odev10_01_09_2023.Soru3;

public class Apple extends Phone {


    @Override
    void options(String a, String b) {
        if (a.contains("64 GB") && b.contains("5.5 inch")) {
            cart.add("$750");
        } else if (a.contains("64 GB") && b.contains("6.5 inch")) {
            cart.add("$850");
        } else if (a.contains("128 GB") && b.contains("5.5 inch")) {
            cart.add("$950");
        } else if (a.contains("128 GB") && b.contains("6.5 inch")) {
            cart.add("$1200");
        }


    }
}
