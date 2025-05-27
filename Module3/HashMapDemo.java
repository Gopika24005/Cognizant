import java.util.HashMap;
import java.util.Scanner;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Integer, String> students = new HashMap<>();
        Scanner sc = new Scanner(System.in);

        students.put(101, "Alice");
        students.put(102, "Bob");
        students.put(103, "Charlie");

        System.out.print("Enter student ID to search: ");
        int id = sc.nextInt();

        if (students.containsKey(id)) {
            System.out.println("Student Name: " + students.get(id));
        } else {
            System.out.println("ID not found.");
        }
    }
}

