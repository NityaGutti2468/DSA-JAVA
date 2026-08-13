import java.util.*;
class Stack2que1 {
Queue<Integer> q1 = new LinkedList<>();
Queue<Integer> q2 = new LinkedList<>();
public void push(int x) {
q1.add(x);
}
public int pop() {
if (q1.isEmpty()) {
System.out.println("Stack is empty");
return -1;
}
while (q1.size() > 1) {
q2.add(q1.remove());
}
int popped = q1.remove();
Queue<Integer> temp = q1;
q1 = q2;
q2 = temp;
return popped;
}
public int peek() {
if (q1.isEmpty()) {
System.out.println("Stack is empty");
return -1;
}
while (q1.size() > 1) {
q2.add(q1.remove());
}
int top = q1.peek();
q2.add(q1.remove());
Queue<Integer> temp = q1;
q1 = q2;
q2 = temp;
return top;
}
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
Stack2que1 stack = new Stack2que1();
while (true) {
System.out.println("1. Push");
System.out.println("2. Pop");
System.out.println("3. Peek");
System.out.println("4. Exit");
System.out.print("Enter choice: ");
int choice = sc.nextInt();
switch (choice) {
case 1:
System.out.print("Enter value: ");
stack.push(sc.nextInt());
break;
case 2:
System.out.println("Popped: " + stack.pop());
break;
case 3:
System.out.println("Top element: " + stack.peek());
break;
case 4:
System.out.println("Exiting...");
return;
default:
System.out.println("Invalid choice!");
}
}
}
}