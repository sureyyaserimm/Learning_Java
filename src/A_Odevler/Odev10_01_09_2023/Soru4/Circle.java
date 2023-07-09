package A_Odevler.Odev10_01_09_2023.Soru4;

public class Circle extends Data {
    @Override
    double getArea() {
        return pi*getRadius()*getRadius();
    }
}
