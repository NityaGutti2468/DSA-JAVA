import java.util.*;
public class DP18 {
public static int minCost(int[][] cost, int m, int n) {
if(m == 0 || n == 0) return 0;
int up=minCost(cost,m-1,n);
int left=minCost(cost,m,n-1);
int diag=minCost(cost,m-1,n-1);
return Math.min(up,Math.min(left,diag))+cost[m-1][n-1];
}
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int m = sc.nextInt();
int n = sc.nextInt();
int[][] cost = new int[m][n];
System.out.println("Enter matrix values:");
for (int i = 0; i < m; i++) {
for (int j = 0; j < n; j++) {
cost[i][j] = sc.nextInt();
}}
System.out.println("Minimum Cost Path : " + minCost(cost, m-1, n-1));
}}
