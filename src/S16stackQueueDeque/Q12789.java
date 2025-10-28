package S16stackQueueDeque;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Q12789 {

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        Deque<Integer> stack = new ArrayDeque<>();

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int count = 1;

        for (int i = 0; i < n; i++) {
            int num = arr[i];

            if(num == count){
                count++;
            } else {
                while(!stack.isEmpty() && stack.peekLast() == count){
                    stack.pollLast();
                    count++;
                }
                stack.offerLast(num);
            }
        }

        while (!stack.isEmpty() && stack.peekLast() == count) {
            stack.pollLast();
            count++;
        }

        if(count == n + 1){
            System.out.println("Nice");
        } else {
            System.out.println("Sad");
        }

    }
}
