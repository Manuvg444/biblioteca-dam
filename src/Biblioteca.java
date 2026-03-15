public class Biblioteca {

    protected Libros[] catalogo;
    private int contador;

    public Biblioteca(int capacidad) {
        catalogo = new Libros[capacidad];
        contador = 0;
    }

}
