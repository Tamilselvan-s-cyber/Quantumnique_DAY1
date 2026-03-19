package Day_04;

import java.util.Scanner;

public class First_non_repeating_number {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        for(int i=0;i<n.length();i++){
            int c = 0;
            for(int j=0;j<n.length();j++){
                if (n.charAt(i) == n.charAt(j)){
                    c++;
                }
            }
            if(c == 1) {
                System.out.println(n.charAt(i));
                return;
            }
        }
        System.out.println(n);
    }
}


