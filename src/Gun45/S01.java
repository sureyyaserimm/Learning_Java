package Gun45;

public class S01 {
    public static void main(String[] args) {
        //bu kodun çıktısı nedir?
        String names[]={"Thomas","Peter","Joseph"};
        String pwd[]=new String[3];
        int idx=0;
        try {
            for (String n:names){
                pwd[idx]=n.substring(2,6); //2 dahil 6 hariç, 2-5 dahil
                System.out.println(pwd[idx]);
                idx++;
            }
        }catch (Exception e){
            System.out.println("Invalid Name");
        }
        //Cevap="omas Invalid Name"
        //Peter'a geldiği zaman hata vereceği için try-catch'e takılıyor bu yüzden kod çalışmayı durduruyor.
        //Eğer for(String n:names) try'ın dışında olsaydı sonuç "omas, Invalıd Name, seph" olurdu.
    }
}
