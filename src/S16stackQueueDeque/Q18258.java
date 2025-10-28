package S16stackQueueDeque;

import java.util.*;
import java.io.*;

public class Q18258 {

    public static void main(String args[]) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());
        Deque<Integer> queue = new ArrayDeque<>();
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < num; i++){
            String str = br.readLine();
            String[] parts = str.split(" ");
            String command = parts[0];

            switch(command){
                case "push":
                    int m = Integer.parseInt(parts[1]);
                    queue.offer(m);
                    break;

                case "pop":
                    if(queue.isEmpty()){
                        sb.append(-1).append('\n');
                    } else {
                        sb.append(queue.poll()).append('\n');
                    }
                    break;

                case "front":
                    if(queue.peekFirst() != null){
                        sb.append(queue.peekFirst()).append('\n');
                    } else {
                        sb.append(-1).append('\n');
                    }
                    break;

                case "back":
                    if(queue.peekLast() != null){
                        sb.append(queue.peekLast()).append('\n');
                    } else {
                        sb.append(-1).append('\n');
                    }
                    break;

                case "size":
                    sb.append(queue.size()).append('\n');
                    break;

                case "empty":
                    sb.append(queue.isEmpty() ? 1 : 0).append('\n');
                    break;
            }
        }

        System.out.println(sb);


    }
}
