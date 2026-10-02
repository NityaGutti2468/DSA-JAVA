import java.util.Scanner;
public class Fibo4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        fibn(n);
    }
    static void fibn(int n){
        int a=0,b=1,c;
        System.out.print(a+" "+b);
        while(true){
            c=a+b;
            if(c>n)
                break;
            System.out.print(" "+c);
            a=b;
            b=c;
        }
    }
}