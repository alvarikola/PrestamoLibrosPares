package prestamolibrospares;
import java.util.Random;


public class GestorPrestamo {
    private Libro[] libros;

    public GestorPrestamo(Libro[] libros) {
        this.libros = libros;
    }

    public Libro[] getLibros() {
        return libros;
    }
}
