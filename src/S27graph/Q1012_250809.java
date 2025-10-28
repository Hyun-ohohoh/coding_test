package S27graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1012_250809 {

    static int[][] arr;
    static int[][] visited;
    static int x, y;
    static int m, n, k;


    static void dfs(int x, int y){
        visited[x][y] = 1;

        if(x+1 < m && arr[x+1][y] == 1 && visited[x+1][y] == 0 ){
            dfs(x+1, y);
        }

        if(x-1 >= 0 && arr[x-1][y] == 1 && visited[x-1][y] == 0){
            dfs(x-1, y);
        }

        if(y+1 < n && arr[x][y+1] == 1 && visited[x][y+1] == 0){
            dfs(x, y+1);
        }

        if(y-1 >= 0 && arr[x][y-1] == 1 && visited[x][y-1] == 0){
            dfs(x, y-1);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            m = Integer.parseInt(st.nextToken());
            n = Integer.parseInt(st.nextToken());
            k = Integer.parseInt(st.nextToken());

            arr = new int[m][n];
            visited = new int[m][n];
            int count = 0;

            for (int j = 0; j < k; j++) {
                StringTokenizer st2 = new StringTokenizer(br.readLine());
                x = Integer.parseInt(st2.nextToken());
                y = Integer.parseInt(st2.nextToken());

                arr[x][y] = 1;
            }

            for (int j = 0; j < m; j++) {
                for (int l = 0; l < n; l++) {
                    if(arr[j][l] == 1){
                        if(visited[j][l] == 0){
                            dfs(j, l);
                            count++;
                        }
                    }
                }
            }

            sb.append(count).append("\n");

        }

        System.out.println(sb);


    }
}
