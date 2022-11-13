import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

class newGraph<T>{
    HashMap<T,List<T>> map = new HashMap<>();

    public void addvertex(T s){
        map.put(s,new LinkedList<>());
    }
    public void addEdge(T source,T destination,boolean isbidirectional){
        if(!map.containsKey(source)) addvertex(source);
        if(!map.containsKey(destination)) addvertex(destination);

        map.get(source).add(destination);
        if(isbidirectional == true) map.get(destination).add(source);
    }

    public void vertexCount(){
        System.out.println("graph has " + map.keySet().size() + "Vertix");
    }
    public void edgeCount(boolean isbidirectional){
        int count = 0;
        for(T e : map.keySet()){
            count += map.get(e).size();
        }
        if(isbidirectional == true) count = count/2;
        System.out.println("The graph has "+ count + "Edges");

    }
    public void hasVertex(T v){
        if(map.containsKey(v)) System.out.println("map has the vertex"+ v);
        else System.out.println("map does not has the vertex " + v);
    }
    public void hasEdge(T source, T destination){
        if(map.get(source).contains(destination)) System.out.println("map has the required edge");
        else System.out.println("map does not have the required edge");
    }

    public String tooString()
    {
        StringBuilder builder = new StringBuilder();

        for (T v : map.keySet()) {
            builder.append(v.toString() + ": ");
            for (T w : map.get(v)) {
                builder.append(w.toString() + " ");
            }
            builder.append("\n");
        }

        return (builder.toString());
    }
}


class Main{
    public static void main(String[] args) {
        newGraph<Integer> gg = new newGraph<>();
        gg.hasVertex(1);
        gg.addEdge(1,3,true);
        gg.hasVertex(1);
        gg.addEdge(1,2,true);
        gg.addEdge(2,3,true);
        gg.addEdge(4,3,true);
        gg.addEdge(1,0,true);

        System.out.println(gg.tooString());

    }
}