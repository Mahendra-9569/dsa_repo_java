package dsa_repo_java;
import java.util.*;
/*  for solving element that appers once 
    we can use XOR operation
    bcz xor of same number is 0
    and xor of 0 and any number is that number
    for example 1^1 = 0
    0^1 = 1
 */

public class element_appear_once {
    public static int findElement(int arr[], int n) {
        int res = 0;
        for (int i = 0; i < n; i++) {
            res = res ^ arr[i];
        }
        System.out.println("Element that appears once is: " + res);
        return res;
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 1, 2, 3, 4, 5};
        int length = arr.length;

        int num = findElement(arr, length);

    }
}
