package dsa_repo_java;

public class count_setbit_position {
    
        public static void findPosition(int n) {
     
            int pos = 0;
            int count = 0;
            while (n > 0) {
               if((n & 1) == 1) {
                   count++;
                   System.out.println("position of set bit is: " + pos);
               }
               pos++;
               n = n >> 1;
            }
            if (count == 0) {
                System.out.println("Set bit not found");
            }
        }
        public static void main(String[] args) {
            int n = 15;
            findPosition(n);
           
        }
        
    }
    

