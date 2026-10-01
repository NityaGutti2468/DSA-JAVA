import java.util.Scanner;

public class Fibo1 {
public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   int n = sc.nextInt();
   int res = fibn(n);
   System.out.print("nth fibonacci Value :"+res);
 }
  static int fibn(int n){
     if(n==0)    
       return 0;
     if(n==1)    
       return 1;
     int a=0,b=1,c=0;
     for(int i=2;i<=n;i++){
       c=a+b;
       a=b;
       b=c;
     }
 return c;
    }
}