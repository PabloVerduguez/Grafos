public class Edge {
    private String personaje1;
    private String personaje2;
    private int numInteracciones;

    public String getPersonaje1() {
        return this.personaje1;
    }

    public void setPersonaje1(String personaje1) {
        this.personaje1 = personaje1;
    }

    public String getPersonaje2() {
        return this.personaje2;
    }

    public void setPersonaje2(String personaje2) {
        this.personaje2 = personaje2;
    }

    public int getNumInteracciones() {
        return this.numInteracciones;
    }

    public void setNumInteracciones(int numInteracciones) {
        this.numInteracciones = numInteracciones;
    }

    Edge(String personaje1, String personaje2, int numInteracciones) {
        this.personaje1 = personaje1;
        this.personaje2 = personaje2;
        this.numInteracciones = numInteracciones;
    }
}
