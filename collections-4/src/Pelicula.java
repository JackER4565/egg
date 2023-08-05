public class Pelicula {
    // título, director y duración de la película (en horas).
    String titulo, director;
    double duracion;

    
    public Pelicula() {
    }
    public Pelicula(String titulo, String director, double duracion) {
        this.titulo = titulo;
        this.director = director;
        this.duracion = duracion;
    }
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getDirector() {
        return director;
    }
    public void setDirector(String director) {
        this.director = director;
    }
    public double getDuracion() {
        return duracion;
    }
    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }
        @Override
    public String toString() {
        return "Pelicula [titulo=" + titulo + ", director=" + director + ", duracion=" + duracion + "]";
    }
}
