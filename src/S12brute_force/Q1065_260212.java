package S12brute_force;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1065_260212 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int count = 0;

        if(n < 100) {
            count += n;
            System.out.println(count);
            return;
        } else {
            count += 99;
        }

        for(int i = 100; i <= n; i++) {
            int a1 = i % 10; // 1의 자리
            int a2 = ((i % 100) - (i % 10)) / 10; // 10의 자리
            int a3 = i / 100; // 100의 자리

            if(a2 - a1 == a3 - a2) {
                count++;
            }
        }

        System.out.println(count);
    }
}
