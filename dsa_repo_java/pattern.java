package dsa_repo_java;

public class pattern {
    public static void main(String[] args) {
        int n = 3;
        int space = 0;
        int temp = 0;
        for (int i = 0; i<n; i++){
            for(int j =  0; j<n; j++){
                for(int k = 0; k<temp; k++){
                    System.out.print(" ");
                }
                for(int l = 0; l<=j; l++){
                    System.out.print("*");
                    space++;
                }
                System.out.println();

            }
          
            temp = space;
        }
    }
    
}
