package S27graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Q1697_250813 {

    static int[] time = new int[100001];

    static void bfs(int value1, int value2){

        Deque<Integer> queue = new ArrayDeque<>();
        queue.offerLast(value1);
        while(!queue.isEmpty()){
            int current = queue.pollFirst();

            if(current == value2){
                System.out.println(time[current]);
                break;
            }

            int x = current - 1;
            int y = current + 1;
            int z = current * 2;

            if(x >= 0 && x <= 100000 && time[x] == 0){
                time[x] = time[current] + 1;
                queue.offerLast(x);
            }

            if(y >= 0 && y <= 100000 && time[y] == 0){
                time[y] = time[current] + 1;
                queue.offerLast(y);
            }

            if(z >= 0 && z <= 100000 && time[z] == 0){
                time[z] = time[current] + 1;
                queue.offerLast(z);
            }




        }
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

       int n = Integer.parseInt(st.nextToken());
       int m = Integer.parseInt(st.nextToken());


       time[n] = 0;
       bfs(n, m);


    }
}
