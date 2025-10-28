package class3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Q18870 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] input = br.readLine().split(" ");

        List<Integer> list = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            set.add(Integer.parseInt(input[i]));
            arr[i] = Integer.parseInt(input[i]);
        }

        for (Integer i : set) {
            list.add(i);
        }

        Collections.sort(list);

        Map<Integer, Integer> map = new HashMap<>();
        int value = 0;
        for(int i = 0; i < list.size(); i++){
                map.put(list.get(i), value++);
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(map.get(arr[i])).append(" ");
        }

        System.out.println(sb);













    }
}
