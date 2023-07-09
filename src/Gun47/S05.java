package Gun47;

import java.util.ArrayList;
import java.util.List;

public class S05 {
    public static void main(String[] args) {
        //bu kod parçasının çıktısı nedir?
        List colors = new ArrayList();
        colors.add("green");
        colors.add("blue");
        colors.add("red");
        colors.add("yellow");
        colors.remove(2); //red silindi
        colors.add(3, "cyan"); //yeni 3e gelecek
        System.out.println("colors = " + colors);
        //son sıraya denk gelen indexe eklenebilir ama
        // ondan büyük bir indexe ekleme yapılmaz, hata verir.


    }
}
// colors = [green, blue, yellow, cyan]
