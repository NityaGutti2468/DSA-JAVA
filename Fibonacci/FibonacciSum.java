import java.util.Scanner;

public class FibonacciSum {
public static int fibSum(int n) {
if (n == 1)
return 0; 
else if (n == 2)
return 1; 
int a = 0, b = 1, c, sum = a + b;
for (int i = 3; i <= n; i++) {
c = a + b;
sum += c;
a = b;
b = c;
}
return sum;
}
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.print("Enter the number : ");
int n = scanner.nextInt();
int result = fibSum(n);
System.out.println("Sum "+ result);
scanner.close();
    }
}