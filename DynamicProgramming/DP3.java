import java.util.*;
public class DP3 {
public static int countWays(int n) {
if (n == 1)
return 1;
else if (n == 2)
return 2;
else
return countWays(n-1)+countWays(n-2);
}
public static void main(String args[]) {
Scanner sc = new Scanner(System.in); 
int n = sc.nextInt();
System.out.println("No. of Ways : "+countWays(n)); 
}
}
