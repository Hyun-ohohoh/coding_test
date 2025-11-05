package S27graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Q13023_251029 {

    static int n;
    static int m;
    static boolean[] visited;
    static List<Integer>[] adj;
    static boolean arrived;

    static void dfs(int node, int depth){

        if(depth == 4){
            arrived = true;
            return;
        }

        if(arrived) {
            return;
        }

        visited[node] = true;

        for (Integer neighbor : adj[node]) {
            if(!visited[neighbor]){
                dfs(neighbor, depth + 1);
            }
        }

        visited[node] = false;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        visited = new boolean[n+1];

        adj = new ArrayList[n+1];
        for(int i = 0; i <= n; i++){
            adj[i] = new ArrayList<>();
        }

        for(int i = 0; i < m; i++){
            st = new StringTokenizer(br.readLine());
            int from = Integer.parseInt(st.nextToken());
            int to = Integer.parseInt(st.nextToken());
            adj[from].add(to);
            adj[to].add(from);
        }

        for (int i = 0; i < n; i++) {
            if (!arrived) {
                dfs(i, 0);
            } else {
                break;
            }
        }

        if(arrived){
            System.out.println("1");
        } else {
            System.out.println("0");
        }

    }
}
