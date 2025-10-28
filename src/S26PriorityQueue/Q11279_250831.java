package S26PriorityQueue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

class Q11279_250831 {

    private List<Integer> heap;

    public Q11279_250831() {
        heap = new ArrayList<>();
        heap.add(0);
    }

    public void insert(int value){
        heap.add(value); //맨 마지막 위치에 삽입

        int p = heap.size() - 1; //새로 넣은 노드의 인덱스

        //자식이 부모보다 크면 바꿔
        while(p>1 && heap.get(p) > heap.get(p/2)){
            int tmp = heap.get(p/2);
            heap.set(p/2, heap.get(p));
            heap.set(p, tmp);
            p /= 2;
        }
    }

    public int delete(){
        if(heap.size() -1 == 0){
            return 0;
        }

        //삭제할 루트 노드 값 저장
        int deleteItem = heap.get(1);

        //맨 마지막 노트 루트로 옮기고 삭제
        heap.set(1, heap.get(heap.size() - 1));
        heap.remove(heap.size() - 1);

        //재정렬
        int index = 1;
        while((index * 2) < heap.size()){
            int max = heap.get(index*2); //왼쪽 자식 값
            int maxIndex = index * 2; //왼쪽 자식 인덱스

            //왼쪽보다 오른쪽이 크면 부모와 오른쪽을 바꿔야함
            if((index*2 + 1) < heap.size() && max < heap.get(index*2+1)){
                max = heap.get(index*2+1);
                maxIndex = index * 2 + 1;
            }

            //부모가 더 크면
            if(heap.get(index) > max){
                break;
            }

            //자식이 더 크면
            int tmp = heap.get(index);
            heap.set(index, max);
            heap.set(maxIndex, tmp);
            index = maxIndex;
        }

        return deleteItem;

    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        Q11279_250831 maxHeap = new Q11279_250831();
        StringBuilder sb = new StringBuilder();


        for (int i = 0; i < n; i++) {
            int x = Integer.parseInt(br.readLine());

            if(x == 0){
                if(maxHeap.heap.isEmpty()){
                    sb.append("0\n");
                    continue;
                }
                sb.append(maxHeap.delete()).append("\n");
            } else {
                maxHeap.insert(x);
            }
        }

        System.out.println(sb);

    }
}
