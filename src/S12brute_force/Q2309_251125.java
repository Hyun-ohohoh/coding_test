package S12brute_force;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Q2309_251125 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[9];
        int sum = 0;
        for(int i = 0; i < 9; i++){
            arr[i] = Integer.parseInt(br.readLine());
            sum += arr[i];
        }

        Arrays.sort(arr);

        int except1 = 0;
        int except2 = 0;

        for(int i = 0; i < 8; i++){
            for(int j = i+1; j < 9; j++){
                if(sum - arr[i] - arr[j] == 100){
                    except1 = arr[i];
                    except2 = arr[j];
                    break;
                }
            }
        }

        for(int i = 0; i < 9; i++){
            if(arr[i] == except1 || arr[i] == except2){
                continue;
            }
            System.out.println(arr[i]);
        }


    }
}
