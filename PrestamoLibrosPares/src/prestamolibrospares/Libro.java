package prestamolibrospares;

public class Libro {
    int isbn;
    String nombreLibro;
    boolean prestado;
    
    
    public Libro(int isbn, String nombreLibro) {
        this.isbn = isbn;
        this.nombreLibro = nombreLibro;
        this.prestado = false;
    }
    
    public int getIsbn() {
        return isbn;
    }
    
    public String getNombreLibro() {
        return nombreLibro;
    }

    synchronized public boolean isPrestado() {
        return prestado;
    }
    
    public void setPrestado(boolean prestado) {
        this.prestado = prestado;
    }

    
    
}
