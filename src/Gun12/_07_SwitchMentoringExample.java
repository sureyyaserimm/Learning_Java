package Gun12;

public class _07_SwitchMentoringExample {
    public static void main(String[] args) {
        //Switch: koşula bağlı durumlarda bir çok if-else bloğu yazmak yerine kullanılıyor.
        //çalışırken switch bir kez değerlendirilir anahtar kelime için koşulu sağlayan case bloğu çalışır
        //her caseden sonra break eklenir.

        //100e kadar olan sayılardan randım bir sayının birler basamağını yazdırınız.

        int number=(int) (Math.random()*100);
        System.out.println("number = " + number);

        int ones= number%10;
        switch (ones) {
            case 0: System.out.println("zero");break;
            case 1: System.out.println("one");break;
            case 2: System.out.println("two");break;
            case 3: System.out.println("three");break;
            case 4: System.out.println("four");break;
            case 5: System.out.println("five");break;
            case 6: System.out.println("six");break;
            case 7: System.out.println("seven");break;
            case 8: System.out.println("eight");break;
            case 9: System.out.println("nine");break;

        }

    }
}
