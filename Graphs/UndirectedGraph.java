import java.util.*;
public class UndirectedGraph {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter number of vertices: ");
int n = sc.nextInt();
ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
for (int i = 0; i < n; i++) {
graph.add(new ArrayList<>());
}
System.out.print("Enter number of edges: ");
int e = sc.nextInt();
System.out.println("Enter edges (u v): ");
for (int i = 0; i < e; i++) {
int u = sc.nextInt();
int v = sc.nextInt();
graph.get(u).add(v);
graph.get(v).add(u);
}
System.out.println("\nAdjacency List Representation:");
for (int i = 0; i < n; i++) {
System.out.print(i + " -> ");
for (int neighbor : graph.get(i)) {
System.out.print(neighbor + " ");
}
System.out.println();
}
sc.close();
}
}