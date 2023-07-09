package A_Odevler.Odev10_01_09_2023.Soru3;

public class Samsung extends Phone {
    @Override
    void options(String a, String b) {
        if (a.contains("256 GB") && b.contains("5.5 inch")) {
            cart.add("$1000");
        } else if (a.contains("256 GB") && b.contains("7.5 inch")) {
            cart.add("$1200");
        } else if (a.contains("512 GB") && b.contains("5.5 inch")) {
            cart.add("$1300");
        } else if (a.contains("512 GB") && b.contains("6.5 inch")) {
            cart.add("$1400");
        }

    }
}
