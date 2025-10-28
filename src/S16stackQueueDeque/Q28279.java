package S16stackQueueDeque;

import java.util.*;
import java.io.*;

public class Q28279 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Deque<Integer> queue = new ArrayDeque<>();
        int n = Integer.parseInt(br.readLine());

        for(int i = 0; i < n; i++){
            String[] str = br.readLine().split(" ");
            int command = Integer.parseInt(str[0]);

            switch(command){
                case 1:
                    queue.offerFirst(Integer.parseInt(str[1]));
                    break;

                case 2:
                    queue.offerLast(Integer.parseInt(str[1]));
                    break;

                case 3:
                    if(!queue.isEmpty()){
                        System.out.println(queue.pollFirst());
                    } else {
                        System.out.println("-1");
                    }

                    break;

                case 4:
                    if(!queue.isEmpty()){
                        System.out.println(queue.pollLast());
                    } else {
                        System.out.println("-1");
                    }
                    break;

                case 5:
                    System.out.println(queue.size());
                    break;

                case 6:
                    if (queue.isEmpty()){
                        System.out.println("1");
                    } else {
                        System.out.println("0");
                    }
                    break;

                case 7:
                    if(!queue.isEmpty()){
                        System.out.println(queue.peekFirst());
                    } else {
                        System.out.println("-1");
                    }
                    break;

                case 8:
                    if(!queue.isEmpty()){
                        System.out.println(queue.peekLast());
                    } else {
                        System.out.println("-1");
                    }
                    break;

            }
        }


    }
}
