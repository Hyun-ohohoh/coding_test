package S7array2;

import java.util.Scanner;

public class Q2566 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [][] arr = new int [9][9];

        for(int i = 0; i < 9; i++){
            for(int j = 0; j < 9; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        int max = arr[0][0];
        int maxCol = 1; //다 0인 경우 1,1이 나와야 함
        int maxRow = 1;
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                if(arr[i][j] > max){
                    max = arr[i][j];
                    maxRow = i + 1;
                    maxCol = j + 1;
                }
            }
        }

        sc.close();


        System.out.println(max);
        System.out.println(maxRow + " " + maxCol);
    }
}
