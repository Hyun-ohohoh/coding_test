package class3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Q2606V2 {

    static int[] visited;
    static int n;
    static List<Integer>[] graph;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());

        graph = new ArrayList[n+1];
        for (int i = 0; i <= n; i++) {
            graph[i] = new ArrayList<>();
        }

        visited = new int[n+1];


        for (int i = 0; i < m; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int from = Integer.parseInt(st.nextToken());
            int to = Integer.parseInt(st.nextToken());

            graph[from].add(to);
            graph[to].add(from);
        }

        dfs(1);
        int count = 0;
        for (int i : visited) {
            if(i == 1){
                count++;
            }
        }

        System.out.println(count - 1);
    }

    static void dfs(int value){
        visited[value] = 1;
        for (int next : graph[value]) {
            if(visited[next] == 0){
                dfs(next);
            }
        }
    }

}
