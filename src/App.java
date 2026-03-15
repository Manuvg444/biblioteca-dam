public class App {
    public static void main(String[] args) throws Exception {

        Biblioteca biblioteca = new Biblioteca(10);

        Libros libro1 = new Libros("Miguel Cervantes", "Quijote");
        Libros libro2 = new Libros("Cien Años de Soledad", "Gabriel García");

        biblioteca.agregarLibro(libro1);
        biblioteca.agregarLibro(libro2);

        biblioteca.mostrarLibros();
    }
}
