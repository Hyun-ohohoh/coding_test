package S14setAndMap;

import java.util.*;

public class Q1764V2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.nextLine();

        List<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();

        for(int i = 0; i < n; i++){
            list1.add(sc.nextLine());
        }

        for(int i = 0; i < m; i++){
            String name = sc.nextLine();
            if(list1.contains(name)){
                list2.add(name);
            }
        }


        System.out.println(list2.size());
        for (String s : list2) {
            System.out.println(s);
        }




    }



}
