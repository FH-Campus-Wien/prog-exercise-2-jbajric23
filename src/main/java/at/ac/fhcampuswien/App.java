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
                loop = false;
            } else if (num[i] <= 0) {
                Arrays.sort(num);
                double maxNum = num[num.length - 1];
                // Next two Lines -> Source: https://www.techiedelight.com/round-up-float-with-2-decimal-places-java/
                BigDecimal bd = new BigDecimal(maxNum);
                BigDecimal roundOff = bd.setScale(2, RoundingMode.FLOOR);
                int x1 = j-1;
                int x2 = j-2;
                System.out.println("Number " + x2 + ": Number " + x1 + ": Number " + j + ": The largest number is " + roundOff);
                loop = false;
            }
            i++;
        } while (loop);

    }

    //todo Task 2
    public void stairs(){
        // input your solution here
        // --> System.out.printf(...); -> Anschauen
        Scanner scanner2 = new Scanner(System.in);
        int lines = scanner2.nextInt();
        if (lines <= 0) {
            System.out.println("n: Invalid number!");
        } else {
            int count2 = 1;
            for (int i = 1; i <= lines; i++) {
                for (int j = 1; j <= i; j++) {
                    if (count2 == 1) {
                        System.out.print("n: " + count2 + " ");
                        count2++;
                    } else {
                        System.out.print(count2 + " ");
                        count2++;
                    }
                }
                System.out.println();
            }
        }
    }

    //todo Task 3
    public void printPyramid(){
        // input your solution here
        int lines = 6;
        for (int i=1; i <= lines; i++) {

            for (int j=1; j<= lines-i; j++) {
                System.out.print(" ");
            }
            for (int k=1; k<=(2*i-1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
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
        boolean loop = true;
        int i = 1;
        double sum = 0;
        double avg = 0;
        int neg = 0;
        Scanner scanner5 = new Scanner(System.in);
        while (loop) {
            int grade = scanner5.nextInt();
            avg = sum/i;
            if (grade >= 1 && grade <= 5) {
                sum += grade;
                i++;
                loop = false;
            } else if (grade == 5) {
                neg++;
                loop = false;
            } else if (grade == 0) {
                System.out.println(" Mark 1: Mark 2: Mark 3: Mark 4: Average: " + avg);
                System.out.println(" Negative Marks: " + neg);
                break;
            } else
                System.out.println("Invalid mark!");
                loop = false;

        }
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