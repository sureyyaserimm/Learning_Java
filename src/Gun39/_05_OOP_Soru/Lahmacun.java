package Gun39._05_OOP_Soru;

public class Lahmacun implements IFood{
    @Override
    public void taste() {
        System.out.println("Mükemmel yerli pizza.");
    }

    @Override
    public double ucret() {
        return 20;
    }

    void dough(){
        System.out.println("Mayalı hamur hazırandı.");
    }

    void addMeat(){
        System.out.println("Özel kıyma eklendi.");
    }

    void bake(){
        System.out.println("Odun ateşinde pişirildi.");
    }
}
