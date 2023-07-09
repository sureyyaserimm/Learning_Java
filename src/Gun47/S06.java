package Gun47;

import java.util.ArrayList;

public class S06 {
    public static void main(String[] args) {
        //bu kod parçasının çıktısı nedir?
        ArrayList<Integer> points = new ArrayList<>();
        points.add(1);
        points.add(2);
        points.add(3);
        points.add(4);
        points.add(null);
        points.remove(1); //index olarak 1i silecek, 1 rakamını değil.
        points.remove(null);
        System.out.println("points = " + points);
        //değer silerken aynı değerden 2 tane varsa ilkini siler.
        //points.clear(); hepsini siler

        //points.remove((Object)1); değer olarak 1i siler
    }
}
//cevap=points = [1, 3, 4]
