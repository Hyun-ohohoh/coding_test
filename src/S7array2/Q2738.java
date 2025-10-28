package S7array2;

import java.util.Scanner;

public class Q2738 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] arr1 = new int[n][m];

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                arr1[i][j] = sc.nextInt();
            }
        }

        int[][] arr2 = new int[n][m];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                arr2[i][j] = sc.nextInt();
            }
        }

        int[][] answer = new int[n][m];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                answer[i][j] = arr1[i][j] + arr2[i][j];
                System.out.print(answer[i][j] + " ");
            }
            System.out.println();
        }

    }
}
