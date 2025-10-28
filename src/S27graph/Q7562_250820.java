package S27graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;
import java.util.StringTokenizer;

public class Q7562_250820 {

    static int[] knight;
    static int[] dest;
    static int[][] visited;
    static int l;
    static int[] dx = {-2, -2, 1, -1, 2, 2, -1, 1};
    static int[] dy = {1, -1, 2, 2, 1, -1, -2, -2};

    static int search(int[] knight, int[] dest){
        Deque<List<Integer>> queue = new ArrayDeque<>();
        queue.offerLast(List.of(knight[0], knight[1], 0));
        visited[knight[0]][knight[1]] = 1;

        while(!queue.isEmpty()){
            List<Integer> current = queue.pollFirst();
            int currentX = current.get(0);
            int currentY = current.get(1);
            int currentCount = current.get(2);

            for (int i = 0; i < 8; i++) {
                int nextX = currentX + dx[i];
                int nextY = currentY + dy[i];

                if(nextX >= 0 && nextY >= 0 && nextX < l && nextY < l){

                    if(visited[nextX][nextY] == 0){
                        if(nextX == dest[0] && nextY == dest[1]){
                            return currentCount + 1;
                        }

                        visited[nextX][nextY] = 1;
                        queue.offer(List.of(nextX, nextY, currentCount + 1));
                    }
                }
            }
        }
        return 0;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            l = Integer.parseInt(br.readLine());
            visited = new int[l][l];

            StringTokenizer st = new StringTokenizer(br.readLine());
            knight = new int[2];
            knight[0] = Integer.parseInt(st.nextToken());
            knight[1] = Integer.parseInt(st.nextToken());

            st = new StringTokenizer(br.readLine());
            dest = new int[2];
            dest[0] = Integer.parseInt(st.nextToken());
            dest[1] = Integer.parseInt(st.nextToken());

            if(knight[0] == dest[0] && knight[1] == dest[1]){
                System.out.println("0");
                continue;
            }

            System.out.println(search(knight, dest));

         }
    }
}
