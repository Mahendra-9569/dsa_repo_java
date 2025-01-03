package dsa_repo_java;

public class count_setbit {
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
        int count = countSetBits(n);
        System.out.println("Total set bits in " + n + " are: " + count);
    }
    
}
