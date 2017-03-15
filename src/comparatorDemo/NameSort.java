package comparatorDemo;

import java.util.*;
public class NameSort {
    public static void main(String[] args) {
        Name nameArray[] = {
            new Name("Prateek", "Sutar"),
            new Name("Chandana", "Mahapatra"),
            new Name("Kunal", "Sutar"),
            new Name("Bijaylaxmi", "Maharana")
        };
        //Unsorted List
        List<Name> names = Arrays.asList(nameArray);
        System.out.println(names);
        
        //Sorting As per first Name
        Collections.sort(names,new FirstNameSorter());
        System.out.println("Sorting As per first Name  :"+names);
       
        //Sorting as per last name
        Collections.sort(names,new LastNameSorter());
        System.out.println("Sorting as per last name   :"+names);
    }
}