package S27graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;
import java.util.StringTokenizer;

public class Q7576_250823V2 {

    static int[][] arr;
    static int[][] visit;
    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, 1, -1};
    static int m, n;


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        m = Integer.parseInt(st.nextToken());
        n = Integer.parseInt(st.nextToken());

        arr = new int[n][m];
        visit = new int[n][m];
        Deque<List<Integer>> queue = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                visit[i][j] = -1;
            }
        }


        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr[i][j] == 1) {
                    queue.offerLast(List.of(i, j));
                    visit[i][j] = 0;
                }
            }
        }


        while (!queue.isEmpty()) {
            List<Integer> current = queue.pollFirst();
            int currentX = current.get(0);
            int currentY = current.get(1);

            for (int i = 0; i < 4; i++) {
                int nextX = currentX + dx[i];
                int nextY = currentY + dy[i];

                if (nextX < n && nextY < m && nextX >= 0 && nextY >= 0) {
                    if (arr[nextX][nextY] == 0 && visit[nextX][nextY] == -1) {
                        queue.offerLast(List.of(nextX, nextY));
                        visit[nextX][nextY] = visit[currentX][currentY] + 1;
                    }
                }
            }
        }

        int maxDay = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr[i][j] == 0 && visit[i][j] == -1) {
                    System.out.println(-1);
                    return;
                }

                maxDay = Math.max(maxDay, visit[i][j]);
            }
        }

        System.out.println(maxDay);

    }
}
