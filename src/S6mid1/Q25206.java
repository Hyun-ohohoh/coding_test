package S6mid1;

import java.util.Scanner;

public class Q25206 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double sumCredit = 0;
        double sumGrade = 0;


        for (int i = 0; i < 20; i++) {
            String name = sc.next();
            double credit = sc.nextDouble();
            String grade = sc.next();
            double doubleGrade = 0;

            switch(grade){
                case "A+": doubleGrade = 4.5; break;
                case "A0": doubleGrade = 4.0; break;
                case "B+": doubleGrade = 3.5; break;
                case "B0": doubleGrade = 3.0; break;
                case "C+": doubleGrade = 2.5; break;
                case "C0": doubleGrade = 2.0; break;
                case "D+": doubleGrade = 1.5; break;
                case "D0": doubleGrade = 1.0; break;
                case "F": doubleGrade = 0.0; break;
                case "P": continue;
            }

            sumGrade += doubleGrade * credit;
            sumCredit += credit;
        }

        double averageGrade = sumGrade / sumCredit;
        System.out.printf("%.6f\n", averageGrade);

    }
}
