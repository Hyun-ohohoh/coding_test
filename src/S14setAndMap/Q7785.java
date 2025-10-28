package S14setAndMap;

import java.util.*;

public class Q7785 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        Set<String> set = new TreeSet<>(Comparator.reverseOrder());

        for (int i = 0; i < n; i++) {
            String input = sc.nextLine();
            String[] parts = input.split(" ");
            String name = parts[0];
            String cond = parts[1];

            if(cond.equals("enter")){
                set.add(name);
            } else if(cond.equals("leave")){
                set.remove(name);
            } else {
                continue;
            }
        }

        for (String s : set) {
            System.out.println(s);
        }

    }
}
