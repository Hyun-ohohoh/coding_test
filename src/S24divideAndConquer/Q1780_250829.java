package S24divideAndConquer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1780_250829 {

    static int[][] arr;
    static int n;
    static int countMinus1 = 0;
    static int count0 = 0;
    static int count1 = 0;

    static void search(int row, int col, int n){
        int value = arr[row][col];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(arr[row+i][col+j] != value){
                    search(row, col, n/3);
                    search(row, col+n/3, n/3);
                    search(row, col+(n/3) * 2, n/3);

                    search(row+(n/3), col, n/3);
                    search(row+(n/3), col+(n/3), n/3);
                    search(row+(n/3), col+(n/3) * 2, n/3);

                    search(row+(n/3)*2, col, n/3);
                    search(row+(n/3)*2, col+(n/3), n/3);
                    search(row+(n/3)*2, col+(n/3)*2, n/3);

                    return; //중요, 왜 중요한지 이해
                }
            }
        }

        if(value == -1){
            ++countMinus1;
        }

        if(value == 0){
            ++count0;
        }

        if(value == 1){
            ++count1;
        }
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        search(0, 0, n);
        System.out.println(countMinus1);
        System.out.println(count0);
        System.out.println(count1);
    }
}
