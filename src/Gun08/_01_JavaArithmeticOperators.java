package Gun08;

public class _01_JavaArithmeticOperators {
    public static void main(String[] args) {
        int a=9;
        int b=5;

        System.out.println("Toplama işlemi");
        System.out.println("(a+b)= " + (a+b));

        System.out.println("Çıkarma işlemi");
        System.out.println("(a-b)= " + (a-b));

        System.out.println("Çarpma işlemi");
        System.out.println("(a*b)= " + (a*b));
        
        System.out.println("Bölme işlemi");
        System.out.println("(a/b)= " + (a/b));
        //normalde sonuç 1.8 ama int tam sayı değeri kabul ettiği için sadece bölümü tam sayı olarak sonuç diye verir
        //int/int yaptığımız için, eğer net bir sonuç istenirse double kullanmak gerekiyor

        System.out.println("(double)a/b = " + ((double)a/b));

        System.out.println("Modül İşlemi");
        System.out.println("a % b = " + a % b); //9%5=4
        System.out.println("b % a = " + b % a); //5%9=5
        
        
        //modülde (%) sol büyükse kalan alınır, sol küçükse soldaki sayı alınır.
        
        
    }
    
}
