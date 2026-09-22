import java.util.*;
public class DP5 {
public static int countWays(int n) {
if(n == 1)
return 1;
else if(n == 2)
return 2;
else if(n ==3)
return 4;
else
return countWays(n-1)+countWays(n-2)+countWays(n-3);
}
public static void main(String args[]) {
Scanner sc = new Scanner(System.in); 
int n = sc.nextInt();
System.out.println("No. of Ways : "+countWays(n)); 
}
}
