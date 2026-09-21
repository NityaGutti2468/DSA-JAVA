import java.util.*;
public class DP4 {
public static int countWays(int n) {
int f[]=new int[n+1];
f[1]=1;
f[2]=2;
for(int i=3; i<=n ;i++){
f[i]=f[i-1]+f[i-2];
}
return f[n];
}
public static void main(String args[]) {
Scanner sc = new Scanner(System.in); 
int n = sc.nextInt();
System.out.println("No. of Ways : "+countWays(n)); 
}
}
