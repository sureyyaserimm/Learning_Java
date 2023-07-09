package Gun47;

public class S02 {
    public static void main(String[] args) {
        //hangi kodun çıktısı red:blue:small:medium şeklinde olur?
        String shirts[][]=new String[2][2];
        shirts[0][0]="red";
        shirts[0][1]="blue";
        shirts[1][0]="small";
        shirts[1][1]="medium";

        //A şıkkı: medium yazdırır çünkü sadece 1 1 değeri alır
        for (int index=1;index<2;index++){
            for (int idx=1;idx<2;idx++){
                System.out.println(shirts[index][idx]+":");
            }
        }

        //B şıkkı :small yazar
        for (int index=0;index<2;++index){
            for (int idx=0;idx<index;++idx){
                System.out.println(shirts[index][idx]+":");
            }
        }

        //C şıkkı
        for (String[]c : shirts){ //shirts içindeki satırları al
            for (String s : c){
                System.out.println(s+":");
            }
        }
        //D şıkkı
        for (int index=0;index<2;++index){
            for (int idx=0;idx<index;++idx){
                System.out.println(shirts[index][idx]+":");
            }
        }

    }
}
//// a şıkkı sadece medium yazar çünkü direk 1 değerinden başlıyor
// //b şıkkı idx<index demiş sadece small yazar 0 çalışmaz sadece 1 0 çalışır o yüzden small yazar
// //d şıkkı 2 ye eşitleme işlemi yapmış taşma var : 0-0 ken çalışır,0-1 ken çalışır amaa ---> 0-2 olmadığı için taşma olur....
