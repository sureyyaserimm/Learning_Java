package Gun38._02_abstract;

public abstract class Sekil {
    private String name;

    abstract double alan();

     abstract double cevre();

    public void ciz() {
        System.out.println(name+" şekli çizildi");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Sekil{" +
                "\nname='" + name + '\'' +
                "\nalan="+alan()+ '\'' +
                "\nçevre="+cevre()+'\'' +
                "\n";
    }
}
