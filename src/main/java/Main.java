package main.java;

import java.security.Key;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Enter the date in the format, Y/M/D: ");
        Scanner scanner = new Scanner(System.in);
        int data = scanner.nextInt();
        LibraryContainer.container(System.out.println(data));


        System.out.println(map.keySet());
        System.out.println(map.entrySet());


    }
}
