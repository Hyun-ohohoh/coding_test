package class3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q7576 {

    static int m;
    static int n;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        String[] input = str.split(" ");


        m = Integer.parseInt(input[0]);
        n = Integer.parseInt(input[1]);

        int[][] arr = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        //while()



    }

    static void countDay(int[][] arr){

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(arr[i][j] == 1){
                    if(arr[i+1][j] == 0){
                        arr[i+1][j] = 1;
                    }

                    if(arr[i-1][j] == 0){
                        arr[i-1][j] = 1;
                    }

                    if(arr[i][j+1] == 0){
                        arr[i][j+1] = 1;
                    }

                    if(arr[i][j-1] == 0){
                        arr[i][j-1] = 1;
                    }


                }
            }
        }
    }
}