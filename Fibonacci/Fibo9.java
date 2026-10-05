import java.util.Scanner;
class Fibo9 {
  public static int sumEvenFibUptoN(int n){
    int a=0, b=1, sum=0;
     while(b <= n){
        if(b % 2 == 0) sum += b;
         int c = a+b;
         a = b;
          b = c;
      }
        return sum;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(sumEvenFibUptoN(n));
    }
}