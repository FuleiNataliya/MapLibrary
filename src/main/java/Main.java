package main.java;

import java.time.LocalDate;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Map<LocalDate, String> map = new LinkedHashMap<>();
        map.put(LocalDate.parse("2019-05-01"), "Zapovit");
        map.put(LocalDate.parse("2019-05-05"), "Kobzar");
        map.put(LocalDate.parse("2019-05-07"), "Kateryna");
        map.put(LocalDate.parse("2019-05-10"), "Son");
        map.put(LocalDate.parse("2019-05-15"), "Haidamaky");
        map.put(LocalDate.parse("2019-05-18"), "Thought");
        map.put(LocalDate.parse("2019-05-19"), "Poplar tree");

        LocalDate data;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the date in the format: valid input format -->(" + LocalDate.now() + "):");
        try {
            data = LocalDate.parse(scanner.next());
            LibraryContainer.container(map, data);
        } catch (Exception ex) {
            System.out.println("Invalid date format entered!");
        }

        System.out.println("///////////--------------------------/////////");
        System.out.println("Days of library visits.");
        System.out.println(map.keySet());
        System.out.println("List of books.");
        System.out.println(map.values());
    }
}