import java.util.*;

public class Graph {
    static boolean[] visited;
    static void addEdge(ArrayList<ArrayList<Integer>> adj,int u,int v){
        adj.get(u).add(v);
        adj.get(v).add(u);
    }
    static void printgraph(ArrayList<ArrayList<Integer>> adj){
        for(int i=0;i<adj.size();i++){
            System.out.print(i+": ");
            for(int j=0;j<adj.get(i).size();j++){
                System.out.print(adj.get(i).get(j)+" ");
            }
            System.out.print("\n");
        }
    }
    static void bfs(ArrayList<ArrayList<Integer>> adj,int vertices,int i){
        boolean arr[] = new boolean[vertices];
        for(int k=0;k<vertices;k++){
            arr[k] = false;
        }
        Queue<Integer> q = new LinkedList<Integer>();
        q.add(i);
        arr[i]=true;
        while(q.size()>0){
            int r = q.peek();
            System.out.print(r+" ");
            q.remove();
            for(int j=0;j<adj.get(r).size();j++){
                if(arr[adj.get(r).get(j)]==false){
                    q.add(adj.get(r).get(j));
                    arr[adj.get(r).get(j)]=true;
                }
            }
        }
        System.out.println();
    }
    static void dfs(ArrayList<ArrayList<Integer>> adj,int i){
        System.out.print(i+" ");
        visited[i]=true;
        for(int j=0;j<adj.get(i).size();j++){
            if(visited[adj.get(i).get(j)]==false){
                dfs(adj,adj.get(i).get(j));
            }
        }
    }
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter vertices: ");
        int v;
        v = s.nextInt();
        ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>(v);
        int n ;
        System.out.print("Enter number of Edges: ");
        n = s.nextInt();
        for(int i=0;i<v;i++){
            adj.add(new ArrayList<>());
        }
        while(n>0){
            int a,b;
            System.out.print("Enter Edges: ");
            a = s.nextInt();
            b = s.nextInt();
            addEdge(adj, a, b);
            n--;
        }
        printgraph(adj);
        bfs(adj,v,0);
        visited = new boolean[v];
        for(int i=0;i<v;i++){
            visited[i]=false;
        }
        dfs(adj,0);
        System.out.print("\n");
        s.close();
    }
}
//5 7 0 1 0 4 1 2 1 3 1 4 2 3 3 4