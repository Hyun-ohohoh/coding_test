package S2cond;

import java.util.Scanner;

public class Q2884 {

    public static void main(String[] args) {
        int hour;
        int min;

        Scanner sc = new Scanner(System.in);
        hour = sc.nextInt();
        min = sc.nextInt();

        if (min >= 45) {
            min -= 45;
        } else {
            min += 60;
            min -= 45;
            hour -= 1;
            if (hour == -1) {
                hour = 23;
            }
        }

        System.out.println(hour + " " + min);
    }
}
