import java.util.Scanner;
class Graph{
int[][] adjmat;
int v;
Graph(int n){
v = n;
adjmat = new int[n][n];
}
void addedge(int u, int v){
adjmat[u][v] = 1;
adjmat[v][u] = 1;
}
void display(){
for(int i=0; i<v; i++){
for(int j=0; j<v; j++){
System.out.print(adjmat[i][j] + " ");
}
System.out.println();
}}
void DFS(int s, boolean[] visited){
visited[s] = true;
System.out.print(s + " ");
for(int i=0; i<v; i++){
if(adjmat[s][i] == 1 && !visited[i]){
DFS(i, visited);
}}}}
class BFS{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.print("Enter v: ");
int n = sc.nextInt();
Graph g = new Graph(n);
System.out.print("Enter edges: ");
int e = sc.nextInt();
System.out.println("Enter each edge (u v):");
for(int i=0; i<e; i++){
int u = sc.nextInt();
int v = sc.nextInt();
g.addedge(u, v);
}
boolean[] visited = new boolean[n];
System.out.print("Enter source: ");
int start = sc.nextInt();
System.out.println("DFS Traversal:");
g.DFS(start, visited);
}}