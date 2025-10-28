package S27graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Q2178_250810 {

    static int[][] arr;
    static int[][] visited;
    static int n, m;

    static int[] dx = { -1, 1, 0, 0 };
    static int[] dy = { 0, 0, -1, 1 };

    static void bfs(int startX, int startY){
        Deque<int[]> queue = new ArrayDeque<>();
        queue.offerLast(new int[] {startX, startY});
        visited[startX][startY] = 1;

        while(!queue.isEmpty()){
            int[] current = queue.pollFirst();
            int x = current[0];
            int y = current[1];

            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                if(x == n && y == m){
                    return;
                }

                if(nx < 1 || ny < 1 || nx > n || ny > m){
                    continue;
                }

                if (arr[nx][ny] == 0 || visited[nx][ny] != 0) {
                    continue;
                }


                visited[nx][ny] = visited[x][y] + 1;
                queue.offerLast(new int[]{nx, ny});
            }

        }

    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        arr = new int[n+1][m+1];
        visited = new int[n+1][m+1];

        for (int i = 1; i <= n; i++) {
            String input = br.readLine();
            for (int j = 1; j <= m; j++) {
                arr[i][j] = input.charAt(j-1) - '0';
            }
        }

        bfs(1,1);
        System.out.println(visited[n][m]);

    }
}
