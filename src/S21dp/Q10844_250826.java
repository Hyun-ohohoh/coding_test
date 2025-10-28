package S21dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q10844_250826 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        long[] dp = new long[n + 1];

        //1 2 3 4 5 6 7 8 9
        //2 2 2 2 2 2 2 2 1

        //10 23 34 45 56 67 78  89  1
        //2  2  2  2  2  2  2
        //12 21 32 43 54 65 76  87 2  98 2

        //101 898
        //2개  2개

        //1010 1012 8987 8989
        //1개   2개  2개   1개


        dp[1] = 9;
        if (n > 1) {
            dp[2] = 2 * 9 - 1;
            for (int i = 3; i <= n; i++) {
                if (i % 2 == 0) {
                    dp[i] = dp[i - 1] * 2 - 2;
                } else {
                    dp[i] = dp[i - 1] * 2;
                }

            }
        }


        long result = dp[n] % (1000000000);
        System.out.println(result);


        //안해
        //오늘 너 생일인데 내가 어떻게 공부를 하겠어
        //빨리 피자먹으러 ㅏㄱ자 배고파아아ㅏ아아아ㅏ아아ㅏ악
    }
}
