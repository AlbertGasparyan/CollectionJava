package HomeWork;

import java.util.ArrayList;
import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Random rnd = new Random();
    ArrayList<Integer> list1 = new ArrayList<Integer>();
    for (int i = 0; i < 8; i++) {
        int val = rnd.nextInt(-10, 10);
        list1.add(val);
    }
    System.out.println("First list: "+list1);

    int i=0;
    while (i<list1.size()) {
        if(list1.get(i)%2==0) list1.remove(i);
        else i++;
        }
    System.out.println("Second list: "+list1);
    }
}
