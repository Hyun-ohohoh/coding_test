package S26PriorityQueue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;

public class Q11279_250831V2 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            int x = Integer.parseInt(br.readLine());

            if(x == 0){
                if(maxHeap.isEmpty()){
                    sb.append("0").append("\n");
                    continue;
                }
                sb.append(maxHeap.poll()).append("\n");
            } else {
                maxHeap.add(x);
            }
        }

        System.out.println(sb);


    }
}
