import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MyClass {
    public static void main(String[] args) {

        List<Integer> l = Arrays.asList(1, 2, 3, 9, 16, 24);

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();  // This input isn't used yet

        // Print elements using normal for loop
        System.out.println("Elements in the ArrayList using Simple loop:");
        for (int i = 0; i < l.size(); i++) {
            System.out.println(l.get(i));
        }

        // Print elements using for-each loop      
        System.out.println("Elements in the ArrayList using For-each loop:");
        for (Integer x : l) {
            System.out.println(x);
        }

        scanner.close();
    }
}