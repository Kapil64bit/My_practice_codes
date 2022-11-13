import java.util.Iterator;
import java.util.LinkedList;

public class dfs {
   private int v;

    private LinkedList<Integer> adj[];
    dfs(int v){
        this.v = v;
      adj = new LinkedList[v];
        for (int i = 0; i < v; i++) {

            adj[i] = new LinkedList();
        }
    }
    void addEdge(int v , int w){
        adj[v].add(w);
    }
    void dfsUtil(int v, boolean[] visited){
        visited[v] = true;
        System.out.println(v + " ");


        Iterator<Integer> i = adj[v].listIterator();
        while(i.hasNext()){
            int n = i.next();
            if(!visited[n]){
                dfsUtil(n,visited);
            }
        }

    }

   void Dfs(int v){
        boolean[] visited = new boolean[this.v];

        dfsUtil(v,visited);
   }

    public static void main(String[] args) {
        dfs g = new dfs(4);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);
        g.Dfs(3);
    }
}
