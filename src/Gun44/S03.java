package Gun44;

public class S03 {
    public static void main(String[] args) {
        int[] stack={1,2,3};
        int size=3;
        int idx=0;

        do {
            idx++;
        }while (idx<size-1); //bize sonucu 30 vermesi için uygun olan seçenekteki çözüm buydu.


        System.out.println("The Top element ="+ stack[idx]);
    }
}
