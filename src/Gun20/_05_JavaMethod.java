package Gun20;

public class _05_JavaMethod {
    public static void main(String[] args) {
        int n1=4;
        int n2=12;
        int n3=34;

        int total1=findTotal(n1,n2);
        int total2=findTotal(n1,n2,n3);

        String name="Sureya";
        String surname="Serim";
        String total3=findTotal(name,surname);

        System.out.println(total1);
        System.out.println(total2);
        System.out.println(total3);

    }

    public static int findTotal(int n1,int n2) {
        return n1+n2;

    }

    public static int findTotal(int n1,int n2,int n3) {
        return n1+n2+n3;
    }

    public static String findTotal(String name,String surname) {
        return name+" "+surname;
    }


}
