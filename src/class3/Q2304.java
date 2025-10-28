package class3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Q2304 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[][] arr = new int[n][2];

        int minX = Integer.MAX_VALUE;
        int maxX = Integer.MIN_VALUE;
        int[] heightAtx = new int[1001]; // x 좌표별 높이 저장

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer((br.readLine()));
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            arr[i][0] = x;
            arr[i][1] = y;

            heightAtx[x] = y;
            minX = Math.min(minX, x);
            maxX = Math.max(maxX, x);

        }

        //x값 기준 정렬
        Arrays.sort(arr, Comparator.comparingInt(a -> a[0]));

        int s = 0;
        int lastHeight = 0;

        for (int x = minX; x <= maxX; x++) {
            if (heightAtx[x] != 0) {
                lastHeight = heightAtx[x];  // 기둥이 있으면 갱신
            }
            s += lastHeight;  // 기둥이 없으면 마지막 높이 유지
        }

        System.out.println(s);



    }
}
