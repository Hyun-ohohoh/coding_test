package S23greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Q13904_250904 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        List<List<Integer>> list = new ArrayList<>();

        int max = 0;
        int day = 0;
        for(int i = 0; i < n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            day = Integer.parseInt(st.nextToken());
            int score = Integer.parseInt(st.nextToken());
            list.add(List.of(day, score));
            if(day >= max){
                max = day;
            }
        }

        Collections.sort(list, (o1, o2) -> {
            if(o1.get(1).equals(o2.get(1))){
                return o2.get(0) - o1.get(0);
            }

            return o1.get(1) - o2.get(1);
        });

        int score = 0;


        System.out.println(score);
    }


}
