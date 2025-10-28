package class3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q18111 {




    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);
        int inventory = Integer.parseInt(input[2]);

        int[][] house = new int[n][m];

        for (int i = 0; i < n; i++) {
            String[] str = br.readLine().split(" ");
            for (int j = 0; j < m; j++) {
                house[i][j] = Integer.parseInt(str[j]);
            }
        }

        int max = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(house[i][j] > max){
                    max = house[i][j];
                }
            }
        }



    }

    public void stackUp(int max, int level){
        int diff = max - level;

    }
}
