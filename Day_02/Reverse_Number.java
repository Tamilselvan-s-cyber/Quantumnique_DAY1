package Day_02;
/*BLOCK 4 – PROBLEM SOLVING

Reverse a Number

Input
1234

Output
4321

*/

import java.util.Scanner;
public class Reverse_Number{
   public static void main(String[]args){
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int num =0;
      while(n!=0){
         int a = n % 10;
         num = (num * 10)+ a;
         n = n /10;
      }
      System.out.println(num);
   }
}