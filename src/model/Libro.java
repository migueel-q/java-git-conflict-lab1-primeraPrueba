package model;

public class Libro {
    private String isbn;
    private String titulo;
    private int reservasActivas;

    public Libro(String isbn, String titulo) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.reservasActivas = 0;   //El atributo cambia a reservactas activas que es un int, es un contador
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public boolean isDisponible() {
        return reservasActivas == 0;
    }

    public void setDisponible(int reservado) {
        this.reservasActivas = reservado;
    }
    public void incrementarReservas() {
        reservasActivas++;
    }

    @Override
    public String toString() {
        return titulo + " (" + isbn + ") - " +
               (reservasActivas == 0 ? "Disponible" : "No disponible");
    }
}
