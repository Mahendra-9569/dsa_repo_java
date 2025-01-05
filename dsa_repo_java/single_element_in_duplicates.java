package dsa_repo_java;

public class single_element_in_duplicates {
    public static int singleNonDuplicate(int[] nums) {
        int s = 0;
        int e = nums.length-1;
        int mid;
        while(s<=e){
            mid = s+(e-s)/2;
            if(mid == 0||mid == nums.length-1){
                return nums[mid];
            }
            else{
                if((nums[mid]!=nums[mid+1])&&(nums[mid]!=nums[mid-1])){
                    return nums[mid];
                }
                else if((mid%2 != 0)&&(nums[mid]==nums[mid-1])){
                    s = mid+1;
                }
                else if((mid%2 == 0)&&(nums[mid]!=nums[mid-1])){
                    s = mid+1;
                }

                else{
                    e = mid-1;
                }
            }
     

        }

        return -1;

    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 3, 3, 4, 4, 8, 8};
        int result = singleNonDuplicate(nums);
        System.out.println("Single element in duplicates is: " + result);
    }
    
}
