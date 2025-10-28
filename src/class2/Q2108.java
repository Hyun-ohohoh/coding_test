package class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Q2108 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            sum += arr[i];
        }

        int min = arr[0];
        int max = arr[0];
        for (int i = 0; i < n; i++) {

            if(arr[i] < min){
                min = arr[i];
            }


            if(arr[i] > max){
                max = arr[i];
            }

        }

        int count = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n - 1; i++) {
            if(arr[i] == arr[i+1]){
                ++count;
                map.put(arr[i], count);
            }
        }

        int maxCount = 0;
        for (Integer value : map.values()) {

        }



        Arrays.sort(arr);

        System.out.println(sum / n);
        System.out.println(arr[2/n]);

        System.out.println(max - min);




    }
}
