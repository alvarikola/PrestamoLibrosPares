package prestamolibrospares;

public class PrestamoLibrosPares {
    public static int NUMERO_LIBROS = 9;
    public static int NUMERO_ESTUDIANTES = 4; 
    public static int MAX_PRESTAMOS = 4; // Número de veces que cada estudiante puede tomar libros


    public static void main(String[] args) {
        // Crear los libros
        Libro libros[] = new Libro[NUMERO_LIBROS];
        libros[0] = new Libro(1, "Java para principiantes");
        libros[1] = new Libro(2, "Python para principiantes");
        libros[2] = new Libro(3, "HTML para principiantes");
        libros[3] = new Libro(4, "PHP para principiantes");
        libros[4] = new Libro(5, "Java avanzado");
        libros[5] = new Libro(6, "Python avanzado");
        libros[6] = new Libro(7, "HTML y CSS");
        libros[7] = new Libro(8, "PHP avanzado");
        libros[8] = new Libro(9, "Cómo montar tu propio ordenador");

        GestorPrestamo gestor = new GestorPrestamo(libros);

        // Crear los estudiantes
        Thread estudiantes[] = new Thread[NUMERO_ESTUDIANTES];
        
        estudiantes[0] = new Thread(new HiloEstudiante("Andrei", libros, gestor, MAX_PRESTAMOS));
        estudiantes[1] = new Thread(new HiloEstudiante("Samuel", libros, gestor, MAX_PRESTAMOS));
        estudiantes[2] = new Thread(new HiloEstudiante("Yoel", libros, gestor, MAX_PRESTAMOS));
        estudiantes[3] = new Thread(new HiloEstudiante("Ángel", libros, gestor, MAX_PRESTAMOS));

        
        
        estudiantes[0].start();
        estudiantes[1].start();
        estudiantes[2].start();
        estudiantes[3].start();
        

        for (Thread estudiante : estudiantes) {
            try {
                estudiante.join();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}





        

       
        
    

