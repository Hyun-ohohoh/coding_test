package S16stackQueueDeque;

import java.util.*;

public class Q11866 {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int j = 0;

        Deque<Integer> queue = new ArrayDeque<>();
        int[] arr = new int[n];
        for(int i = 1; i <= n; i++){
            queue.offer(i);
        }


        while(!queue.isEmpty()){
            for(int i = 1; i <= k - 1; i++){
                queue.offer(queue.pop());
            }

            arr[j] = queue.pop();
            j++;

        }

        System.out.print("<");
        for(int i = 0; i < n; i++){

            if(i != n - 1){
                System.out.print(arr[i] + ", ");
            } else {
                System.out.print(arr[i] + ">");
            }
        }







    }
}
