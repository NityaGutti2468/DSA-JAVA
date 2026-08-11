import java.util.Scanner;
import java.util.ArrayList;
public class LLPalindrome2 {
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
ArrayList<Integer> list = new ArrayList<>();
Node curr = head;
while (curr != null) {
list.add(curr.data);
curr = curr.next;
}
int i = 0;
int j = list.size() - 1;
while (i < j) {
if (!list.get(i).equals(list.get(j))) return false;
i++;
j--;
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