import java.util.*;
public class QueueUsingJCF {
public static void main(String[] args) {
Queue<Integer> queue = new LinkedList<>();
queue.add(10);
queue.add(20);
queue.add(30);
queue.offer(40); 
System.out.println("Queue after adding elements: " + queue);
System.out.println("Front element (peek): " + queue.peek());
System.out.println("Removed element: " + queue.poll());
System.out.println("Queue after removal: " + queue);
System.out.println("Is queue empty? " + queue.isEmpty());
System.out.println("Size of queue: " + queue.size());
System.out.println("Does queue contain 20? " + queue.contains(20));
System.out.print("Queue elements: ");
for (int num : queue) {
System.out.print(num + " ");
}
queue.clear();
System.out.println("\nQueue after clearing: " + queue);
}
}