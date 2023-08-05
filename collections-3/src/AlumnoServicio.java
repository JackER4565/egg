// En el servicio de Alumno deberemos tener un bucle que crea un objeto Alumno. Se pide
// toda la información al usuario y ese Alumno se guarda en una lista de tipo Alumno y se le
// pregunta al usuario si quiere crear otro Alumno o no.
// Después de ese bucle tendremos el siguiente método en el servicio de Alumno:

// Método notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular su nota
// final y se lo busca en la lista de Alumnos. Si está en la lista, se llama al método. Dentro
// del método se usará la lista notas para calcular el promedio final de alumno. Siendo este
// promedio final, devuelto por el método y mostrado en el main.

import java.util.ArrayList;
import java.util.Scanner;

public class AlumnoServicio {

    ArrayList<Alumno> ListaAlumnos = new ArrayList<>();
    Scanner s = new Scanner(System.in);

    public void crearAlumno() {

        while (true) {
            System.out.println("Desea agregar un alumno? (s/n)");
            String opcion = s.next();
            if (opcion.equalsIgnoreCase("s")) {
                Alumno alumno = new Alumno();
                ArrayList<Integer> notas = new ArrayList<>();

                System.out.println("Ingrese nombre del alumno:");
                alumno.setNombre(s.next());

                System.out.println("Ingrese las tres notas del alumno:");
                notas.add(s.nextInt());
                notas.add(s.nextInt());
                notas.add(s.nextInt());
                alumno.setNotas(notas);

                ListaAlumnos.add(alumno);
            } else if (opcion.equalsIgnoreCase("n")) {
                break;
            } else {
                System.out.println("Opcion incorrecta.");
            }
        } // sale del while
    } //termina el metodo crear alumno

    // Método notaFinal(): El usuario ingresa el nombre del alumno que quiere
    // calcular su nota
    // final y se lo busca en la lista de Alumnos. Si está en la lista, se llama al
    // método. Dentro
    // del método se usará la lista notas para calcular el promedio final de alumno.
    // Siendo este
    // promedio final, devuelto por el método y mostrado en el main.
    public void buscarAlumno() {
        Boolean Si = false;
        System.out.println("Ingrese nombre alumno:");
        String nombre = s.next();
        for (Alumno colegial : ListaAlumnos) {
            if (colegial.getNombre().equalsIgnoreCase(nombre)) {
                notaFinal(colegial);
                Si = true;
            }
        }

        if (Si == false) {
            System.out.println("No se encontro el alumno.");
        }

    }

    public void notaFinal(Alumno estudiante) {
        ArrayList<Integer> Notas = estudiante.getNotas();
        int suma = 0;
        for (Integer nota : Notas) {
            suma += nota;
            // suma = suma + nota;
        }
        System.out.println("El promedio final del alumno " + estudiante.getNombre() + " es: " + suma / 3);

    }

}
