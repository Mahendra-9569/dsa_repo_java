package dsa_repo_java;

public class number0f_pairing {
    public int xorAllNums(int[] nums1, int[] nums2) {
        int x = 0, y = 0;
        for (int a: nums1)
            x ^= a;
        for (int b: nums2)
            y ^= b;
        return (nums1.length % 2 * y) ^ (nums2.length % 2 * x);
    }
    public static void main(String[] args) {
        number0f_pairing np = new number0f_pairing();
        int[] nums1 = {1, 2, 3, 4, 5};
        int[] nums2 = {1, 2, 3, 4};
        System.out.println(np.xorAllNums(nums1, nums2));
        
    }
    
}
