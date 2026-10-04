import java.util.Scanner;
class Fibo8 {
 public static int sumFirstNEvenFib(int n){
   int a=0, b=1, sum=0, count=0;
     while(count < n){
        int c = a+b;
        a = b;
        b = c;
        if(b % 2 == 0){
          sum += b;
           count++;
       }
   }
        return sum;
  }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(sumFirstNEvenFib(n));
    }
}