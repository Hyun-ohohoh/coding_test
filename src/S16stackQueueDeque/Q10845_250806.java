package S16stackQueueDeque;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//class Node{
//    int value;
//    Node next;
//
//
//    public Node(int value) {
//        this.value = value;
//    }
//}

public class Q10845_250806 {

    static Node head;
    static Node tail;

    static void push(int value){
        Node node = new Node(value);
        if(tail != null){
            tail.next = node;
        } else {
            head = node;
        }
        tail = node;
    }

    static int pop(){
        if(head != null){
            int value = head.value;
            head = head.next;
            if(head == null){
                tail = null;
            }
            return value;
        }
        return -1;
    }

    static int size(){
        int count = 0;
        Node current = head;
        while(current != null){
            current = current.next;
            count++;
        }
        return count;
    }

    static int empty(){
        if(head == null){
            return 1;
        }
        return 0;
    }

    static int front(){
        if(head != null){
            return head.value;
        } else {
            return -1;
        }
    }

    static int back(){
        if(tail != null){
            return tail.value;
        } else {
            return -1;
        }
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String command = st.nextToken();
            int num = 0;
            if(st.hasMoreTokens()){
                num = Integer.parseInt(st.nextToken());
            }

            switch (command){
                case "push":
                    push(num);
                    break;

                case "pop":
                    sb.append(pop()).append("\n");
                    break;

                case "size":
                    sb.append(size()).append("\n");
                    break;

                case "empty":
                    sb.append(empty()).append("\n");
                    break;

                case "front":
                    sb.append(front()).append("\n");
                    break;

                case "back":
                    sb.append(back()).append("\n");
                    break;
            }
        }

        System.out.println(sb);

    }
}
