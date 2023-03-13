package HomeWork;

import java.util.ArrayList;
import java.util.Random;
import static java.lang.Math.round;
import static java.util.Collections.max;
import static java.util.Collections.min;

public class Task3 {
    public static void main(String[] args) {
        Random rnd = new Random();
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            int val = rnd.nextInt(-10, 10);
            list.add(val);
        }
        System.out.printf("List:"+list+"\n");

        int max = max(list);
        int min = min(list);
        int sum = 0;
        int maxItem = list.get(0);
        int minItem = list.get(0);
        for(int num:list){
            if(num>maxItem) maxItem=num;
            if(num<minItem) minItem=num;
            sum+=num;
        }
        float avg =(float) sum/list.size();

        System.out.println("Min value:"+min);
        System.out.println("Max value:"+max);
        System.out.println("Average value:"+avg);
    }
}
