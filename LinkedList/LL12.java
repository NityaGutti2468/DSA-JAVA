import java.util.Scanner;
class Node {
int data;
Node next;
Node(int data) {
this.data = data;
this.next = null;
}
}
public class LL12 {
static Node head = null;
static Node insertLast(Node head, int x) {
Node p = new Node(x);
if (head == null) {
return p;
}
Node temp = head;
while (temp.next != null) {
temp = temp.next;
}
temp.next = p;
return head;
}
static void traverse(Node head) {
Node temp = head;
while (temp != null) {
System.out.print(temp.data + "-> ");
temp = temp.next;
}
System.out.println();
}
static Node swap(Node head) {
if (head == null || head.next == null)
return head;
Node p1 = head;
Node p2 = head.next;
while (p1 != null && p2 != null) {
int t = p1.data;
p1.data = p2.data;
p2.data = t;
if (p2.next == null)
break;
p1 = p2.next;
p2 = p1.next;
}
return head;
}
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Enter number of elements:");
int n = sc.nextInt();
System.out.println("Enter elements:");
for (int i = 0; i < n; i++) {
int value = sc.nextInt();
head = insertLast(head, value);
}

System.out.println("Original List:");
traverse(head);

head = swap(head);

System.out.println("After Pairwise Swap:");
traverse(head);

sc.close();
}
}
