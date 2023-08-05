// Un cine necesita implementar un sistema en el que se puedan cargar peliculas. Para esto,
// tendremos una clase Pelicula con el título, director y duración de la película (en horas).
// Implemente las clases y métodos necesarios para esta situación, teniendo en cuenta lo
// que se pide a continuación:
// 

// Después de ese bucle realizaremos las siguientes acciones:





// • Ordenar las películas por título, alfabéticamente y mostrarlo en pantalla.
// • Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.

public class App {
    public static void main(String[] args) throws Exception {
        ServicioPelicula SP = new ServicioPelicula();
        SP.crearPelicula();
        System.out.println("Mostrando peliculas...");
        SP.mostrarPeliculas();
        System.out.println("Mostrando largometrajes...");
        SP.mostrarLargometrajes();
        System.out.println("Mostrando ordenado de mayor a menor...");
        SP.ordenarMayorAMenor();
        System.out.println("Mostrando de menor a mayor...");
        SP.ordenarMenorAMayor();
    }
}
