package class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Q18110 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int except = (int) Math.round(n * 0.15);
        List<Integer> list = new ArrayList<>();



        for(int i = 0; i < n; i++){
            int value = Integer.parseInt(br.readLine());
            list.add(value);
        }

        Collections.sort(list);

        //리스트 추출
        List<Integer> list2 = list.subList(except, n - except);



        int sum = 0;
        for (Integer i : list2) {
            sum += i;
        }

        int average = (int) Math.round((double) sum / (n - except * 2));

        System.out.println(average);
    }
}
