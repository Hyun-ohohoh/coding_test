package S21dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Q1932_250820 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        List<List<Integer>> triangle = new ArrayList<>();
        int[][] dp = new int[n][n];

        for (int i = 0; i < n; i++) {
            triangle.add(new ArrayList<>());
        }

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            while(st.hasMoreTokens()){
                triangle.get(i).add(Integer.parseInt(st.nextToken()));
            }
        }

        dp[0][0] = triangle.get(0).get(0);
        for (int i = 1; i < triangle.size(); i++) {
            for (int j = 0; j < triangle.get(i).size(); j++) {
                int value = triangle.get(i).get(j);

                if(j == 0){
                    dp[i][j] = dp[i-1][0] + value;
                } else if(j == i){
                    dp[i][j] = dp[i-1][j-1] + value;
                } else {
                    dp[i][j] = Math.max(dp[i-1][j-1], dp[i-1][j]) + value;
                }
            }
        }

        int max = 0;
        for (int i = 0; i < n; i++) {
            if(dp[n-1][i] > max){
                max = dp[n-1][i];
            }
        }

        System.out.println(max);





    }
}
