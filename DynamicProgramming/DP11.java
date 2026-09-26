import java.util.*;
public class DP11 {
public static int countPaths(int m,int n) {
if (m == 1 ||n == 1)
return 1;
else 
return countPaths(m-1,n)+countPaths(m,n-1)+countPaths(m-1, n-1);
}
public static void main(String args[]) {
Scanner sc = new Scanner(System.in);
System.out.println("Enter m n values :"); 
int m = sc.nextInt();
int n = sc.nextInt();
System.out.println("Count of Paths : "+countPaths(m,n)); 
}
}
