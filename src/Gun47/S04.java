package Gun47;

public class S04 {
    public static void main(String[] args) {
        //aşağıdaki kod parçasının çıktısı nedir?
        int n[][] = {{1, 3}, {2, 4}};
        //n.length = 2;
        for (int i = n.length - 1; i >= 0; i--) { // i = 1 0 değerlerini alır

            for (int y : n[i]) { //önce n[1] 2,4 sonra n[0] 1,3
                System.out.print(y);

            }
        }
    }
}
//cevap :2413 burada aslında satırları tersten yazdırıyor.
