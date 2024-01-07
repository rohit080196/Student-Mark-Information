package Project1;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BLclass b1 = new BLclass();
        System.out.println("1.FIND HIGHEST SCORING MARKS");
        System.out.println("2.FIND LOWEST SCORING MARKS");
        System.out.println("3.FIND PASSED SCORE");
        System.out.println("4.FIND AVGRAGE MARKS");
        int ch = sc.nextInt();

        switch(ch)
        {
            case 1 :
                b1.highestScore();
                break;
            case 2 :
                b1.lowestScore();
                break;
            case 3 :
                b1.passedStudent();
                break;
            case 4 :
                double avg = b1.calculateAvg();
                System.out.println("AVG MARKS "+avg);
                break;

            default:
                System.out.println("INVALID CHOICE");
        }
    }
}
