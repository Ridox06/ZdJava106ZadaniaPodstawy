package pl.sda.academy.java.basic.exercises.da1.task3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        System.out.println("Please insert first digit: " + x);
        int y = scanner.nextInt();
        System.out.println("Please insert second digit: " + y);

        boolean pointA = methoForPointA(x, y);
        System.out.println("If x is greater than y: " + pointA);

        boolean pointB = methodForPointB(x, y);
        System.out.println("If x * 3 is greater than y: " + pointB);

        boolean pointC = methodForPointC(x, y);
        System.out.println("If y++ is smaller tjan ++x and --x is smaller than y++:  " + pointC);

        boolean pointD = methodForPointD(x, y);
        System.out.println("If y++ is smaller tjan ++x and --x is smaller than y++:  " + pointD);
    }

    private static boolean methoForPointA(int x, int y) {
        return x > y;
    }

    private static boolean methodForPointB(int x, int y) {
        return (x * 3) > y;
    }

    private static boolean methodForPointC(int x, int y) {
        return (y++ < ++x) && (--x < y++);
    }

    private static boolean methodForPointD(int x, int y) {
        return (x * y) % 2 == 0;
    }
}