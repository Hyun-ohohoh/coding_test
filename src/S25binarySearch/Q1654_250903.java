package S25binarySearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1654_250903 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int k = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());

        int[] arr = new int[k];
        long max = 0;
        for (int i = 0; i < k; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            if (max < arr[i]) {
                max = arr[i];
            }
        }

        long min = 1;
        long mid = 0;

        while (min <= max) {

            mid = (min + max) / 2;
            long count = 0;

            for (int i : arr) {
                count += (i / mid);
            }

            if (count < n) {
                //목표 개수보다 작음 -> 더 작게 잘라야 함
                max = mid - 1;
            } else {
                //목표치보다 같거나 큼 -> 길이 같거나 더 길게 잘라야 함
                min = mid + 1;
            }
        }

        System.out.println(min-1);


    }
}
