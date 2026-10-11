import java.util.*;
public class PriorityqueueDemo {
public static void main(String[] args) {
int N = 7; 
int[] elements = {50, 10, 30, 20, 60, 40, 70};
PriorityQueue<Integer> minHeap = new PriorityQueue<>();
for (int i = 0; i < N; i++) {
minHeap.add(elements[i]);
}
System.out.println("Traversing Min Heap using Iterator:");
Iterator<Integer> iterator = minHeap.iterator();
while (iterator.hasNext()) {
System.out.print(iterator.next() + " ");
}
}
}