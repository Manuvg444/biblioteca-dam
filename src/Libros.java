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

    public String getAutor() {
        return autor;
    }

    public String getTitulo() {
        return nombre;
    }

    public boolean isPrestado() {
        return prestado;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrestado(boolean prestado) {
        this.prestado = prestado;
    }

}
