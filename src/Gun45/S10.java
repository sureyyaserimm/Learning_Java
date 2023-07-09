package Gun45;

public class S10 {
    public static void main(String[] args) {
        //bu kod parçasının çıktısı nedir?
        String[][] arr = {{"A", "B", "C"}, {"D", "E"}};

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {

                System.out.print(arr[i][j] + " ");

                if (arr[i][j].equals("B")) {
                    continue; //eğer burada break olsaydı Bye denk geldiğinde döngü kırılırdı ve Cyi yazdırmazdı
                    //cevap A B D E olurdu.Sonraki soruda break var.
                }
            }
            continue; //etkisiz çünkü kendinde sonra gelen kod yok.
            // eğer burada bir break daha olsaydı
            //if(arr[i][j].equals("D")) {break;} o zaman sadece A B yazardı.
        }
    }
}
//A B C D E
