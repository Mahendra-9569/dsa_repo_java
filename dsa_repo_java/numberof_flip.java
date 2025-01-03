package dsa_repo_java;

public class numberof_flip {
    public static int minChanges(int n, int k) {
        if((n&k)!=k){
            return -1;
        }
        int count1 = 0;
        int count2 = 0;

    
        while (n > 0 ) {
           if((n&1) == 1){
            count1++;
           }
           if((k&1) == 1){
            count2++;
           }

            n >>= 1;
            k >>= 1;
        }

        return count1-count2;
    }
    public static void main(String[] args) {
     
        int n = 14;
        int k = 12;
        int result = minChanges(n,k);
        if(result == -1){
            System.out.println("Not possible");
        }
        else{
            System.out.println("Number of bits to be flipped to convert " + n + " to " + k + " are: " + result);
        }

    }
    
}
