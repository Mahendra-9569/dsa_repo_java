import java.util.ArrayList;
import java.util.List;

public class candiesProblem {
    
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = candies[0];
        int  can = 0;
      ArrayList<Boolean> list = new  ArrayList<>();
       for(int  i = 0;i<candies.length;i++){
        if( max<=candies[i]){
            max = candies[i];
        }
       }

       for(int i = 0;i<candies.length;i++){
        can = candies[i]+extraCandies;
        if(can>=max){
        list.add(true);
       }
       else{
        list.add(false);
       }
    }
    return list;
    
}
    public static void main(String[] args) {
        candiesProblem cp = new candiesProblem();
        int[] candies = {2,3,5,1,3};
        int extraCandies = 3;
        System.out.println(cp.kidsWithCandies(candies, extraCandies));
        
    }
    
}
