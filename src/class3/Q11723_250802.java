package class3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Q11723_250802 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        Set<Integer> set = new HashSet<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String command = st.nextToken();
            Integer value = null;
            if (st.hasMoreTokens()) {
                value = Integer.parseInt(st.nextToken());
            }

            switch (command) {
                case "add":
                    if (set.contains(value)) {
                        break;
                    }
                    set.add(value);
                    break;

                case "remove":
                    if (!set.contains(value)) {
                        break;
                    }
                    set.remove(value);
                    break;

                case "check":
                    if (set.contains(value)) {
                        sb.append("1\n");
                        break;
                    } else {
                        sb.append("0\n");
                        break;
                    }

                case "toggle":
                    if(set.contains(value)){
                        set.remove(value);
                        break;
                    } else {
                        set.add(value);
                        break;
                    }

                case "all":
                    set.clear();
                    for (int j = 1; j <= 20 ; j++) {
                        set.add(j);
                    }
                    break;

                case "empty":
                    set.clear();
            }

        }

        System.out.println(sb);

    }
}
