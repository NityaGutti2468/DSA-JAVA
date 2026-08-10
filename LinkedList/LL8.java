import java.util.Scanner;
class Node {
int data;
Node next;
Node(int data, Node next) {
this.data = data;
this.next = next;
}
}
public class LL8{
static Node head=null;
static Node insertEnd(Node head, int x){
Node p=new Node(x,null);
if(head==null)
return p;
Node temp=head;
while(temp.next!=null)
temp=temp.next;
temp.next=p;
return head;
}
static Node reverse(Node head){
if(head==null || head.next==null)
return head;
Node newHead = reverse(head.next);
head.next.next = head;
head.next = null;
return newHead;
}
static void display(Node head){
Node temp=head;
while(temp!=null){
System.out.print(temp.data+" ");
temp=temp.next;
}
System.out.println();
}
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int n = sc.nextInt();
for(int i=0;i<n;i++){
int value=sc.nextInt();
head = insertEnd(head, value);
}
head = reverse(head);
System.out.print("Reversed LL: ");
display(head);
}
}
