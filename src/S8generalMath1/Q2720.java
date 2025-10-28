package S8generalMath1;

import java.util.Scanner;

public class Q2720 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        for(int i = 0; i < n; i++){
            int change = scanner.nextInt();
            int quarter = 0; //0.25
            int dime = 0; //0.1
            int nickel = 0; //0.05
            int penny = 0; //0.01

            if(change >= 25){
                quarter = change / 25;
                change = change % 25;
            }
            if(change >= 10){
                dime = change / 10;
                change = change % 10;
            }
            if(change >= 5){
                nickel = change / 5;
                change = change % 5;
            }
            penny = change;


            System.out.print(quarter + " " + dime + " " + nickel + " " + penny);
            System.out.println();
        }
    }
}
