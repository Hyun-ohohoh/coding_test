package class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Q9012 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());


        for(int i = 0; i < n; i++){
            Deque<String> deque = new ArrayDeque<>();
            String[] input = br.readLine().split("");
            boolean result = true;
            for(int j = 0; j < input.length; j++) {
                if (input[j].equals("(")) {
                    deque.push(input[j]);
                } else if (input[j].equals(")")) {
                    if(deque.isEmpty()){
                        result = false;
                        break;
                    } else {
                        deque.pop();
                    }
                }
            }
            if(!deque.isEmpty()) {
                result = false;
            }

            System.out.println(result ? "YES" : "NO");

        }

    }
}
