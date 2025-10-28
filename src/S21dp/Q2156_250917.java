package S21dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2156_250917 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n+1];
        int[] dp = new int[n+1];

        for(int i = 1; i <= n; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        dp[1] = arr[1];
        if(n >= 2){
            dp[2] = dp[1] + arr[2];
            if(n >= 3){
                dp[3] = Math.max(dp[1] + arr[3], arr[2] + arr[3]);
                dp[3] = Math.max(dp[3], dp[2]);
            }
        }


        for(int i = 4; i <= n; i++){
            dp[i] = Math.max(dp[i-2] + arr[i] , dp[i-3] + arr[i-1] + arr[i]);
            dp[i] = Math.max(dp[i], dp[i-1]);
        }

        int max = 0;
        for(int i = 0; i <= n; i++){
            if(dp[i] > max){
                max = dp[i];
            }
        }

        System.out.println(max);

    }

}
