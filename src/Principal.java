import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
//import java.util.OpenGraph;

public class Principal {
    public static void main(String[] args) throws IOException {
		Graph graph = leerFichero2();
        System.out.println(graph);
    }

    /**
     * @return
     * @throws IOException
     */
    private static Graph leerFichero2() throws IOException {
        String fuente, objetivo;
		Graph graph = new Graph();
        int peso, i=1;
		String line;
		try (BufferedReader br = new BufferedReader(new FileReader("C:/Users/pablo/Desktop/GitHub/Grafos/Grafos_NoLineales/Grafos/src/marvel-unimodal-edges.csv"))) {
			while ((line = br.readLine()) != null) {
				String[] split = line.split(",(?=([^\"]*\"[^\"]*\")*[^\"]*$)");
				fuente = split[0]; //Personaje 1
				objetivo = split[1]; //Personaje 2
				peso = Integer.valueOf(split[2]);
				Node p1 = new Node(fuente);
				Node p2 = new Node(objetivo);
				p1.addEdge(new Edge(p1, p2, peso));
				graph.addNode(p1);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return graph;
	}
}
