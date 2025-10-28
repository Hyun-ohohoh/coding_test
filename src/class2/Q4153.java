package class2;

import java.util.Scanner;

public class Q4153 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int [3];
        while(true){
            for(int i = 0; i < 3; i++){
                arr[i] = sc.nextInt();
            }

            if(arr[0] == 0 && arr[1] == 0 && arr[2] == 0){
                break;
            }

            int max = arr[0];
            if(arr[0] < arr[1]){
                max = arr[1];
                if(arr[1] < arr[2]){
                    max = arr[2];
                }
            } else if(arr[0] < arr[2]){
                max = arr[2];
            }

            if(max == arr[0]){
                if(arr[2] * arr[2] + arr[1] * arr[1] == max * max){
                    System.out.println("right");
                } else {
                    System.out.println("wrong");
                }
            } else if (max == arr[1]){
                if(arr[0] * arr[0] + arr[2] * arr[2] == max * max){
                    System.out.println("right");
                } else {
                    System.out.println("wrong");
                }
            } else if (max == arr[2]){
                if(arr[0] * arr[0] + arr[1] * arr[1] == max * max){
                    System.out.println("right");
                } else {
                    System.out.println("wrong");
                }
            }



        }



    }
}
