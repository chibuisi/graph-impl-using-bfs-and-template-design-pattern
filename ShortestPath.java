package graph;

import java.util.HashMap;

public class ShortestPath extends BreadthFirstSearch {
    HashMap<Vertex,Integer> levels = new HashMap<>();
    HashMap<Vertex,Vertex> map = new HashMap<>();
    public ShortestPath(Graph graph) {
        super(graph);
    }
    @Override
    public void processVertex(Vertex vertex){
        if(levels.isEmpty()){
            levels.put(vertex,0);
        }
        else{
            levels.put(vertex,levels.get(map.get(vertex))+1);
        }
    }
    @Override
    public void processEdge(Edge edge){
        map.put(edge.u,edge.v);
    }
    public int shortestPath(Vertex v1, Vertex v2){
        start(v1);
        return levels.get(v2);
    }
}
