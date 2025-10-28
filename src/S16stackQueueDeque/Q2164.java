package S16stackQueueDeque;

import java.util.*;

public class Q2164 {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Deque<Integer> queue = new ArrayDeque<>();

        for(int i = 1; i <= n; i++){
            queue.offer(i);
        }

        while(queue.size() > 1){
            queue.pop();
            queue.offer(queue.pop());
        }

        for (Integer i : queue){
            System.out.println(i);
        }


    }
}
