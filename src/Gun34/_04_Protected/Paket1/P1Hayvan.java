package Gun34._04_Protected.Paket1;

public class P1Hayvan {
    public String ad; //her paketten, her yerden erişilebilir.
    int yas; //default sadece bulunduğu paketten erişilebilir.
    protected String cinsi; //default gibi, diğer paketlerden erişimle
    // ilgili bir seçeneği var.
    private String renk; //bulunduğu classtan erişilebilir.

}
