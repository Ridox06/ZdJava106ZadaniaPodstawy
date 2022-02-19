package pl.sda.academy.java.basic.exercises.da1.task5;

import java.util.Scanner;

public class Task5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please insert first digit: ");
        int firstDigit = scanner.nextInt();

        System.out.print("Please insert second digit: ");
        int secondDigit = scanner.nextInt();

        int sumOfSequenece = sumOfSequenece(firstDigit, secondDigit);
        System.out.println("Sum: " + sumOfSequenece);
    }

    private static int sumOfSequenece(int firstDigit, int secondDigit) {
        if(firstDigit > secondDigit){
            int tmp =firstDigit;
            firstDigit = secondDigit;
            secondDigit = tmp;
        }
        int sum = 0;
        while(firstDigit <= secondDigit){
            sum += firstDigit;
            firstDigit++;
        }
        return sum;
    }
}
