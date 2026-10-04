import java.util.Scanner;

public class Fibo7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int res = fibn(n);
        System.out.print("nth even fibonacci number : "+res);
        sc.close();
    }
   static int fibn(int n){
        if(n==1)    return 0;
        if(n==2)    return 2;
        int a=0,b=2,c=0;
        for(int i=3;i<=n;i++){
            c=4*b+a;
            a=b;
            b=c;
        }
        return c;
    }
}