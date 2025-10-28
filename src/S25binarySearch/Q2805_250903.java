package S25binarySearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q2805_250903 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];
        int max = 0;

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
            if(max <= arr[i]){
                max = arr[i];
            }
        }

        int min = 1;
        while(min <= max){
            int mid = (min+max) / 2;
            long length = 0;

            for(int i : arr){
                if(i > mid){
                    length += (i-mid);
                }
            }

            //더 길게 나오면 최대 높이를 높여야함
            if(length >= m){
                min = mid + 1;
            } else {
                max = mid - 1;
            }
        }

        System.out.println(max);

    }
}
