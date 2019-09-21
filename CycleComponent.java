package graph;

import java.util.ArrayList;
import java.util.List;

public class CycleComponent extends BreadthFirstSearch {
    List<Vertex> vertices = new ArrayList<>();
    List<Edge> edges = new ArrayList<>();
    public CycleComponent(Graph graph) {
        super(graph);
    }

    @Override
    public void processVertex(Vertex vertex){
        vertices.add(vertex);
    }

    @Override
    public void processEdge(Edge edge){
        edges.add(edge);
    }
}
