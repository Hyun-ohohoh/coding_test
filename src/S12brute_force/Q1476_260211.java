package S12brute_force;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1476_260211 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int e = Integer.parseInt(st.nextToken());
        int s = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());


        int year = 1;
        int result;
        while (true) {
            int yearE = year % 15 == 0 ? 15 : year % 15;
            int yearS = year % 28 == 0 ? 28 : year % 28;
            int yearM = year % 19 == 0 ? 19 : year % 19;

            if (yearE == e && yearS == s && yearM == m) {
                result = year;
                break;
            }
            year++;

        }

        System.out.println(result);

    }

}
