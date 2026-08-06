import java.util.HashSet;
import java.util.Scanner;
public class Isogram1 {
public static boolean checkIsogram(String s) {
s = s.toLowerCase();
HashSet<Character> set = new HashSet<>();
for (char c : s.toCharArray()) {
if (c >= 'a' && c <= 'z') {
if (set.contains(c)) {
return false;
}
set.add(c);
}
}
return true;
}
public static void main(String args[]) {
Scanner sc = new Scanner(System.in);
String s = sc.nextLine();
System.out.println(checkIsogram(s) ? "Isogram !" : "Not Isogram !");
sc.close();
}
}