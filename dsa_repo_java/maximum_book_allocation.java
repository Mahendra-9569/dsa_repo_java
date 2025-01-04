package dsa_repo_java;

public class maximum_book_allocation {
    public static int minPages(int[] arr, int n, int m) {
        int sum = 0;
        int max = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
            max = Math.max(max, arr[i]);
        }
        int low = max;
        int high = sum;
        int res = 0;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (isPossible(arr, n, m, mid)) {
                res = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return res;
    }

    public static boolean isPossible(int[] arr, int n, int m, int mid) {
        int student = 1;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
            if (sum > mid) {
                student++;
                sum = arr[i];
            }
            if (student > m) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr = { 12, 34, 67, 90 };
        int n = 4;
        int m = 2;
        int result = minPages(arr, n, m);
        System.out.println("Maximum number of pages allocated to a student are: " + result);
    }
    
}
