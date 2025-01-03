package dsa_repo_java;

public class total_setbit_from1ton {
    public static int countSetBits(int n) {
        int count = 0;
        while (n > 0) {
            count += n & 1;
            n = n >> 1;
        }
        return count;
   
    }
    public static void main(String[] args) {
        int n = 10;
        int count = 0;
        for (int i = 1; i <= n; i++) {
            count += countSetBits(i);
        }
        System.out.println("Total set bits from 1 to " + n + " are: " + count);
    }   
    
}
