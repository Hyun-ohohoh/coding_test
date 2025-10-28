package S23greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q13305_250822V2 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] distances = new int[n-1];
        int[] prices = new int[n];
        long price = 0;


        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n-1; i++) {
            distances[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n-1; i++) {
            prices[i] = Integer.parseInt(st.nextToken());
        }

        int minPirce = prices[0];
        price += (long) prices[0] * distances[0];
        for (int i = 1; i < n-1; i++) {
            if(prices[i] < minPirce){
                minPirce = prices[i];
            }

            price += (long) minPirce * distances[i];
        }


        System.out.println(price);






    }
}
