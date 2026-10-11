import java.util.*;
public class PriorityqueueDemo1 {
public static void main(String[] args) {
int N = 7; 
int[] elements = {50, 10, 30, 20, 60, 40, 70};
PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
for (int i = 0; i < N; i++) {
maxHeap.add(elements[i]);
}
System.out.println("Traversing Max Heap using Iterator:");
Iterator<Integer> iterator = maxHeap.iterator();
while (iterator.hasNext()) {
System.out.print(iterator.next() + " ");
}
}
}