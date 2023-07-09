package Gun43;

public class _01_JavaException {
    public static void main(String[] args) {
        System.out.println("Program çalışmaya başlaı.");
        String kelime=""; //bu kısımda ; kullanmayınca program çalışmaz, bu compile error
        char harf=kelime.charAt(3); //bu satırda ise kelimeni 3. indexinde bir şey olmadığı için çalışmaz. Runtime error
        System.out.println("Program bitti");

    }
}

// daha çalışmadan önce oluşmuş eksikliklerden kaynaklı hatalara
// Derleme zamanı yani COMPILE ERROR, Exception diyoruz.

//program çalıştıktan sonra çalışma zamanı içerisindeki hatalara
//çalışma zamanı yani RUNTIME ERROR, Exception diyoruz.