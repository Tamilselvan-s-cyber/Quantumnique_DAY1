/*Find first repeating element in array

Input:
[1,2,3,4,2,5,3]

Output:
2
*/

package Day_05;

import java.util.*;

public class First_repeating_element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int num = -1;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]==arr[j]){
                    num=arr[i];
                    break;
                }
            }
            if (num != -1){
                 break;
            }
        }

        if (num != -1) {
            System.out.println( num);
        }
    }
}