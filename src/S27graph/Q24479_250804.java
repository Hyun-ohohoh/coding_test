package S27graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Q24479_250804 {

    static List<Integer>[] list;
    static int[] visited;
    static int count;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int start = Integer.parseInt(st.nextToken());

        list = new ArrayList[n+1];
        visited = new int[n+1];
        count = 0;
        for (int i = 1; i <= n; i++) {
            list[i] = new ArrayList<>();
        }

        for (int i = 0; i < m; i++) {
            StringTokenizer st2 = new StringTokenizer(br.readLine());
            int from = Integer.parseInt(st2.nextToken());
            int to = Integer.parseInt(st2.nextToken());
            list[from].add(to);
            list[to].add(from);
        }

        for (int i = 1; i <= n; i++) {
            Collections.sort(list[i]);
        }

        dfs(start);

        for (int i = 1; i <= n; i++) {
            System.out.println(visited[i]);
        }

    }

    static void dfs(int value){
        visited[value] = ++count;

        for (int i = 0; i < list[value].size(); i++) {
            int child = list[value].get(i);

            if(visited[child] == 0){
                dfs(child);
            }
        }

    }
}
