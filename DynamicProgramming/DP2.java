import java.util.*;
public class DP2 {
public static int fib(int n) {
int f[]=new int[n+1];
f[1]=0;
f[2]=1;
for(int i=3; i<=n ;i++){
f[i]=f[i-1]+f[i-2];
}
return f[n];
}
public static void main(String args[]) {
Scanner sc = new Scanner(System.in); 
int n = sc.nextInt();
System.out.println("Nth fib : "+fib(n)); 
}
}
