package S14setAndMap;

import java.util.*;

public class Q1764 {

    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();
        scanner.nextLine();

        Set<String> set1 = new TreeSet<>();
        Set<String> set2 = new TreeSet<>();

        for(int i = 0; i < n; i++){
            String name = scanner.nextLine();
            set1.add(name);
        }

        for(int i = 0; i < m; i++){
            String name = scanner.nextLine();
            if(set1.contains(name)){
                set2.add(name);
            }
        }
        System.out.println(set2.size());
        for(String s : set2){
            System.out.println(s);
        }


    }
}
