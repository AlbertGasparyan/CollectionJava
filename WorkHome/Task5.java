package WorkHome;

import java.util.ArrayList;
import java.util.LinkedList;

public class Task5 {
    public static void main(String[] args) {
        long begin = System.currentTimeMillis();
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        for (int i = 0; i < 10000; i++) {
            list.set(0, 0);
        }
        System.out.println(list);
        long end = System.currentTimeMillis();
        System.out.println(end-begin+"ms");


        begin = System.currentTimeMillis();
        LinkedList<Integer> list1 = new LinkedList<>();
        list1.add(1);
        for (int i = 0; i < 10000; i++) {
            list1.set(0, 0);
        }
        System.out.println(list1);
        end = System.currentTimeMillis();
        System.out.println(end-begin+"ms");
    }
}
