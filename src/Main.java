public class Main {
    public static void main(String[] args) {
        LibroDAO libroDAO = new LibroDAO.LibroDAOImpl();

        // Crear libros
        Libro libro1 = new Libro(1, "1984", "George Orwell", 1949);
        Libro libro2 = new Libro(2, "Cien Años de Soledad", "Gabriel García Márquez", 1967);
        libroDAO.crearLibro(libro1);
        libroDAO.crearLibro(libro2);

        // Leer libro
        System.out.println("Leyendo libro con id 1: " + libroDAO.leerLibro(1).getTitulo());

        // Leer todos los libros
        System.out.println("Todos los libros: ");
        for (Libro libro : libroDAO.leerTodosLosLibros()) {
            System.out.println(libro.getTitulo());
        }

        // Actualizar libro
        Libro libroActualizado = new Libro(1, "1984", "George Orwell", 1950);
        libroDAO.actualizarLibro(libroActualizado);

        // Eliminar libro
        libroDAO.eliminarLibro(2);
    }
}