package S21dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1463_250826 {

    static int[][] dp;

    static void search(int value, int count) {

        if (value % 3 == 0) {
            dp[count][0] = value / 3;
            if (dp[count][0] == 1) {
                System.out.println(count);
                return;
            }
        }

        if (value % 2 == 0) {
            dp[count][1] = value / 2;
            if (dp[count][1] == 1) {
                System.out.println(count);
                return;
            }
        }

        dp[count][2] = value - 1;
        if (dp[count][2] == 1) {
            System.out.println(count);
            return;
        }

    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        dp = new int[3][100000];

        int count = 1;
        search(n, count);
        search(dp[1][0], ++count);
        search(dp[1][1], ++count);
        search(dp[1][2], ++count);

    }
}
