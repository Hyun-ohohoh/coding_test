package class3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Q1260 {

    static List<Integer>[] list;
    static int[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");

        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);
        int v = Integer.parseInt(input[2]);

        list = new ArrayList[n + 1];
        for(int i = 1; i <= n; i++){
            list[i] = new ArrayList<>();
        }

        for(int i = 0; i < m; i++){
            String[] str = br.readLine().split(" ");
            int start = Integer.parseInt(str[0]);
            int end = Integer.parseInt(str[1]);
            list[start].add(end);
            list[end].add(start);
        }

        for(int i = 1; i <= n; i++){
            Collections.sort(list[i]);
        }

        visited = new int[n + 1];
        dfs(v);
        System.out.println();

        visited = new int[n + 1];
        bfs(v);


    }

    static void dfs(int node){
        visited[node] = 1;
        System.out.print(node + " ");

        for(int i : list[node]){
            if(visited[i] != 1){
                dfs(i);
            }
        }
    }

    static void bfs(int node){
        Deque<Integer> deque = new ArrayDeque<>();
        visited[node] = 1;
        deque.offer(node);

        while(!deque.isEmpty()){
            int current = deque.poll();
            System.out.print(current + " ");

            for (Integer i : list[current]) {
                if(visited[i] != 1){
                    visited[i] = 1;
                    deque.offer(i);
                }
            }

        }

    }
}
