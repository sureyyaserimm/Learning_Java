package Gun08;

public class _05_JavaAssignmentOperators {
    public static void main(String[] args) {
        int a=10;
        //a=a+5;  a=15 olur
        a+=5;  //yine 15 olur
        //anın artık miktarı 5tir
        System.out.println("a = " + a);

        int b=10;
        //b=b-5;   b=5 olur
        b-=5;  // 5 olur
        //bnin azalış miktarı 5tir
        System.out.println("b = " + b);

        int c=10;
        //c=c/5;  c 2 olur
        c/=5;
        //c nin bölen değeri 5tir
        System.out.println("c = " + c);

        int d=10;
        //d=d*5; d 50 olur
        d*=5;
        //dnin çarpım değeri 5tir
        System.out.println("d = " + d);


    }
}
