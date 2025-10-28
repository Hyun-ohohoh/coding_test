package class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1018 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] str = br.readLine().split(" ");
        int n = Integer.parseInt(str[0]);
        int m = Integer.parseInt(str[1]);

        char[][] board = new char[n][m];
        for(int i = 0; i < n; i++){
            board[i] = br.readLine().toCharArray();
        }

        int min = 64;

        for(int i = 0; i <= n - 8; i++){
            for(int j = 0; j <= m - 8; j++){
                int count1 = 0; //왼쪽 맨 위 W
                int count2 = 0; //왼쪽 맨 위 B

                for(int x = 0; x < 8; x++){
                    for(int y = 0; y < 8; y++){
                        char current = board[i+x][j+y];
                        if((x + y) % 2 == 0){
                            if(current == 'B') count1++;
                            if(current == 'W') count2++;
                        } else {
                            if(current == 'W') count1++;
                            if(current == 'B') count2++;
                        }
                    }
                }
                int localmin = Math.min(count1, count2);
                min = Math.min(min, localmin);
            }
        }

        System.out.println(min);

    }
}
