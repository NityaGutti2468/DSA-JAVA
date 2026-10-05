import java.util.Scanner;
import java.util.Collections;
public class Fibo10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int res = fibn(n);
        System.out.print(res);
        sc.close();
    }
   static int fibn(int n){
        double phi = (1 + Math.sqrt(5)) / 2;
        int prev = (int)Math.round(n / phi);
        return prev;
    }
}