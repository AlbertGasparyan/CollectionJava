import java.util.ArrayList;
import java.util.Collection;

public class s3 {
    public static void main(String[] args) {
        Object[]i;
        
        ArrayList<String> list = new ArrayList<>();
        ArrayList<String> string = new ArrayList<>(list);
        list.add("Kids");
        list.add("Hello");
        list.add("Normal");
        list.add("Long");
        System.out.println(list);
        System.out.println(list.size()/2);

        list.add(list.size()/2,"add list");
        System.out.println(list);
        list.set(list.size()/2, "new add list");
        System.out.println(list);
    }
}