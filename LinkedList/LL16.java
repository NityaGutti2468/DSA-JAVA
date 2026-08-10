import java.util.Scanner;
class Node {
int data;
Node next;
Node(int data, Node next) {
this.data = data;
this.next = next;
}
}
public class LL16 {
static Node head = null;
static Node insertEnd(Node head, int x){
Node p = new Node(x, null);
if(head == null)
return p;
Node temp = head;
while(temp.next != null)
temp = temp.next;
temp.next = p;
return head;
}
static Node oddFirstEvenLast(Node head){
Node oddHead = null;
Node evenHead = null;
Node temp = head;
while(temp != null){
if(temp.data % 2 != 0){
oddHead = insertEnd(oddHead, temp.data);
}else{
evenHead = insertEnd(evenHead, temp.data);
}
temp = temp.next;
}
if(oddHead == null)
return evenHead;
Node t = oddHead;
while(t.next != null)
t = t.next;
t.next = evenHead;

return oddHead;
}

static void display(Node head){
Node temp = head;
while(temp != null){
System.out.print(temp.data + " ");
temp = temp.next;
}
System.out.println();
}

public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();

for(int i=0;i<n;i++){
int x = sc.nextInt();
head = insertEnd(head, x);
}

head = oddFirstEvenLast(head);
System.out.print("Odd first Even last: ");
display(head);
}
}
