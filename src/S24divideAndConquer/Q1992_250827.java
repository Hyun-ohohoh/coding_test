package S24divideAndConquer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1992_250827 {

    static int n;
    static int[][] arr;
    static StringBuilder sb;

    static void press(int x, int y, int n){
        int value = arr[x][y];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(arr[i+x][j+y] != value){
                    sb.append("(");
                    press(x, y, n/2);
                    press(x, y + n/2, n/2);
                    press(x + n/2, y, n/2);
                    press(x + n/2, y + n/2, n/2);
                    sb.append(")");
                    return;
                }
            }
        }

        if(value == 0){
            sb.append("0");
        }

        if(value == 1){
            sb.append("1");
        }
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        arr = new int[n][n];
        sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            String input = br.readLine();
            for (int j = 0; j < n; j++) {
                arr[i][j] = Integer.parseInt(String.valueOf(input.charAt(j)));
            }
        }

        press(0, 0, n);
        System.out.println(sb);
    }
}
