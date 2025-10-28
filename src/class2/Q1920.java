package class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Q1920 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        Set<Integer> set1 = new HashSet<>();

        String[] input1 = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            set1.add(Integer.valueOf(input1[i]));
        }

        int m = Integer.parseInt(br.readLine());
        String[] input2 = br.readLine().split(" ");

        for (int i = 0; i < m; i++) {
            int num = Integer.parseInt(input2[i]);
            if(set1.contains(num)){
                System.out.println("1");
            } else {
                System.out.println("0");
            }
        }

    }
}


