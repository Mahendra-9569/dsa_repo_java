package dsa_repo_java;

public class newbiwise_problem {
    public boolean doesValidArrayExist(int[] derived) {
        int n = derived.length;
        int[] arr = new int[n]; 
        if(n == 1){    
            return derived[0] == 0;
        }

        if(derived[0] == 1){
            arr[0] = 0;
            arr[1] = 1;
        }
        else{
            arr[0] = 0;
            arr[0] = 0;
        }

        for(int i = 1; i<n; i++){
            if(i == n-1){
                if(derived[i] == 1){
                    if( arr[i]== 1){
                        return arr[0] == 0;
                    }

                    else{
                        return arr[0] == 1;
                    }
                }

                else{
                    if(arr[i] == 1){
                        return arr[0] == 1;
                    }
                    else{
                        return arr[0] == 0;
                    }
                }
            }

            if(derived[i] == 1){
                if(arr[i] == 1){
                    arr[i+1] = 0;
                }
                else{
                    arr[i+1] = 1;
                }

            }

            else{
                if( arr[i] == 1 ){
                    arr[i+1] = 1;
                }
                else{
                     arr[i+1] = 0;
                }

            }

  
        }


         return true;

    }
    public static void main(String[] args) {
        newbiwise_problem np = new newbiwise_problem();
        int[] derived = {1, 0, 1, 0, 1, 0};
        System.out.println("Does valid array exist: ");
        System.out.println(np.doesValidArrayExist(derived));


          
        
    }
    
}
