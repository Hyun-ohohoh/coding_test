package S14setAndMap;

import java.util.*;

public class Q1269 {

    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        Set<Integer> setA = new HashSet<>();
        Set<Integer> setB = new HashSet<>();

        for(int i = 0; i < a; i++){
            setA.add(scanner.nextInt());
        }
        scanner.nextLine();

        for(int i = 0; i < b; i++){
            setB.add(scanner.nextInt());
        }

        // setA에만 있는 원소 개수
        Set<Integer> onlyA = new HashSet<>(setA);
        onlyA.removeAll(setB);

        // setB에만 있는 원소 개수
        Set<Integer> onlyB = new HashSet<>(setB);
        onlyB.removeAll(setA);

        System.out.println(onlyA.size() + onlyB.size());

//        int countA = 0;
//        for(Integer i : setB){
//            if(setA.contains(i)){
//                continue;
//            } else {
//                countA++;
//            }
//        }
//
//        int countB = 0;
//        for(Integer i : setA){
//            if(setB.contains(i)){
//                continue;
//            } else {
//                countB++;
//            }
//        }
//        System.out.println(countA + countB);


    }
}
