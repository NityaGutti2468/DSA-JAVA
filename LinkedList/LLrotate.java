import java.util.Scanner;
public class LLrotate {
static Node head=null;
static class Node {
int data;
Node next;
Node(int data, Node next) {
this.data = data;
this.next = next;
}
}
static void insert(int value) {
Node p = new Node(value, null);
if (head == null) {
head = p;
return;
}
Node temp = head;
while (temp.next != null) {
temp = temp.next;
}
temp.next = p;
}
static void display(Node head) {
Node temp = head;
while (temp != null) {
System.out.print(temp.data + " ");
temp = temp.next;
}
}
static Node rotate(Node head,int k){
for(int i=0; i<k ;i++){
Node p=null;
Node p1=head;
while(p1.next != null){
p=p1;
p1=p1.next;
}
p.next=null;
p1.next=head;
head=p1;
}
return head;
}
public static void main(String args[]) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter n :");
int n = sc.nextInt();
for(int i=1; i<=n ; i++){
insert(sc.nextInt());
}
System.out.print("Enter k :");
int k = sc.nextInt();
Node res=rotate(head,k);
display(res);
sc.close();
}
}