package comparableDemo;

import java.util.*;
public class NameSort {
    public static void main(String[] args) {
        Name nameArray[] = {
            new Name("Prateek", "Sutar"),
            new Name("Chandana", "Mahapatra"),
            new Name("Kunal", "Sutar"),
            new Name("Bijaylaxmi", "Maharana")
        };

        List<Name> names = Arrays.asList(nameArray);
        System.out.println(names);
        Collections.sort(names);
        System.out.println(names);
    }
}