package Gun28._04_Constructor;

public class Banka {
    String name;
    int subeSayisi;
    int kurulusYili;


    public Banka(){
    }

    public Banka(String name, int subeSayisi, int kurulusYili) {
        this.name = name;
        this.subeSayisi = subeSayisi;
        this.kurulusYili = kurulusYili;
    }

    public Banka(String name, int subeSayisi) {
        this.name = name;
        this.subeSayisi = subeSayisi;
    }

    @Override
    public String toString() {
        return "Banka{" +
                "name='" + name + '\'' +
                ", subeSayisi='" + subeSayisi + '\'' +
                ", kurulusYili=" + kurulusYili +
                '}';
    }
}


