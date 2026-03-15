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

    public boolean prestarLibro(String titulo) {
        for (int i = 0; i < contador; i++) {
            if (catalogo[i].getTitulo().equalsIgnoreCase(titulo)) {
                if (!catalogo[i].isPrestado()) {
                    catalogo[i].setPrestado(true);
                    System.out.println("El libro ha sido prestado.");
                    return true;
                } else {
                    System.out.println("El libro ya está prestado.");
                    return false;
                }
            }
        }
        System.out.println("Libro no encontrado.");
        return false;
    }

    public boolean devolverLibro(String titulo) {
        for (int i = 0; i < contador; i++) {
            if (catalogo[i].getTitulo().equalsIgnoreCase(titulo)) {
                if (catalogo[i].isPrestado()) {
                    catalogo[i].setPrestado(false);
                    System.out.println("El libro ha sido devuelto.");
                    return true;
                } else {
                    System.out.println("Ese libro no estaba prestado.");
                    return false;
                }
            }
        }
        System.out.println("Libro no encontrado.");
        return false;
    }

}
