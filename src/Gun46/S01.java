package Gun46;

public class S01 {
    public static void main(String[] args) {
        //bu kod parçasının çıktısı nedir?

        String[][] arr = {{"A", "B", "C"}, {"D", "E"}};

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {

                System.out.print(arr[i][j] + " ");

                if (arr[i][j].equals("B")) {
                    break;   // Bye denk geldiğinde döngü kırıldı ve Cyi yazdırmadı

                }
            }
            continue; //etkisiz çünkü kendinde sonra gelen kod yok.
            // eğer burada bir break daha olsaydı
            //if(arr[i][j].equals("D")) {break;} o zaman sadece A B yazardı.
        }
    }
}
//cevap A B D E olur.