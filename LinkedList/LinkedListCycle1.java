import java.util.Scanner;
public class LinkedListCycle1 {
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
static boolean isCycleExist(Node head) {
Node slow = head;
Node fast = head;
while (fast != null && fast.next != null) {
slow = slow.next;
fast = fast.next.next;
if (slow == fast) return true;
}
return false;
}
public static void main(String args[]) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter number of elements: ");
int n = sc.nextInt();
for (int i = 1; i <= n; i++) {
insert(sc.nextInt());
}
System.out.println("Cycle Exists: " + isCycleExist(head));
sc.close();
}
}