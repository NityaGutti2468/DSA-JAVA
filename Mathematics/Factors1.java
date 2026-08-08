import java.util.ArrayList;
import java.util.Scanner;

public class Factors1 {
    static ArrayList<Integer> factors(int n) {
        ArrayList<Integer> res = new ArrayList<>();
        for (int i = 1; i <= n/2; i++) {
            if (n % i == 0)
                res.add(i);
        }
         res.add(n);
        return res;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        ArrayList<Integer> list = factors(number);
        System.out.println("Factors of " + number + " are: " + list);
        scanner.close();
    }
}