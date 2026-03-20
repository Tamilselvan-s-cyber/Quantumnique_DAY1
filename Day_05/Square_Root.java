/*Practice Problem

Find square root of a number using binary search

*/


package Day_05;

import java.util.*;

public class Square_Root{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 0;
        while(i*i<=n){
            i++;
        }
        System.out.println(i - 1);
    }
}
