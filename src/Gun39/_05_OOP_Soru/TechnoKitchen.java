package Gun39._05_OOP_Soru;

import Gun39.MyFunc;

public class TechnoKitchen {

    public static void hazirla(IFood f){
        System.out.println("*****************");
        System.out.println(f.getClass().getSimpleName());
        if(f instanceof AdanaKebap){
            ((AdanaKebap)f).marinade();
            MyFunc.Bekle(2);
            ((AdanaKebap)f).grill();
            MyFunc.Bekle(2);
        }
        else
            if (f instanceof Lahmacun){
                ((Lahmacun)f).addMeat();
                MyFunc.Bekle(2);
                ((Lahmacun)f).bake();
                MyFunc.Bekle(2);
                ((Lahmacun)f).dough();
                MyFunc.Bekle(2);
            }
            else
                if (f instanceof Borsh) {
                    ((Borsh)f).boil();
                    MyFunc.Bekle(2);
                    ((Borsh)f).eatTomorrow();
                    MyFunc.Bekle(2);
            }
                else
            if (f instanceof Palov){
                ((Palov)f).fry();
                MyFunc.Bekle(2);
                ((Palov)f).boil();
                MyFunc.Bekle(2);

            }
            f.taste();



    }
}
