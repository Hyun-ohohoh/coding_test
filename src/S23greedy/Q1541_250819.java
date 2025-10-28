package S23greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1541_250819 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();
        String[] strArr = input.split("-");
        int result = 0;

        String[] first = strArr[0].split("\\+");
        for (String s : first) {
            result += Integer.parseInt(s);
        }

        int sum = 0;
        for (int i = 1; i < strArr.length; i++) {
            String[] strArr2 = strArr[i].split("\\+");
            for (String s : strArr2) {
                sum += Integer.parseInt(s);
            }
        }

        System.out.println(result - sum);


    }
}
