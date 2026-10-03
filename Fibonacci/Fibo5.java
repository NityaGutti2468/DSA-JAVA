import java.util.Scanner;

public class Fibo5 {
    boolean isPerfectSquare(int x) {
        int s = (int)Math.sqrt(x);
        return s*s == x;
    }

    boolean isfibo(int n) {
        return isPerfectSquare(5*n*n+4) || isPerfectSquare(5* n*n-4);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Fibo5 j = new Fibo5();
        boolean a = j.isfibo(n);
        System.out.println(a);
        sc.close();
    }
}