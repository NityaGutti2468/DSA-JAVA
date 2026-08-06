import java.util.Scanner;
public class Reverse {
static String reverse(String s) {
String[] s1 = s.split("\\.");
String res = "";
for (int i = s1.length-1; i >= 0; i--) {
res += s1[i];
if (i != 0) {
res += ".";
}
}
return res;
}
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
String input = sc.nextLine();
System.out.println(reverse(input));
sc.close();
}
}