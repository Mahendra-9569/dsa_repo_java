package dsa_repo_java;

public class prifixsubarray_ofAB {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int n = A.length;
        int[] result = new int[n];
        int[] count = new int[n+1]; 

        int commonCount = 0;

        for (int i = 0; i < n; i++) {
            
            count[A[i]]++;
            if (count[A[i]] == 2) {
                commonCount++;
            }

        
            count[B[i]]++;
            if (count[B[i]] == 2) {
                commonCount++;
            }

            
            result[i] = commonCount;
        }

        return result;
    }
    public static void main(String[] args) {
        prifixsubarray_ofAB ps = new prifixsubarray_ofAB();
        int[] A = {1,2,3,4};
        int[] B = {1,4,2,3};
        int[] result = ps.findThePrefixCommonArray(A, B);
        for (int i : result) {
            System.out.print(i + " ");
        }
        
    }
    
}
