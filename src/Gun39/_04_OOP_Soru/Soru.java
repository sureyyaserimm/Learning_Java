package Gun39._04_OOP_Soru;

class C{
    public C(){ //dede
        System.out.println("C");
    }
}

class B extends C{ //baba
    public B(){
        // super(); aslında bursa super class var, görünmez ama durur.
        //o yüzden önce super classı yazdırır.
        System.out.println("B");
    }
}

class A extends B{ //evlat
    public A(){
        // super(); aslında bursa super class var, görünmez ama durur.
        //o yüzden önce super classı yazdırır.
        System.out.println("A");
    }

}



public class Soru {
    public static void main(String[] args)
    {
        A a1=new A();
    }
}
