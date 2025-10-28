package S23greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q13305_250822 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] distances = new int[n-1];
        int[] prices = new int[n];
        int price = 0;


        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n-1; i++) {
            distances[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n-1; i++) {
            prices[i] = Integer.parseInt(st.nextToken());
        }

        price += distances[0] * prices[0];

        if(n != 3){
            for (int i = 1; i < n-2; i++) {

                if(prices[i] <= prices[i+1]){

                    price += distances[i] * prices[i];
                    price += distances[i+1] * prices[i];

                }

                if(prices[i] > prices[i+1]){
                    price += distances[i-1] * prices[i-1];
                }
            }
        }

        if(n == 3){
            price = 0;
            price += distances[0] * prices[0];
            if(prices[0] <= prices[1]){
                price += distances[1] * prices[0];
            } else {
                price += distances[1] * prices[1];
            }
        }

        System.out.println(price);






    }
}
