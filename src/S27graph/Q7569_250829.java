package S27graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Q7569_250829 {

    static int row;
    static int col;
    static int height;
    static int[][][] arr;
    static int[][][] visited;
    static int[][][] total;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        col = Integer.parseInt(st.nextToken());
        row = Integer.parseInt(st.nextToken());
        height = Integer.parseInt(st.nextToken());

        arr = new int [height][row][col];
        visited = new int[height][row][col];
        total = new int[height][row][col];

        int[] dx = new int[] {1, -1, 0, 0, 0, 0};
        int[] dy = new int[] {0, 0, 1, -1, 0, 0};
        int[] dz = new int[] {0, 0, 0, 0, 1, -1};


        Deque<int[]> queue = new ArrayDeque<>();

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < row; j++) {
                for (int k = 0; k < col; k++) {
                    visited[i][j][k] = -1;
                }
            }
        }
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < row; j++) {
                st = new StringTokenizer(br.readLine());
                for (int k = 0; k < col; k++) {
                    arr[i][j][k] = Integer.parseInt(st.nextToken());
                }
            }
        }



        for (int i = 0; i < height; i++) {
            for (int j = 0; j < row; j++) {
                for (int k = 0; k < col; k++) {
                    if (arr[i][j][k] == 1) {
                        queue.offerLast(new int[]{i, j, k});
                        visited[i][j][k] = 0;
                    }
                }
            }
        }



        while(!queue.isEmpty()){
            int[] current = queue.pollFirst();
            int currentH = current[0];
            int currentR = current[1];
            int currentC = current[2];

            for (int i = 0; i < 6; i++) {
                int nextH = currentH + dz[i];
                int nextR = currentR + dx[i];
                int nextC = currentC + dy[i];

                if(nextR < row && nextR >= 0 && nextC < col && nextC >= 0 &&
                        nextH >= 0 && nextH < height){
                    if(arr[nextH][nextR][nextC] == 0 && visited[nextH][nextR][nextC] == -1){
                        queue.offerLast(new int[] {nextH, nextR, nextC});
                        visited[nextH][nextR][nextC] = visited[currentH][currentR][currentC] + 1;
                    }
                }
            }
        }

        int maxDay = 0;
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < row; j++) {
                for (int k = 0; k < col; k++) {
                    if(arr[i][j][k] == 0 && visited[i][j][k] == -1){
                        System.out.println("-1");
                        return;
                    }

                    maxDay = Math.max(maxDay, visited[i][j][k]);
                }
            }
        }

        System.out.println(maxDay);

    }
}
