package S12brute_force;

public class Q4673_260211 {

    public static void main(String[] args) {

        boolean[] check = new boolean[10001];

        int n = 1;
        while(n <= 10000) {

            int number = n;
            int sum = number;

            while(number != 0) {
                sum += number % 10;
                number = number / 10;
            }

            if(sum < 10000) {
                check[sum] = true;
            }
            n++;
        }

        for(int i = 1; i < 10000; i++){
            if(check[i] == false) {
                System.out.println(i);
            }
        }

    }

}
