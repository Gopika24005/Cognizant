import java.util.ArrayList;
import java.util.Collections;

public class LambdaSortDemo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Banana");
        list.add("Apple");
        list.add("Mango");

        Collections.sort(list, (a, b) -> a.compareTo(b));

        System.out.println("Sorted List:");
        for (String s : list) {
            System.out.println(s);
        }
    }
}

    

