package Gun27._02_Ornek;

public class MyMath {
    public static int getMin(int a,int b){
        return Math.min(a,b);
    }

    public static int getMax(int a,int b){
        return Math.max(a,b);
    }

    public static int getRandom(int max) {
        return (int)(Math.random()*max);
    }

    public static double getUs(int a,int b){
        return Math.pow(a,b);
    }
    public static double getKarekok(int a){
        return Math.sqrt(a);
    }
}
