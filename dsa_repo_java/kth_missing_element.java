package dsa_repo_java;

public class kth_missing_element {
    public static int kthMissing(int[] arr, int k) {
        int low = 0;
        int high = arr.length;
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] - mid - 1 < k) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return low + k;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 3, 4, 7, 11 };
        int k = 5;
        int result = kthMissing(arr, k);
        System.out.println("Kth missing element is: " + result);
    }
    
}
