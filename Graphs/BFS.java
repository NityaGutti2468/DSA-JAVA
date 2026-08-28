import java.util.*;
class Graph {
int[][] adjmat;
int v;
Graph(int n) {
v = n;
adjmat = new int[n][n];
}
void addedge(int u, int v) {
adjmat[u][v] = 1;
adjmat[v][u] = 1;
}
void display() {
for (int i = 0; i < v; i++) {
for (int j = 0; j < v; j++) {
System.out.print(adjmat[i][j] + " ");
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
for (int i = 0; i < v; i++) {
if (adjmat[node][i] == 1 && !visited[i]) {
visited[i] = true;
q.add(i);
}}}}}
class Main {
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
int v = sc.nextInt();
g.addedge(u, v);
}

System.out.print("Enter source: ");
int start = sc.nextInt();

System.out.println("\nBFS Traversal:");
g.BFS(start);
}
}