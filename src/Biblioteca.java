public class Biblioteca {

    protected Libros[] catalogo;
    private int contador;

    public Biblioteca(int capacidad) {
        catalogo = new Libros[capacidad];
        contador = 0;
    }

    public void agregarLibro(Libros libro) {
        if (contador < catalogo.length) {
            catalogo[contador] = libro;
            contador++;
        } else {
            System.out.println("La biblioteca está llena.");
        }
    }

    public void mostrarLibros() {

        System.out.println("📚 Catálogo de la Biblioteca:");
        System.out.println("----------------------------");

        System.out.println("Catálogo de la biblioteca:");
        for (int i = 0; i < contador; i++) {
            System.out.println((i + 1) + ". " + catalogo[i]);
        }
    }

}
