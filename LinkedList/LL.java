import java.util.Scanner;
import java.util.HashSet;
public class LL {
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
static void createCycle(int p){
if (p == 0) return;
Node temp=head;
Node cn=null;
int count=1;
while(temp.next!= null){
if(count == p){
cn=temp;
}
temp=temp.next;
count++;
}
if(cn!=null){
temp.next=cn;
}}
static Node isCycleExist(Node head) {
HashSet<Node> hs = new HashSet<>();
Node curr = head;
while (curr != null) {
if (hs.contains(curr)) 
return curr;
hs.add(curr);
curr = curr.next;
}
return null;
}
public static void main(String args[]) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter n :");
int n = sc.nextInt();
for(int i=1; i<=n ; i++){
insert(sc.nextInt());
}
createCycle(3);
Node res=isCycleExist(head);
if(res == null){
System.out.println("Null");
}
else
System.out.println(res.data);
sc.close();
}
}