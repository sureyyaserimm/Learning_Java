package Gun07;

public class _07_StringStartsWith {
    public static void main(String[] args) {
        //StartWith: bununla başlıyor mu?  küçük-büyük harfe duyarlıdır.
        //sonuç true or false

        String text="HCL Technology";

        System.out.println("text.startsWith(HC) = " + text.startsWith("HC"));  //true
        System.out.println("text.startsWith(te) = " + text.startsWith("te"));  //false
        System.out.println("text.startsWith(h) = " + text.startsWith("h"));    //false




    }
}
