package class2;

import java.util.*;

public class Q1978 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int count = 0;

        for(int i = 0; i < n; i++){
            int num = sc.nextInt();
            if(isPrime(num)){
                count++;
            }
        }

        System.out.println(count);
    }

    private static boolean isPrime(int num){
        if (num <= 1){
            return false;
        }

        if(num == 2){
            return true;
        }

        if(num % 2 == 0){
            return false;
        }

        for(int j = 3; j <= Math.sqrt(num); j += 2){
            if(num % j == 0){
                return false;
            }
        }
        return true;
    }


}
