package dsa_repo_java;

public class number_of_bits_to_be_flipped {
    public static int countBits(int a, int b) {
        int count = 0;
        int n = a ^ b;
        while (n > 0) {
            count += n & 1;
            n = n >> 1;
        }
        return count;
    }
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println("Number of bits to be flipped to convert " + a + " to " + b + " are: " + countBits(a, b));
    }
    
}
