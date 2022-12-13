import java.util.ArrayList;
import java.util.List;

public class Node {
    private String personaje;
    private List<Edge> edges;

    public String getPersonaje() {
        return this.personaje;
    }

    public Node(String personaje) {
        this.personaje = personaje;
    }

    public List<Edge> getEdges() {
        return this.edges;
    }

    public void addEdge(Edge edge) {
        if (edges == null) {
            edges = new ArrayList<>();
        }
        edges.add(edge);
    }

    @Override
    public String toString() {
        return "\n \tNode [Personaje=" + personaje + ", edges=" + edges + "]";
    }
}
