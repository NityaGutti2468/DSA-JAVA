import java.util.*;
public class DP13 {
public static String LCS(String s1,String s2 , int m , int n) {
if (m == 0 || n == 0)
return " ";
if (s1.charAt(m-1) == s2.charAt(n-1))
return LCS(s1,s2,m-1,n-1)+s1.charAt(m-1);
else{
String s11=LCS(s1,s2,m,n-1) ;
String s22=LCS(s1,s2,m-1,n) ;
if(s11.length() > s22.length())
return s11;
else
return s22;
}
}
public static void main(String args[]) {
Scanner sc = new Scanner(System.in); 
String s1 = sc.next();
String s2 = sc.next();
int m=s1.length();
int n=s2.length();
System.out.println("Longest Subsequence : "+LCS(s1,s2,m,n)); 
}
}
