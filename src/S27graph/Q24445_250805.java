package S27graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Q24445_250805 {

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
        for (int i = 0; i <= n; i++) {
            list[i] = new ArrayList<>();
        }

        visited = new int[n+1];
        count = 0;

        for (int i = 0; i < m; i++) {
            StringTokenizer st2 = new StringTokenizer(br.readLine());
            int from = Integer.parseInt(st2.nextToken());
            int to = Integer.parseInt(st2.nextToken());

            list[from].add(to);
            list[to].add(from);
        }

        for (int i = 1; i <= n; i++) {
            Collections.sort(list[i], Collections.reverseOrder());
        }
        bfs(start);

        for (int i = 1; i <= n; i++) {
            System.out.println(visited[i]);
        }
    }

    static void bfs(int value){
        visited[value] = ++count;

        Deque<Integer> queue = new ArrayDeque<>();
        queue.offerLast(value);
        while(!queue.isEmpty()){
            int current = queue.pollFirst();

            for (int i = 0; i < list[current].size(); i++) {
                int next = list[current].get(i);
                if(visited[next] == 0){
                    visited[next] = ++count;
                    queue.offerLast(next);
                }
            }
        }
    }
}
