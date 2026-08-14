import java.util.*;
class reverseque {
public static void reverseQueue(Queue<Integer> q) {
Stack<Integer> stack = new Stack<>();
while (!q.isEmpty()) {
stack.push(q.remove());
}
while (!stack.isEmpty()) {
q.add(stack.pop());
}
}
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
Queue<Integer> q = new LinkedList<>();
System.out.print("Enter number of elements: ");
int n = sc.nextInt();
for (int i = 0; i < n; i++) {
q.add(sc.nextInt());
}
System.out.println("Original Queue: " + q);
reverseQueue(q);
System.out.println("Reversed Queue: " + q);
}
}