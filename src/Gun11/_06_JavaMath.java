package Gun11;

public class _06_JavaMath {
    public static void main(String[] args) {
        int a=-12;
        int b=4;

        System.out.println("a'nın mutlak değeri= " + Math.abs(-12));
        System.out.println("a ve b'den büyük olan" + Math.max(a,b));
        System.out.println("a ve b'den küçük olan" + Math.min(a,b));
        System.out.println("2nin 3. kuvveti=" + Math.pow(2,3));
        System.out.println("b2nin karekökü=" + Math.sqrt(b));
        System.out.println("round 3.1=" + Math.round(3.1)); //yuvarlama 3
        System.out.println("round 3.5=" + Math.round(3.5)); //yuvarlama 4

        System.out.println("Math.ceil(3.1) = " + Math.ceil(3.1)); //bu sayıdan büyük en yakın tam sayıya yuvarlama
        System.out.println("Math.ceil(3.5) = " + Math.ceil(3.5));
        System.out.println("Math.floor(3.1) = " + Math.floor(3.1)); //bu sayıdan küçük en yakın tam sayıya yuvarlama
        System.out.println("Math.floor(3.5) = " + Math.floor(3.5));


        int enb=Gun20._01_JavaMethod.enbBul(a,b);

    }
}
