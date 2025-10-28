package S26PriorityQueue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

class Q1927_250901 {

    static List<Integer> heap;

    public Q1927_250901() {
        heap = new ArrayList<>();
        heap.add(0);
    }

    public void insert(int value){
        heap.add(value);

        int index = heap.size() - 1; //마지막 인덱스

        while(index>1 && heap.get(index) < heap.get(index/2)){
            int tmp = heap.get(index);
            heap.set(index, heap.get(index/2));
            heap.set(index/2, tmp);
            index /= 2;
        }

    }

    public int delete(){
        if(heap.size() - 1 == 0){
            return 0;
        }

        int delete = heap.get(1);
        heap.set(1, heap.get(heap.size()-1));
        heap.remove(heap.size()-1);

        //재정렬
        int index = 1;
        while(index*2 < heap.size()){
            int min = heap.get(index*2);
            int minIndex = index * 2;

            if((index*2 + 1) < heap.size() && heap.get(index*2) > heap.get(index*2+1)){
                min = heap.get(index*2+1);
                minIndex = index * 2 +1;
            }

            if(heap.get(index) < min){
                break;
            }

            //자식이 더 크면
            int tmp = heap.get(index);
            heap.set(index, min);
            heap.set(minIndex, tmp);
            index = minIndex;

        }

        return delete;


    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        Q1927_250901 minHeap = new Q1927_250901();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            int x = Integer.parseInt(br.readLine());
            if (x == 0) {
                if (minHeap.heap.size() <= 1) {
                    sb.append("0").append("\n");
                    continue;
                }
                sb.append(minHeap.delete()).append("\n");
            } else {
                minHeap.insert(x);
            }
        }
        System.out.println(sb);
    }


}
