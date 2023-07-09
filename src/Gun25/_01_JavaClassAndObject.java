package Gun25;

public class _01_JavaClassAndObject {
    //metodların yazıldığı yer
    public static void main(String[] args) { //başla
        //ana programın başladığı ve çalıştığı yer
        int number=5;

        Car myCar=new Car(); //Car (class) tür, tip adı. myCar object
        myCar.brand="Tesla";
        myCar.color="Dark Black";
        myCar.engineVolume=4000;
        myCar.year=2022;

        System.out.println("myCar.year = " + myCar.year);
        System.out.println("myCar.color = " + myCar.color);
        System.out.println("myCar.brand = " + myCar.brand);
        System.out.println("myCar.engineVolume = " + myCar.engineVolume);


    }//dur

//metodların yazıldığı yer


}

//class tiplerinin tanımlandığı yer

class Car {
    String color;
    int year;
    String brand;
    int engineVolume;
}