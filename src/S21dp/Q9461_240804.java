package S21dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q9461_240804 {

    static int max;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        max = 100;

        int n = Integer.parseInt(br.readLine());
        Long[] arr = new Long[max + 1];

        arr[1] = arr[2] = arr[3] = 1L;
        arr[4] = arr[5] = 2L;

        for(int i = 6; i <= max; i++){
            arr[i] = arr[i-1] + arr[i-5];
        }

        for(int i = 0; i < n; i++){
            int value = Integer.parseInt(br.readLine());
            System.out.println(arr[value]);
        }

    }
}
