package class3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Q2606 {

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int numOfComputer = Integer.parseInt(br.readLine());
        int numOfNetwork = Integer.parseInt(br.readLine());

        Set<Computer> infected = new HashSet<>();
        Map<Computer, Integer> map = new HashMap<>();

        Computer comp1 = new Computer();
        Computer comp2 = new Computer();

        for (int i = 0; i < numOfNetwork; i++) {
            String[] network = br.readLine().split(" ");

            comp1.computer = Integer.parseInt(network[0]);
            comp2.computer = Integer.parseInt(network[1]);

            if(comp1.computer == 1){
                comp1.infected = true;
                comp2.infected = true;
                infected.add(comp1);
                infected.add(comp2);
                continue;
            }

            if(comp2.computer == 1){
                comp1.infected = true;
                comp2.infected = true;
                infected.add(comp1);
                infected.add(comp2);
                continue;
            }

            if(comp1.infected){
                comp2.infected = true;
                infected.add(comp2);
                continue;
            }

            if(comp2.infected){
                comp1.infected = true;
                infected.add(comp1);
            }

        }

        System.out.println(infected.size());

    }

}

class Computer{
    public int computer;
    public boolean infected = false;
}
