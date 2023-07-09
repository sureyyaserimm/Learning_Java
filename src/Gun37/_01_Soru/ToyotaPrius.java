package Gun37._01_Soru;

public class ToyotaPrius extends Vehicle implements IElectric,IGas{
    public ToyotaPrius(String model, double engine) {
        super(model, engine);
    }

    @Override
    public String changeBattery() {
        return "Ömür boyu kullan.";
    }
    @Override
    public String changeOil() {
        return "Bir depo ile 300 km gidebilir.";
    }
    @Override
    public String drive() {

        return "İlk 3 km elektrik ile gider.";
    }
}
