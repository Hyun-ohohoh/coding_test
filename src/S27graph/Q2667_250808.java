package S27graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Q2667_250808 {

    static int[][] arr;
    static int[][] visited;
    static int count;
    static int n;

    static void dfs(int x, int y){
        visited[x][y] = 1;
        ++count;

        if(y+1 < n && arr[x][y+1] == 1 && visited[x][y+1] == 0){
            dfs(x, y+1);
        }

        if(y-1 >= 0 && arr[x][y-1] == 1 && visited[x][y-1] == 0){
            dfs( x, y-1);
        }

        if(x+1 < n && arr[x+1][y] == 1 && visited[x+1][y] == 0){
            dfs( x+1, y);
        }

        if(x-1 >= 0 && arr[x-1][y] == 1 && visited[x-1][y] == 0){
            dfs( x-1, y);
        }

    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        arr = new int[n][n];
        visited = new int[n][n];
        count = 0;
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String input = br.readLine();
            for (int j = 0; j < n; j++) {
                arr[i][j] = input.charAt(j) - '0';
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(arr[i][j] == 1){
                    if(visited[i][j] == 0){
                        count = 0;
                        dfs(i, j);
                        result.add(count);
                    }
                }
            }
        }

        Collections.sort(result);

        StringBuilder sb = new StringBuilder();
        sb.append(result.size()).append("\n");

        for (int i = 0; i < result.size(); i++) {
            sb.append(result.get(i)).append("\n");
        }

        System.out.println(sb);


    }
}
