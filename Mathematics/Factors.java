import java.util.ArrayList;
import java.util.Scanner;

public class Divisors {
    static ArrayList<Integer> factors(int n) {
        ArrayList<Integer> res = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (n % i == 0)
                res.add(i);
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        ArrayList<Integer> list = factors(number);
        int var=list.size();
        System.out.println("No.of Divisors of " + number + " are: " + var);
        scanner.close();
    }
}