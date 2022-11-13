import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class BFS {
    public static void main(String[] args) {

    }
}
class neoGraph{
    static int V;
   static LinkedList<Integer> adj[];

    neoGraph(int v) {
        V = v;
        for (int i = 0; i < v; i++) {
            adj[i] = new LinkedList<>();
        }
    }
    static void addEdges(int a , int b){
        adj[a].add(b);
    }
    static void BFS(int a){
        boolean []isVisted = new boolean[V];

        Queue<Integer> q = new LinkedList<>();

        q.add(a);
        isVisted[a] =  true;

       while(q.size() <= 0){
          a = q.poll();
          
       }


    }
}
