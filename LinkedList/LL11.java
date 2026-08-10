import java.util.Scanner;
class Node {
int data;
Node next;
Node(int data, Node next) {
this.data = data;
this.next = next;
}
}
public class LL11{
static Node head=null;
static Node insertBegin(Node head,int x){
Node p=new Node(x,null);
p.next=head;
head=p;
return head;
}
static int getMiddle(Node head){
if(head==null)
return -1;
int count=0;
Node temp=head;
while(temp!=null){
count++;
temp=temp.next;
}
int mid = count/2;
temp=head;
for(int i=0;i<mid;i++){
temp=temp.next;
}
return temp.data;
}
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int n = sc.nextInt();
for(int i=0;i<n;i++){
int value=sc.nextInt();
head = insertBegin(head, value);
}

System.out.println("Middle value: " + getMiddle(head));
}
}
