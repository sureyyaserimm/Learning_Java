package Gun19;

public class _06_JavaMethod {
    public static void main(String[] args) {
        writeHello(); //Math.random();
        writeHelloToName("Sureya");

        writeMoreHello(5);

    }
    public static void writeHello(){
        System.out.println("Hello World");
        System.out.println("Hello World");
    }


    public static void writeHelloToName(String name){
        System.out.println(name+ " Hello");

    }

    public static void writeMoreHello(int miktar){

        for (int i = 0; i < miktar; i++) {
            System.out.println(" hello");
        }
    }




}
