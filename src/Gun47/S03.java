package Gun47;

public class S03 {
    public static void main(String[] args) {
        //aşağıdaki kod parçasının çıktısı nedir?
        int n[][]={{1,3},{2,4}};
        //n.length = 2;
        for (int i = n.length-1; i >=0; i--) { // i = 1 0 değerlerini alır
            for (int j = n.length-1; j >=0 ; j--) { //n[1].length ve n[0].length j : 1 0 değerlerini alır
                System.out.println(n[i][j]);
            }
            //önce [1][1] [1][0], [0][1] [0][0]

        }
    }
}
 //cevap 4 2 3 1 , aslında diziyi tersten yazdırıyor
