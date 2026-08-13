import java.util.*;
class Queue2 {
Stack<Integer> s1=new Stack<>();
Stack<Integer> s2=new Stack<>();
void enqueue(int x) {
s1.push(x);
}
int dequeue() {
if(s1.isEmpty() && s2.isEmpty()) {
System.out.println("Queue is Empty");
return -1;
}
if(s2.isEmpty()) {
while(!s1.isEmpty()) {
s2.push(s1.pop());
}
}
return s2.pop();
}
int front() {
if(s1.isEmpty() && s2.isEmpty()) {
System.out.println("Queue is Empty");
return -1;
}
if(s2.isEmpty()) {
while(!s1.isEmpty()) {
s2.push(s1.pop());
}
}
return s2.peek();
}
int size() {
return s1.size()+s2.size();
}
public static void main(String[] args) {
Queue2 q=new Queue2();
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