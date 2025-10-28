package S14setAndMap;

import java.util.*;

public class Q10816 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();

        Map<Integer, Integer> map = new HashMap<>();


        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        scanner.nextLine();

        int m = scanner.nextInt();
        scanner.nextLine();

        StringBuilder stringBuilder = new StringBuilder();
        for(int i = 0; i < m; i++){
            int num = scanner.nextInt();
            if(map.containsKey(num)){
                stringBuilder.append(map.get(num) + " ");
            } else {
                stringBuilder.append("0 ");
            }
        }

        System.out.println(stringBuilder);
    }
}
