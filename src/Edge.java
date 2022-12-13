public class Edge {
    private Node personaje1;
    private Node personaje2;
    private int numInteracciones;

    public Node getPersonaje1() {
        return this.personaje1;
    }

    public void setPersonaje1(Node personaje1) {
        this.personaje1 = personaje1;
    }

    public Node getPersonaje2() {
        return this.personaje2;
    }

    public void setPersonaje2(Node personaje2) {
        this.personaje2 = personaje2;
    }

    public int getNumInteracciones() {
        return this.numInteracciones;
    }

    public void setNumInteracciones(int numInteracciones) {
        this.numInteracciones = numInteracciones;
    }

    Edge(Node personaje1, Node personaje2, int numInteracciones) {
        this.personaje1 = personaje1;
        this.personaje2 = personaje2;
        this.numInteracciones = numInteracciones;
    }

    @Override
    public String toString() {
        return "\n Edge [Personaje1=" + personaje1.getPersonaje() + ", personaje2=" + personaje2.getPersonaje() + ", interacciones="
                + numInteracciones + "]";
    }
}
