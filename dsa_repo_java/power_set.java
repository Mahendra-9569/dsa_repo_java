package dsa_repo_java;

public class power_set {
    
        public static void powerset(int n, int temp[]) {
            int pos = 0;
            while(n>0){
                pos++;
                if((n & 1) == 1) {
                    System.out.print(temp[pos-1] + " ");
                }
                
                n = n >> 1;
            }
    
        }
    
        public static void main(String[] args) {
            
            int n = 3;
            int temp[] = new int[n];
            temp[0] = 1;
            temp[1] = 2;
            temp[2] = 3;
            double num =Math.pow(2, n);
            for (int i  = 0; i<(int)num; i++) {
                powerset(i,temp);
                System.out.println();
            
            
            }
    
            
        }   
    
        
    }
    
    

