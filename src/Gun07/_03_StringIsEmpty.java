package Gun07;

public class _03_StringIsEmpty {
    public static void main(String[] args) {
        //IsEmpty:bir stingin içinde bir şey olup olmadığına boolean olarak cevap verir
        
        
        String s1="Merhaba";
        System.out.println("s1.isEmpty() = " + s1.isEmpty());
        
        String s2=" "; //boşluk da bir karakterdir
        System.out.println("s2.isEmpty() = " + s2.isEmpty());
        
        String s3=""; //burda boşluk yok, o yüzden cevap true olur.
        System.out.println("s3.isEmpty() = " + s3.isEmpty());
        
        
        

    }
}
