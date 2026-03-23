/*
BLOCK 4 – PROBLEM SOLVING (Intermediate)

Move all zeros to end of array

Input:
[0,1,0,3,12]

Output:
[1,3,12,0,0]

Solve in O(n) time without extra array.
 */


package Day_07;

import java.util.*;

public class Problem_Solving {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
           arr[i] = sc.nextInt();
        }
        int val= 0;
        for(int i=0;i<n;i++){
            if(arr[i] != 0){
                arr[val] = arr[i];
                val++;
            }
        }
        while(val < n){
            arr[val] = 0;
            val++;
        }
        for(int num : arr){
           System.out.print(num + " ");
        }
    }
}
