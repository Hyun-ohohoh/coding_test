package S14setAndMap;

import java.util.*;

public class Q11478{

    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);

        Set<String> set = new HashSet<>();
        String input = scanner.nextLine();

        for(int i = 0; i < input.length(); i++) {
            for(int j = i+1; j < input.length()+1; j++){
                set.add(input.substring(i, j));
            }
        }

        System.out.println(set.size());
    }
}
