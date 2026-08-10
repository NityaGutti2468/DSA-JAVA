import java.util.Scanner;

class Node {
int data;
Node next;
Node(int data, Node next) {
this.data = data;
this.next = next;
}
}
public class LL15 {
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
static Node evenFirstOddLast(Node head){
Node evenHead = null;
Node oddHead = null;
Node temp =head;
while(temp != null){
if(temp.data % 2 == 0){
evenHead = insertEnd(evenHead, temp.data);
}else{
oddHead = insertEnd(oddHead, temp.data);
}
temp = temp.next;
}
if(evenHead == null)
return oddHead;
Node t = evenHead;
while(t.next != null)
t = t.next;
t.next = oddHead;

return evenHead;
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

head = evenFirstOddLast(head);
System.out.print("Even first Odd last: ");
display(head);
}
}
