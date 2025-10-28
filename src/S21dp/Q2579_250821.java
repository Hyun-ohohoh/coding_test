package S21dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2579_250821 {

    static int[] dp;
    static int[] arr;
    static int n;

    static void search(){
        dp[1] = arr[1];

        if(n >= 2){
            dp[2] = dp[1] + arr[2];
        }
        //dp[3] = Math.max(arr[1], arr[2]) + arr[3];
        //dp[4] = Math.max(dp[4-3] + arr[4-1] + arr[4], dp[4-2] + arr[4]);

        for (int i = 3; i <= n; i++) {
            dp[i] = Math.max(dp[i-3] + arr[i-1] + arr[i], dp[i-2] + arr[i]);
        }

    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        arr = new int[n+1];
        dp = new int[n+1];


        for (int i = 1; i <= n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        search();
        System.out.println(dp[n]);

    }

}
