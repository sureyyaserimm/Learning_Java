package Gun27._01_Ornek;

public class JavaStaticandNonStaticMethods {
    public static void main(String[] args) {

        int number=345;
        String strNumber=String.valueOf(number);
        int intNumber=Integer.parseInt(strNumber);


        Utility utility=new Utility();
        String strNumber2=utility.getString(number);


        String strNumber3=Utility.getString2(number);
        //Static metodlar zaten var oldukları için
        // new ile yeni oluşturulmaya ihtiyaç duymazlar.
    }
}
