package org.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("¿Cuál es tu nombre?");
        String name = scanner.nextLine();
        System.out.println("¡Hola " + name + "!");

        System.out.println("¿Cuál es tu edad?");
        int age = scanner.nextInt();
        System.out.println("Tu edad es " + age + " años");
    }


}