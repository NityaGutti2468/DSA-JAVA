import java.util.*;
class Queue1 {
Stack<Integer> s1=new Stack<>();
Stack<Integer> s2=new Stack<>();
void enqueue(int x) {
while(!s1.isEmpty()) {
s2.push(s1.pop());
}
s1.push(x);
while(!s2.isEmpty()) {
s1.push(s2.pop());
}
}
int dequeue() {
if(s1.isEmpty()) {
System.out.println("Queue is Empty");
return -1;
}
return s1.pop();
}
int front() {
if(s1.isEmpty()) {
System.out.println("Queue is Empty");
return -1;
}
return s1.peek();
}
int size() {
return s1.size();
}
public static void main(String[] args) {
Queue1 q=new Queue1();
Scanner sc=new Scanner(System.in);
while(true) {
System.out.println("1.Enqueue 2.Dequeue 3.Front 4.Size 5.Exit");
int choice=sc.nextInt();
switch(choice) {
case 1: System.out.println("Enter value"); q.enqueue(sc.nextInt()); break;
case 2: System.out.println("Dequeued: "+q.dequeue()); break;
case 3: System.out.println("Front: "+q.front()); break;
case 4: System.out.println("Size: "+q.size()); break;
case 5: System.exit(0);
default: System.out.println("Invalid choice");
}
}
}
}