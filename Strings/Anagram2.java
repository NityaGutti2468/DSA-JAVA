import java.util.HashMap;
import java.util.Scanner;
public class Anagram2 {
public static boolean checkAnagram(String s1, String s2) {
if (s1.length() != s2.length()) {
return false;
} else {
s1 = s1.toLowerCase();
s2 = s2.toLowerCase();
HashMap<Character,Integer> map1 = new HashMap<>();
HashMap<Character,Integer> map2 = new HashMap<>();
for (char c : s1.toCharArray()) {
map1.put(c, map1.getOrDefault(c, 0) + 1);
}
for (char c : s2.toCharArray()) {
map2.put(c, map2.getOrDefault(c, 0) + 1);
}
if(map1.equals(map2))
return true;
else 
return false;
}
}
public static void main(String args[]) {
Scanner sc = new Scanner(System.in);
String s1 = sc.next();
String s2 = sc.next();
if (checkAnagram(s1, s2)) {
System.out.println("Anagram !");
} else {
System.out.println("Not Anagram !");
}
sc.close();
}
}