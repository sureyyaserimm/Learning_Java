package Gun44;

public class S06 {
    public static void main(String[] args) {
        //bu işlemin çıktısı nedir?
        int nums1[] = {1, 2, 3};
        int nums2[] = {1, 2, 3, 4, 5};

        nums2 = nums1;
        for (int x : nums2) {
            System.out.print(x + ":");
        }
    }
}
