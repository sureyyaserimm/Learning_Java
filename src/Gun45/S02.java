package Gun45;

public class S02 {
    public static void main(String[] args) {
        //bu kodun çıktısı nedir?
        String names[]={"Thomas","Peter","Joseph"};
        String pwd[]=new String[3];
        int idx=0;
        try {
            for (String n:names){
                pwd[idx]=n.substring(2,6); //2 dahil 6 hariç, 2-5 dahil
                idx++;
            }
        }catch (Exception e){
            System.out.println("Invalid Name");
        }
        for (String p:pwd) {
            System.out.println(p);
        }
    }
}
