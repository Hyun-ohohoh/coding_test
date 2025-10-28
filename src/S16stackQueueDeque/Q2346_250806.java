package S16stackQueueDeque;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Q2346_250806 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        List<Integer> balloons = new ArrayList<>();
        List<Integer> valueList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            balloons.add(i+1);
            valueList.add(Integer.parseInt(st.nextToken()));
        }

        List<Integer> result = new ArrayList<>();
        int index = 0;

        while(!balloons.isEmpty()){
            result.add(balloons.get(index));
            int value = valueList.get(index);

            balloons.remove(index);
            valueList.remove(index);

            if(balloons.isEmpty()){
                break;
            }

            if(value > 0){
                index = (index + value - 1) % balloons.size();
            } else {
                index = (index + value + balloons.size()) % balloons.size();
            }

            if (index < 0) index += balloons.size();
        }

        for (Integer i : result) {
            System.out.print(i + " ");
        }

    }
}