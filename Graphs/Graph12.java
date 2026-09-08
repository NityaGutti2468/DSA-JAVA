import java.util.*;
class Graph{
HashMap<Integer, ArrayList<int[]>> M;
int v;
Graph(int n){
v = n;
M = new HashMap<>();
for(int i=0; i<n; i++){
M.put(i, new ArrayList<int[]>());
}
}
void addedge(int u, int w, int wt){
M.get(u).add(new int[]{w, wt}); 
}
void display(){
for(int i=0; i<v; i++){
System.out.print(i + " -> ");
for(int[] edge : M.get(i)){
System.out.print("(" + edge[0] + "," + edge[1] + ") ");
}
System.out.println();
}}}
class Graph12{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int e = sc.nextInt();
Graph g = new Graph(n);
for(int i=0; i<e; i++){
int u = sc.nextInt();
int w = sc.nextInt();
int wt = sc.nextInt();
g.addedge(u, w, wt);
}
g.display();
}
}