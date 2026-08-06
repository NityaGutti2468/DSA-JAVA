import java.util.HashMap;
import java.util.Scanner;
public class Anagram3 {
public static boolean checkAnagram(String s1, String s2) {
if (s1.length() != s2.length()) {
return false;
} else {
s1 = s1.toLowerCase();
s2 = s2.toLowerCase();
HashMap<Character, Integer> map = new HashMap<>();
for (char c : s1.toCharArray()) {
map.put(c, map.getOrDefault(c, 0) + 1);
}
for (char c : s2.toCharArray()) {
if(!map.containsKey(c)) 
return false;
map.put(c,map.get(c)-1);
}
for(char c : s1.toCharArray()){
if(map.get(c)!=0)
return false;
}
return true;
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