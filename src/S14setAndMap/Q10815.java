package S14setAndMap;

import java.util.*;

public class Q10815 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Set<Integer> set1 = new HashSet<>();

        for(int i = 0; i < n; i++){
            set1.add(sc.nextInt());
        }
        sc.nextLine();

        int m = sc.nextInt();
        Set<Integer> set2 = new LinkedHashSet<>();

        for(int i = 0; i < m; i++){
            set2.add(sc.nextInt());
        }
        sc.nextLine();

        for (Integer integer : set2) {
            boolean contains = set1.contains(integer);
            if(contains == true){
                System.out.print("1 ");
            } else {
                System.out.print("0 ");
            }
        }
    }
}
