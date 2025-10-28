package S27graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;
import java.util.StringTokenizer;

public class Q7576_250823 {

    static int[][] arr;
    static int[][] visit;
    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, 1, -1};
    static int m, n;
    static int day;

    static void bfs(int x, int y){
        visit[x][y] = 1;
        Deque<List<Integer>> queue = new ArrayDeque<>();
        queue.offerLast(List.of(x, y));

        while (!queue.isEmpty()){
            List<Integer> current = queue.pollFirst();
            int currentX = current.get(0);
            int currentY = current.get(1);

            if(check(visit)){
                return;
            }

            if(visit[currentX][currentY] == 0){
                visit[currentX][currentY] = 1;

                for (int i = 0; i < 4; i++) {
                    int nextX = currentX + dx[i];
                    int nextY = currentY + dy[i];

                    if(nextX < m && nextY < n && nextX >= 0 && nextY >= 0){
                        if(arr[nextX][nextY] == 0){
                            queue.offerLast(List.of(nextX, nextY));
                            ++day;
                        }
                    }
                }
            }

        }

    }

    static boolean check(int[][] visit){

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(visit[i][j] == 0){
                    return false;
                }
            }
        }

        return true;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        m = Integer.parseInt(st.nextToken());
        n = Integer.parseInt(st.nextToken());

        arr = new int[n][m];
        visit = new int[n][m];


        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(arr[i][j] == 1){
                    bfs(i,j);
                }
            }
        }

        System.out.println(day);


    }
}
