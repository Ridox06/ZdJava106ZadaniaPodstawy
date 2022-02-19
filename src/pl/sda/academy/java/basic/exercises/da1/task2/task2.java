package pl.sda.academy.java.basic.exercises.da1.task2;

import java.util.Scanner;

public class task2 {
    private static final float PI = 3.14f;

    public static void main(String[] args) {
        float diameter = getDiameterFromUser();
        float circumference = calculateCircumferenceOfACircle(diameter);
        System.out.println("Circumference Of A Circle: " + circumference);
        float area = calculateAreaOffACircle(diameter);
        System.out.println("Area Of A Circle: " + area);
    }

    private static float getDiameterFromUser(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please insert diameter: ");
        return scanner.nextFloat();
    }

    private static float calculateCircumferenceOfACircle(float diameter){
        return (float) Math.PI * diameter;
    }

    private static float calculateAreaOffACircle(float diameter){
        float radius = diameter / 2;
        return (float) Math.PI * radius * radius;
    }
}
