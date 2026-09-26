import java.util.*;
public class DP10 {
public static int countPaths(int m,int n) {
int t[][] = new int[m][n];
for(int i=0; i<n ; i++){
t[0][i]=1;
}
for(int i=0; i<m ; i++){
t[i][0]=1;
}
for(int i=1; i<m ; i++){
for(int j=1; j<n ; j++){
t[i][j] = t[i][j-1]+t[i-1][j];
}}
return t[m-1][n-1];
}
public static void main(String args[]) {
Scanner sc = new Scanner(System.in);
System.out.println("Enter m n values :"); 
int m = sc.nextInt();
int n = sc.nextInt();
System.out.println("Count of Paths : "+countPaths(m,n)); 
}
}
