package S14setAndMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Q1620 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();
        scanner.nextLine();

        Map<String, Integer> map1 = new HashMap<>();
        Map<Integer, String> map2 = new HashMap<>();

        for (int i = 1; i <= n; i++) {
            String name = scanner.nextLine();
            map1.put(name, i);
            map2.put(i, name);
        }

        for(int i = 0; i < m; i++){
            String input = scanner.nextLine();
            if(input.charAt(0) >= '0' && input.charAt(0) <= '9'){
                int num = Integer.parseInt(input);
                System.out.println(map2.get(num));
            } else {
                System.out.println(map1.get(input));
            }
        }

        scanner.close();
    }
}
