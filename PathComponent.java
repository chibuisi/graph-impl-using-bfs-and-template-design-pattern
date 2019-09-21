package graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class PathComponent extends BreadthFirstSearch {
    List<Vertex> vertices = new ArrayList<>();
    HashMap<Vertex,Integer> comps = new HashMap<>();
    int level = 1;

    public PathComponent(Graph graph) {
        super(graph);
    }

    @Override
    public void processEdge(Edge edge){

    }

    @Override
    public void processVertex(Vertex v1){
        vertices.add(v1);
        comps.put(v1,level);
    }

    @Override
    public void additionalProcessing(){
        ++level;
    }
}
