package S2cond;

import java.util.Scanner;

public class Q2525 {

    public static void main(String[] args){
        int hour;
        int min;
        int cooktime;

        Scanner sc = new Scanner(System.in);
        hour = sc.nextInt();
        min = sc.nextInt();
        cooktime = sc.nextInt();

        min += cooktime;

        if(min >= 60){
            hour += min / 60;
            min = min % 60;
        }

        if(hour >= 24){
            hour = hour - 24;
        }

        System.out.println(hour + " " + min);
    }
}
