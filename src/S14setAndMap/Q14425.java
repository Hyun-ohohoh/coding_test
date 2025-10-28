package S14setAndMap;

import java.util.*;

public class Q14425 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int count = 0;
        sc.nextLine();

        Set<String> set1 = new HashSet<>();
        for(int i = 0; i < n; i++){
            set1.add(sc.nextLine());
        }

        for(int i = 0; i < m; i++){
            if(set1.contains(sc.nextLine())){
                count++;
            }
        }

        System.out.println(count);

    }
}
