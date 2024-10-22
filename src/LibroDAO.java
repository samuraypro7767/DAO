import java.util.List;
import java.util.ArrayList;

public interface LibroDAO {
    void crearLibro(Libro libro);

    Libro leerLibro(int id);

    List<Libro> leerTodosLosLibros();

    void actualizarLibro(Libro libro);

    void eliminarLibro(int id);


    public class LibroDAOImpl implements LibroDAO {
        private List<Libro> libros;

        public LibroDAOImpl() {
            libros = new ArrayList<>();
        }

        @Override
        public void crearLibro(Libro libro) {
            libros.add(libro);
            System.out.println("Libro añadido: " + libro.getTitulo());
        }

        @Override
        public Libro leerLibro(int id) {
            for (Libro libro : libros) {
                if (libro.getId() == id) {
                    return libro;
                }
            }
            return null;
        }

        @Override
        public List<Libro> leerTodosLosLibros() {
            return libros;
        }

        @Override
        public void actualizarLibro(Libro libro) {
            for (int i = 0; i < libros.size(); i++) {
                if (libros.get(i).getId() == libro.getId()) {
                    libros.set(i, libro);
                    System.out.println("Libro actualizado: " + libro.getTitulo());
                }
            }
        }

        @Override
        public void eliminarLibro(int id) {
            libros.removeIf(libro -> libro.getId() == id);
            System.out.println("Libro eliminado con id: " + id);
        }
    }
}
