package HomeWork;

import java.util.ArrayList;
import java.util.Collection;
import java.util.TreeSet;

public class Task4 {
    public static void main(String[] args) {
        Collection<Integer> col1 = new TreeSet<Integer>();
        col1.add(1);
        col1.add(2);
        col1.add(3);
        
        System.out.println(col1);

        Collection<Integer> col2 = new TreeSet<Integer>();
        col2.add(2);
        col2.add(3);
        col2.add(4);
        col2.add(5);

        col1.addAll(col2);
        
        System.out.println(col1);
    }
}
