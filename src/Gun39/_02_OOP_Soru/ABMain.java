package Gun39._02_OOP_Soru;

public class ABMain {
    public static void main(String[] args) {
        A a1=new A();
        System.out.println("A.message = " + A.message); //Hello from A

        B b=new B(); //Constructor worked
        System.out.println("A.message = " + A.message); //Hello from B

        A a2=new A(); //bunu değiştirici bir etkisi yok
        System.out.println("A.message = " + A.message); //Hello from B
    }
}
