import java.util.Scanner;
public class LLPalindrome1 {
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
static Node cloneList(Node head) {
if (head == null) return null;
Node newHead = new Node(head.data, null);
Node currOriginal = head.next;
Node currClone = newHead;
while (currOriginal != null) {
currClone.next = new Node(currOriginal.data, null);
currClone = currClone.next;
currOriginal = currOriginal.next;
}
return newHead;
}
static Node reverse(Node head) {
Node prev = null;
Node curr = head;
while (curr != null) {
Node next = curr.next;
curr.next = prev;
prev = curr;
curr = next;
}
return prev;
}
static boolean isPalindrome(Node head) {
Node clonedHead = cloneList(head);
Node reversedHead = reverse(clonedHead);
Node p1 = head;
Node p2 = reversedHead;
while (p1 != null && p2 != null) {
if (p1.data != p2.data) return false;
p1 = p1.next;
p2 = p2.next;
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