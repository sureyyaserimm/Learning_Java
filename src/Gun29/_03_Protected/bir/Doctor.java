package Gun29._03_Protected.bir;

public class Doctor {
    protected String name; //default ile aynı
    String department; //default

    private String SicilNo; //private
    public String hastaneAd; //public

    Doctor(){ //default Constructor
    }

    public Doctor (String name)
    {
        this.name=name;
    }
}
