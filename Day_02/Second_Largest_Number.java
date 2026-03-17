package Day_02;
/*Practice Problem

Find the second largest number in the array

[5,8,2,10,7]

*/

import java.util.Scanner;
public class Second_Largest_Number{
   public static void main(String[]args){
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int a = 0 ;
      int b = 0 ;
      int []arr = new int[n];
      for(int i=0;i<n;i++){
         arr[i] = sc.nextInt();
      }
      if(arr[0]>arr[1]){
         a =arr[0];
         b =arr[1];
      }
      else if(arr[1]>arr[0]){
         a =arr[1];
         b =arr[0];
      }
      for(int i=2;i<n;i++){
         if(arr[i]>a){
            b = a;
            a = arr[i];
         }
         else if(arr[i]>b){
            arr[i] = b;
         }
      }
      System.out.println(b);
   }
}