package S12brute_force;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1436_260208 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int count = 0;
        int num = 666;
        while(true) {
            String strNum = String.valueOf(num);

            if (strNum.contains("666")) {
                count++;
            }

            num++;

            if (count == n) {
                break;
            }
        }


        System.out.println(num - 1);
    }
}
