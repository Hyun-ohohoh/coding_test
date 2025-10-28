package S26PriorityQueue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Q11286_250908 {



    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) ->{
            int absA = Math.abs(a);
            int absB = Math.abs(b);

            if(absA != absB){
                return Integer.compare(absA, absB);
            }

            //같으면 작은 값 우선
            return Integer.compare(a, b);
        });

        for(int i = 0; i < n; i++){
            int x = Integer.parseInt(br.readLine());

            if(x != 0){
                pq.offer(x);
            } else {
                if(pq.isEmpty()){
                    sb.append("0").append("\n");
                } else {
                    sb.append(pq.poll()).append("\n");
                }
            }
        }

        System.out.println(sb);
    }
}
