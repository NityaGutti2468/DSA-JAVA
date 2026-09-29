import java.util.*;
public class DP17 {
public static int minCost(int[][] cost, int m, int n) {
int dp[][] = new int[m+1][n+1];
dp[0][0] = cost[0][0];
for (int j = 1; j <= n; j++) {
dp[0][j] = dp[0][j-1] + cost[0][j];
}
for (int i = 1; i <= m; i++) {
dp[i][0] = dp[i-1][0] + cost[i][0];
}
for (int i = 1; i <= m; i++) {
for (int j = 1; j <= n; j++) {
dp[i][j] = cost[i][j] + Math.min(dp[i-1][j], Math.min(dp[i][j-1], dp[i-1][j-1]));
}}
return dp[m][n];
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
