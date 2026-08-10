import java.util.Scanner;
class Node {
int data;
Node next;
Node(int data, Node next) {
this.data = data;
this.next = next;
}
}
public class LL17{
static Node head=null;
static Node insertBegin(Node head,int x){
Node p=new Node(x,null);
p.next=head;
head=p;
return head;
}
static boolean modify(Node head, int x){
Node p=head;
while(p!=null){
if(p.data==x)
return true;
p=p.next;
}
return false;
}
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
for(int i=0;i<n;i++){
int value=sc.nextInt();
head=insertBegin(head,value);
}
int x=sc.nextInt();   
if(modify(head,x))
System.out.println("Element found");
elsegf
System.out.println("Element not found");
}
}
