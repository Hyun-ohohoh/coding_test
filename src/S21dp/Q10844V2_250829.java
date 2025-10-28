package S21dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q10844V2_250829 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        long[][] dp = new long[n+1][10];
        long MOD = 1_000_000_000;

        for (int i = 1; i <= 9; i++) {
            dp[1][i] = 1;
        }

        for (int i = 2; i <= n; i++) {
            for (int j = 0; j <= 9; j++) {
                if(j == 0){
                    //맨 뒤에 0이면, 그 앞은 1
                    dp[i][j] = dp[i-1][1] % MOD;
;               } else if(j == 9){
                    //맨 뒤가 9면, 그 앞은 8
                    dp[i][j] = dp[i-1][8] % MOD;
                } else {
                    dp[i][j] = (dp[i-1][j-1] + dp[i-1][j+1]) % MOD;
                }
            }
        }

        long result = 0;
        for (int i = 0; i <= 9; i++) {
            result += dp[n][i];
            result %= MOD;
        }

        System.out.println(result);



    }
}
