package S16stackQueueDeque;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Node{
    int value;
    Node next;


    public Node(int value) {
        this.value = value;
    }
}

public class Q10828_250806 {

    static Node top;

    static void push(int value){
        Node node = new Node(value);
        node.next = top;
        top = node;
    }

    static int pop(){
        if(top != null){
            int value = top.value;
            top = top.next;
            return value;
        }
        return -1;
    }

    static int size(){
        int count = 0;
        Node current = top;
        while(current != null){
            current = current.next;
            count++;
        }
        return count;
    }

    static int empty(){
        if(top == null){
            return 1;
        } else {
            return 0;
        }
    }

    static int top(){
        if(top == null){
            return - 1;
        } else {
            return top.value;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String command = st.nextToken();
            if(st.hasMoreTokens()){
                int num = Integer.parseInt(st.nextToken());

                if(command.equals("push")){
                    push(num);
                    continue;
                }
            }

            if(command.equals("pop")){
                System.out.println(pop());
            }

            if(command.equals("size")){
                System.out.println(size());
            }

            if(command.equals("empty")){
                System.out.println(empty());
            }

            if(command.equals("top")){
                System.out.println(top());
            }


        }
    }
}
