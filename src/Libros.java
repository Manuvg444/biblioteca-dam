public class Libros {

    protected String autor;
    protected String nombre;
    protected boolean prestado;

    public Libros(String autor, String nombre) {
        this.autor = autor;
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Título: " + nombre + ", Autor: " + autor;
    }

}
