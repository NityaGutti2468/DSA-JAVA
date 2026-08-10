import java.util.Scanner;
class Node {
int data;
Node next;
Node(int data, Node next) {
this.data = data;
this.next = next;
}
}
public class LL13{
static Node head=null;
static Node insertBegin(Node head,int x){
Node p=new Node(x,null);
p.next=head;
head=p;
return head;
}
static int getN(Node head, int n){
if(n <= 0)
return -1;
Node p=head;
for(int i=1;i<=n-1;i++){
if(p==null)
return -1;
p=p.next;
}
if(p==null)
return -1;
return p.data;
}
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int size=sc.nextInt();      
for(int i=0;i<size;i++){
int value=sc.nextInt();
head=insertBegin(head,value);
}
int n=sc.nextInt();        
int result=getN(head,n);
if(result==-1)
System.out.println("Invalid position");
else
System.out.println("Nth value from beginning: "+result);
}
}
