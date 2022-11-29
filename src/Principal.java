import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Principal {
    public static void main(String[] args) throws IOException {
        leerFichero2();
    }

    private static void leerFichero2() throws IOException {
        String fuente, objetivo;
        int peso, i=1;
		String line;
		try (BufferedReader br = new BufferedReader(new FileReader("C:/Users/pablo/Desktop/GitHub/Grafos/Grafos_NoLineales/Grafos/src/marvel-unimodal-edges.csv"))) {
			while ((line = br.readLine()) != null) {
				String[] split = line.split(",(?=([^\"]*\"[^\"]*\")*[^\"]*$)");
				fuente = split[0];
				objetivo = split[1];
				peso = Integer.valueOf(split[2]);
                System.out.println(fuente + " " + objetivo + " " + peso);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
