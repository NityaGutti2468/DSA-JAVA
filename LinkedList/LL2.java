import java.util.Scanner;
class Node {
int data;
Node next;
Node(int data, Node next) {
this.data = data;
this.next = next;
}
}
public class LL2{
static Node head=null;
static Node insertBegin(Node head,int x){
Node p=new Node(x,null);   
p.next=head;
head=p;
return head;
}
static int getLength(Node head){
Node temp=head;
int count=0;
while(temp!=null){
count++;
temp=temp.next;
}
return count;
}
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int n = sc.nextInt();
for(int i=0;i<n;i++){
int value=sc.nextInt();
head = insertBegin(head, value);
}
System.out.println("Length of linked list: " + getLength(head));
}
}
