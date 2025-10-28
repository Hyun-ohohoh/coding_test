package S16stackQueueDeque;

import java.io.*;
import java.util.*;

public class Q10773 {

    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Deque<Integer> stack = new ArrayDeque<>();

        int k = Integer.parseInt(br.readLine());
        int sum = 0;
        for(int i = 0; i < k; i++){
            int n = Integer.parseInt(br.readLine());
            if(n == 0){
                Integer value = stack.pop();
                sum -= value;
            } else {
                stack.push(n);
                sum += n;
            }
        }
        System.out.println(sum);

    }
}
