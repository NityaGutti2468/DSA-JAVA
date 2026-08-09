import java.util.Scanner;
class Node{
int data;
Node next;
Node(int data, Node next){
this.data=data;
this.next=next;
}
}
public class LL5{
static Node head=null;
static Node insertEnd(Node head,int x){
Node p=new Node(x,null);
if(head==null)
return p;
Node p1=head;
while(p1.next!=null)
p1=p1.next;
p1.next=p;
return head;
}
static Node moveLastToFront(Node head){
if(head==null || head.next==null)
return head;
return moveLastToFront1(head);
}
static Node moveLastToFront1(Node head){
if(head.next.next==null){
Node last=head.next;
head.next=null;
last.next=head;
return last;
}
Node newHead=moveLastToFrontUtil(head.next);
head.next=newHead.next;
newHead.next=head;
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
int n=sc.nextInt();

for(int i=0;i<n;i++){
int x=sc.nextInt();
head=insertEnd(head,x);
}

System.out.print("Before: ");
display(head);

head=moveLastToFront(head);

System.out.print("After: ");
display(head);
}
}
