import java.util.Scanner;

public class Fibo6 {
static int fibSum(int n) {
if (n == 0 || n == 1)
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
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int res = fibSum(n);
System.out.println("Sum "+ res);
sc.close();
    }
}