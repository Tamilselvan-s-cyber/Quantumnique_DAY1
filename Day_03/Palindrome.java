/*BLOCK 4 – PROBLEM SOLVING

Check if a number is palindrome.

Example

Input: 121
Output: True

Input: 123
Output: False
*/

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        int n1 = 0;
        int n2= a.length() - 1;
        boolean isPalindrome = true;
        while (n1 < n2) {
            if (a.charAt(n1) != a.charAt(n2)) {
                isPalindrome = false;
                break;
            }
            n1++;
            n2--;
        }
        System.out.println(isPalindrome);
    }
}