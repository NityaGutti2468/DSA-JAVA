import java.util.*;
class Graph{
ArrayList<ArrayList<int[]>> M;
int v;
Graph(int n){
v = n;
M = new ArrayList<ArrayList<int[]>>(n);
for(int i=0; i<n; i++){
M.add(new ArrayList<int[]>());
}
}
void addedge(int u, int w, int wt){
M.get(u).add(new int[]{w, wt});
M.get(w).add(new int[]{u, wt}); 
}
void display(){
for(int i=0; i<v; i++){
System.out.print(i + " -> ");
for(int j=0; j<M.get(i).size(); j++){
int[] edge = M.get(i).get(j);
System.out.print("(" + edge[0] + "," + edge[1] + ") ");
}
System.out.println();
}
}
}
class Graph7{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.print("Enter v: ");
int n = sc.nextInt();
Graph g = new Graph(n);
System.out.print("Enter edges: ");
int e = sc.nextInt();
System.out.println("Enter each edge (u v w):");
for(int i=0; i<e; i++){
int u = sc.nextInt();
int w = sc.nextInt();
int wt = sc.nextInt();
g.addedge(u, w, wt);
}
System.out.println("Adjacency List:");
g.display();
}
}