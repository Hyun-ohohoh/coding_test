package S16stackQueueDeque;

import java.util.*;
import java.io.*;

public class Q28278 {

    public static void main(String args[]) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        Deque<Integer> stack = new ArrayDeque<>();
        int n = Integer.parseInt(br.readLine());

        for(int i = 0; i < n; i++){
            String[] parts = br.readLine().split(" ");
            int m = Integer.parseInt(parts[0]);
            switch(m){
                case 1:
                    stack.push(Integer.parseInt(parts[1]));
                    break;

                case 2:
                    if(stack.isEmpty()){
                        sb.append("-1\n");
                    } else {
                        sb.append(stack.pop()).append("\n");
                    }
                    break;

                case 3:
                    sb.append(stack.size()).append("\n");
                    break;

                case 4:
                    if(stack.isEmpty()){
                        sb.append("1\n");
                    } else {
                        sb.append("0\n");
                    }
                    break;

                case 5:
                    if(stack.isEmpty()){
                        sb.append("-1\n");
                    } else {
                        sb.append(stack.peek()).append("\n");
                    }
                    break;
            }

        }
        System.out.println(sb);
    }
}
