import java.util.Scanner;
class Node {
int data;
Node next;
Node(int data, Node next) {
this.data = data;
this.next = next;
}
}
public class LL14 {
static Node head = null;
static Node insertBegin(Node head, int x) {
Node p = new Node(x, null);
p.next = head;
head = p;
return head;
}
static int getNthFromEnd(Node head, int n) {
if (head == null || n <= 0)
return -1;
Node fast = head;
Node slow = head;
for (int i = 1; i <= n; i++) {
if (fast == null)
return -1;
fast = fast.next;
}
while (fast != null) {
slow = slow.next;
fast = fast.next;
}
return slow.data;
}
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int size = sc.nextInt();
for (int i = 0; i < size; i++) {
int value = sc.nextInt();
head = insertBegin(head, value);
}

int n = sc.nextInt();

int result = getNthFromEnd(head, n);
if (result == -1)
System.out.println("Invalid position");
else
System.out.println("Nth value from end: " + result);
}
}
