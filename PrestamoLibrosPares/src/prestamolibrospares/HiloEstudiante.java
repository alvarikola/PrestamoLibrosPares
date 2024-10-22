package prestamolibrospares;
import java.util.Random;

public class HiloEstudiante implements Runnable {
    private String nombre;
    private Libro[] libros;
    private Random random = new Random();

    public HiloEstudiante(String nombre, Libro[] libros) {
        this.nombre = nombre;
        this.libros = libros;
    }

    @Override
    public void run() {
        while (true) {
            // Seleccionar dos libros al azar
            int libro1Index = random.nextInt(libros.length);
            int libro2Index;
            do {
                libro2Index = random.nextInt(libros.length);
            } while (libro1Index == libro2Index);

            // Simulación de préstamo de libros
            System.out.println(nombre + " ha seleccionado los libros: " + libros[libro1Index].getNombreLibro() + " (ID: " + libros[libro1Index].getIsbn() + ") y " + libros[libro2Index].getNombreLibro() + " (ID: " + libros[libro2Index].getIsbn() + ")");

            // Simular tiempo de uso (entre 1 y 3 minutos)
            int tiempoUso = 1000 * (1 + random.nextInt(3)); // convertir a milisegundos
            try {
                Thread.sleep(tiempoUso);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }

            System.out.println(nombre + " ha devuelto los libros: " + libros[libro1Index].getNombreLibro() + " (ID: " + libros[libro1Index].getIsbn() + ") y " + libros[libro2Index].getNombreLibro() + " (ID: " + libros[libro2Index].getIsbn() + ")");

            // Simular tiempo de descanso (entre 1 y 2 minutos)
            int tiempoDescanso = 1000 * (1 + random.nextInt(2)); // convertir a milisegundos
            try {
                Thread.sleep(tiempoDescanso);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}




