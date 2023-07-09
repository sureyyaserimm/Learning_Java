package Gun45;

public class S03 {
    public static void main(String[] args) {
        //Bu kodun çıktısı nedir?
        String[] arr={"A","B","C","D"};
        for (int i = 0; i < arr.length; i++) {  //A'yı yazdırır
            System.out.println(arr[i]+" ");

            if (arr[i].equals("C")){            //ilk adımda burası çalışmaz
                continue;
            }
            System.out.println("Work Done");    //sonrasında bunu yazdırır
            break;                              //break olduğu  için başka bir şey yazdırmaz.
        }
    }

}
//Cevap = A Work Done
//burada break olmazsa sonuç = A Work Done B Work Done C D Work Done olurdu
