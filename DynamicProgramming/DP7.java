import java.util.*;
public class DP7 {
public static int LCS(String s1,String s2 , int m , int n) {
if (m == 0 ||n == 0)
return 0;
else if (s1.charAt(m-1) == s2.charAt(n-1))
return 1+LCS(s1,s2,m-1,n-1);
else
return Math.max(LCS(s1,s2,m-1,n) , LCS(s1,s2,m,n-1) );
}
public static void main(String args[]) {
Scanner sc = new Scanner(System.in); 
String s1 = sc.next();
String s2 = sc.next();
int m=s1.length();
int n=s2.length();
System.out.println("Length of Longest Subsequence : "+LCS(s1,s2,m,n)); 
}
}
