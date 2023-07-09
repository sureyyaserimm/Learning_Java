package Gun39._05_OOP_Soru;

public class AdanaKebap implements IFood{
    @Override
    public void taste() {
        System.out.println("Etin en güzel hallerinden biri.");
    }

    @Override
    public double ucret() {
        return 75;
    }

    void marinade(){
        System.out.println("Et dünden özel baharatlarla marine edildi.");
    }

    void grill(){
        System.out.println("komur atesinde yavaşça pişirildi.");
    }
}
