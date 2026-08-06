import java.util.Arrays;
import java.util.Scanner;
public class Anagram1 {
public static boolean checkAnagram(String s1 , String s2){
if(s1.length() != s2.length()){
return false;
}
else{
s1 = s1.toLowerCase();
s2 = s2.toLowerCase();
char[] c1 = s1.toCharArray();
char[] c2 = s2.toCharArray();
Arrays.sort(c1);
Arrays.sort(c2);
if(Arrays.equals(c1,c2))
return true;
else 
return false;
}
}
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
String s1 = sc.next();
String s2 = sc.next();
if(checkAnagram(s1,s2)){
System.out.println("Anagram !");
}
else{
System.out.println("Not Anagram !");
}
sc.close();
}
}