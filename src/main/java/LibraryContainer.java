package main.java;

import java.security.Key;
import java.util.*;

public class LibraryContainer {

    private Integer data;
    private String book;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LibraryContainer that = (LibraryContainer) o;
        return Objects.equals(data, that.data) &&
                Objects.equals(book, that.book);
    }

    @Override
    public int hashCode() {
        return Objects.hash(data, book);
    }

    public void container(Integer data, String book) {
        this.data = data;
        this.book = book;

        Map<Integer, String> map = new HashMap<>();
        map.put(2019 / 05 / 01, "Zapovit");
        map.put(2019 / 05 / 05, "Kobzar");
        map.put(2019 / 05 / 07, "Kateryna");
        map.put(2019 / 05 / 10, "Son");
        map.put(2019 / 05 / 15, "Haidamaky");
        map.put(2019 / 05 / 18, "Thought");
        map.put(2019 / 05 / 19, "Poplar tree");

        for (Integer key : map.keySet()) {
            System.out.println("Key = " + key);
        }
        for (Integer key : map.keySet()){
            for (String value: map.getOrDefault(book));
        }
        System.out.println(map.keySet());
        System.out.println(map.entrySet());




        }
}
