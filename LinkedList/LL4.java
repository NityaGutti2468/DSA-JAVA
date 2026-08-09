import java.util.Scanner;
class Node{
int data;
Node next;
Node(int data,Node next){
this.data=data;
this.next=next;
}
}
public class LL4{
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
Node p1=head;
while(p1.next.next!=null){
p1=p1.next;
}
Node last=p1.next;
p1.next=null;
last.next=head;
head=last;
return head;
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
