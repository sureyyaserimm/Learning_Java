package Gun47;

public class MyField {
    int x; //default 0
    int y; //default 0
    public void doStuff(int x,int y){
        x=x;  //parametreyi parametreye atadın nesnenin kendi xi değişmedi
        y=this.y; //nesnenin y si dedeğişmedi. this yanlış yerde,
        // eğer this.y solda olsaydı 200 görünürdü.
    }
    public void display(){
        System.out.print(x+" "+ y +":");
    }
    public static void main(String[] args) {
        MyField m1=new MyField();
        m1.x=100;
        m1.y=200;
        MyField m2=new MyField();
        m2.doStuff(m1.x, m1.y); // 100 200
        m1.display(); //100 200
        m2.display(); //0 0
    }
}
