package class2;

import java.util.*;

public class Q2231 {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] parts = str.split("");

        int sum = 0;
        for(String s : parts){
            sum += Integer.parseInt(s);
        }

        System.out.println(sum);

    }
}
