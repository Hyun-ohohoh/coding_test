package S16stackQueueDeque;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2346ver2 {
    public static void main(String[] args) throws IOException {
            long start = System.currentTimeMillis();
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int n = Integer.parseInt(br.readLine());
            String[] str = br.readLine().split(" ");
            StringBuilder sb = new StringBuilder();


            // 입력 받은 것
            int[] arr1 = new int[n];
            for(int i = 0; i < n; i++){
                arr1[i] = Integer.parseInt(str[i]);
            }

            int[] printNum = new int[n];

            int index = 0;
            for(int num = 0; num < n; num++){
                int value = arr1[index];
                arr1[index] = 0;
                //printNum[num] = index + 1;
                sb.append(index + 1 + " ");

                if(num == n-1) break;

                if(value > 0){
                    // 내부 값이 양수
                    for(int num2 = 0; num2 < value; num2++) {
                        index = ++index % n;
                        while (arr1[index] == 0) {
                            index = ++index % n;
                        }
                    }
                } else{
                    // 내부 값이 음수
                    value = -value;
                    for(int num2 = 0; num2 < value; num2++){
                        if(--index < 0){
                            index = n - 1;
                        }
                        while(arr1[index] == 0){
                            if(--index < 0){
                                index = n - 1;
                            }
                        }
                    }
                }
            }
            System.out.println(sb);
        long end = System.currentTimeMillis();
        System.out.println("실행 시간: " + (end - start) + "ms");
    }
}
