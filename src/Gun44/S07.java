package Gun44;

import java.util.Arrays;

public class S07 {
    public static void main(String[] args) {
        int[] intArr={15,30,45,60,75};
        intArr[2]=intArr[4];
        intArr[4]=90;
        //bu işlemlerden sonra dizinin yeni hali nasıl olur?
        System.out.println(Arrays.toString(intArr)); //[15, 30, 75, 60, 90]
    }
}
