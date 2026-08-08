import java.util.Scanner;

public class Prime3 {

    static boolean isPrime(int n) {
          int c=0;
        for (int i = 1; i*i <= n; i++) {
            if (n % i == 0)
               c++;
            if( n/i != i )
               c++;
        }
       if ( c==2 )
           return true;
       else 
           return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = sc.nextInt();
        System.out.println(isPrime(n) ? "Prime" : "Not Prime");
    }
}