package main.java;

import java.time.LocalDate;
import java.util.Map;

public class LibraryContainer {

    public static void container(Map<LocalDate, String> map, LocalDate data) {

        System.out.println(map.getOrDefault(data, "At such a date, the book was not taken."));

    }
}
