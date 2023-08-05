import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ServicioPelicula {
    ArrayList<Pelicula> ListaPeliculas = new ArrayList<>();

    // En el servicio deberemos tener un bucle que crea un objeto Pelicula
    // pidiéndole al usuario
    // todos sus datos y guardándolos en el objeto Pelicula.
    // Después, esa Pelicula se guarda una lista de Peliculas y se le pregunta al
    // usuario si quiere
    // crear otra Pelicula o no.
    public void crearPelicula() {
        Scanner s = new Scanner(System.in);
        while (true) {
            System.out.println("Queres ingresar una pelicula? (s/n)");
            String opcion = s.next();
            if (opcion.equalsIgnoreCase("s")) {
                Pelicula p = new Pelicula();
                System.out.println("Ingrese director:");
                p.setDirector(s.next());
                System.out.println("Ingrese titulo:");
                p.setTitulo(s.next());
                System.out.println("Ingrese duracion en horas:");
                p.setDuracion(s.nextDouble());
                ListaPeliculas.add(p);
            } else if (opcion.equalsIgnoreCase("n")) {
                break;
            } else {
                System.out.println("opcion incorrecta.");
            }
        }
    } // fin crear pelicula
      // • Mostrar en pantalla todas las películas.

    public void mostrarPeliculas() {
        System.out.println("Mostrando todas las peliculas...");
        for (Pelicula pelicula : ListaPeliculas) {
            System.out.println(pelicula.toString());
        }

    }

    // • Mostrar en pantalla todas las películas con una duración mayor a 1 hora.
    public void mostrarLargometrajes() {
        System.out.println("Mostrando todas las peliculas mayores a una hora...");
        for (Pelicula pelicula : ListaPeliculas) {
            if (pelicula.getDuracion() > 1) {
                System.out.println(pelicula.toString());
            }
        }
    }

    // • Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo en
// pantalla.
    public void ordenarMayorAMenor(){
        ListaPeliculas.sort((Pelicula p1, Pelicula p2) -> Double.compare(p2.getDuracion(), p1.getDuracion()));
        mostrarPeliculas();
        // ArrayList<Double> listaDuracion = new ArrayList<>();
        // for (Pelicula peli : ListaPeliculas) {
        //     listaDuracion.add(peli.getDuracion());
        // }
        // // Collections.sort(ListaPeliculas, ListaPeliculas.)
        // // Collections.sort(listaDuracion, Collections.reverseOrder()); // decreasing
        // // Collections.sort(listaDuracion);
        // // Collections.reverse(listaDuracion);

        // ArrayList<Pelicula> listaNueva = new ArrayList<>();

        
    }
    // • Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo en
// pantalla.
    public void ordenarMenorAMayor(){
        ListaPeliculas.sort((Pelicula p1, Pelicula p2) -> Double.compare(p1.getDuracion(), p2.getDuracion()));
        mostrarPeliculas();
        // ArrayList<Double> listaDuracion = new ArrayList<>();
        // for (Pelicula peli : ListaPeliculas) {
        //     listaDuracion.add(peli.getDuracion());
        // }
        // // Collections.sort(ListaPeliculas, ListaPeliculas.)
        // // Collections.sort(listaDuracion, Collections.reverseOrder()); // decreasing
        // // Collections.sort(listaDuracion);
        // // Collections.reverse(listaDuracion);

        // ArrayList<Pelicula> listaNueva = new ArrayList<>();

        
    }
}
