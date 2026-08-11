import java.util.Scanner;
import java.util.Stack;
public class LLPalindrome {
static Node head = null;
static class Node {
int data;
Node next;
Node(int data, Node next) {
this.data = data;
this.next = next;
}
}
static void insert(int value) {
Node newNode = new Node(value, null);
if (head == null) {
head = newNode;
return;
}
Node temp = head;
while (temp.next != null) {
temp = temp.next;
}
temp.next = newNode;
}
static boolean isPalindrome(Node head) {
Stack<Integer> st = new Stack<>();
Node temp = head;
while (temp != null) {
st.push(temp.data);
temp = temp.next;
}
temp = head;
while (temp != null) {
if (st.pop() != temp.data) return false;
temp = temp.next;
}
return true;
}
public static void main(String args[]) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter number of elements: ");
int n = sc.nextInt();
for (int i = 1; i <= n; i++) {
insert(sc.nextInt());
}
System.out.println("Is Palindrome: " + isPalindrome(head));
sc.close();
}
}