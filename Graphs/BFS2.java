import java.util.*;
class Graph {
ArrayList<ArrayList<Integer>> M;
int v;
Graph(int n) {
v = n;
M = new ArrayList<ArrayList<Integer>>(n);
for (int i = 0; i < n; i++) {
M.add(new ArrayList<Integer>());
}
}
void addedge(int u, int w) {
M.get(u).add(w);
M.get(w).add(u);
}
void display() {
for (int i = 0; i < v; i++) {
System.out.print(i + " -> ");
for (int j = 0; j < M.get(i).size(); j++) {
System.out.print(M.get(i).get(j) + " ");
}
System.out.println();
}
}
void BFS(int s) {
boolean[] visited = new boolean[v];
Queue<Integer> q = new LinkedList<>();
visited[s] = true;
q.add(s);
while (!q.isEmpty()) {
int node = q.poll();
System.out.print(node + " ");
for (int neigh : M.get(node)) {
if (!visited[neigh]) {
visited[neigh] = true;
q.add(neigh);
}
}
}
}
}

class BFS2 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter v: ");
int n = sc.nextInt();
Graph g = new Graph(n);

System.out.print("Enter edges: ");
int e = sc.nextInt();
System.out.println("Enter each edge (u v):");
for (int i = 0; i < e; i++) {
int u = sc.nextInt();
int w = sc.nextInt();
g.addedge(u, w);
}

System.out.print("Enter source: ");
int start = sc.nextInt();

System.out.println("BFS Traversal:");
g.BFS(start);
}
}