package S7array2;

import java.util.Scanner;

public class Q2563 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [][] arr = new int[100][100];

        int paper = sc.nextInt();
        int count = 0;
        sc.nextLine();
        for(int i = 0; i < paper; i++){
            int row = sc.nextInt();
            int col = sc.nextInt();

            for(int j = row; j < row + 10 && j < 100; j++){
                for(int k = col; k < col + 10 && k < 100; k++){
                    if(arr[j][k] == 0) {
                        arr[j][k] = 1;
                        count++;
                    }
                }
            }
        }

        System.out.println(count);
    }
}
