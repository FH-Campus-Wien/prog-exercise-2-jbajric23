package at.ac.fhcampuswien;

import java.util.Scanner;
import java.util.Arrays;
import java.math.BigDecimal;
import java.math.RoundingMode;


public class App {

    //todo Task 1
    public void largestNumber(){
        boolean loop = true;
        Scanner scanner1 = new Scanner(System.in);
        double num[] = new double[25];
        int i = 0;
        do {
            int j = i+1;
            //System.out.println("Number " + j + ": ");
            num[i] = scanner1.nextDouble();
            if (num[0] <= 0 && i == 0) {
                System.out.println("Number " + j + ": No number entered.");
                break;
            } else if (num[i] <= 0) {
                Arrays.sort(num);
                double maxNum = num[num.length - 1];
                // Next two Lines -> Source: https://www.techiedelight.com/round-up-float-with-2-decimal-places-java/
                BigDecimal bd = new BigDecimal(maxNum);
                BigDecimal roundOff = bd.setScale(2, RoundingMode.FLOOR);
                int x1 = j-1;
                int x2 = j-2;
                System.out.println("Number " + x2 + ": Number " + x1 + ": Number " + j + ": The largest number is " + roundOff);
                break;
            }
            i++;
        } while (loop);

    }

    //todo Task 2
    public void stairs(){
        // input your solution here
        // --> System.out.printf(...); --> Anschauen
    }

    //todo Task 3
    public void printPyramid(){
        // input your solution here
        /*
        final int rows = 8;
        final int cols = 8;
        for(i=0;i<rows;i++) {
        for(j=0,j<cols,i++) {
        if((i+j) % 2 == 0) {
        Sop("* ");
        } else {
        sop("  "); }
        }
        Sop();
        ---> Schachbrettmuster
        --> rows - i Möglichkeit
        --> stern * 2 - 1
        */
    }

    //todo Task 4
    public void printRhombus(){
        // input your solution here
        // c = scan.next().charAT(0); = H
        // c--;  --> sop(c) = G -> F -> E
        // unterteilen in oben und unten
    }

    //todo Task 5
    public void marks(){
        // input your solution here
        // var sum definieren = 0;
        // Scanner in einer Schleife
        // Laufende Summenbildung in der Schleife --> sum += grade;

    }

    //todo Task 6
    public void happyNumbers(){
        // input your solution here
        // unglückliche Zahlen (4,16,37,58,89,145,42,20,4)
    }

    public static void main(String[] args){
        App exercise2 = new App();

        System.out.println("Task 1: Largest Number");
        exercise2.largestNumber();

        System.out.println("\nTask 2: Stairs");
        exercise2.stairs();

        System.out.println("\nTask 3: Pyramide");
        exercise2.printPyramid();

        System.out.println("\nTask 4: Raute");
        exercise2.printRhombus();

        System.out.println("\nTask 5: Notendurchschnitt");
        exercise2.marks();

        System.out.println("\nTask 6: Fröhliche Zahlen");
        exercise2.happyNumbers();
    }
}