// Se requiere un programa que lea y guarde países, y para evitar que se ingresen repetidos
// usaremos un conjunto. El programa pedirá un país en un bucle, se guardará el país en el
// conjunto y después se le preguntará al usuario si quiere guardar otro país o si quiere salir,
// si decide salir, se mostrará todos los países guardados en el conjunto. (Recordemos hacer
// los servicios en la clase correspondiente)

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);

        // HashSet<Integer> HS = new HashSet<>(); //<<<<<<<<<<<< LO ORDENA si puede con
        // hash

        // TreeSet<String> TS = new TreeSet<>(); //<<<<<<<<<<<< lo ordeno ¿sin hash?

        LinkedHashSet<String> LHS = new LinkedHashSet<>(); // <<< NO ordena

        // ArrayList<String> AL = new ArrayList<>(); // <<<<< No ORDENA, ADMITE
        // DUPLICADO

        while (true) {
            System.out.println("Queres ingresar un pais? (S/N)");
            String opcion = s.next();

            if (opcion.equalsIgnoreCase("s")) {
                System.out.println("ingrese paí");
                LHS.add(s.next());
            } else if (opcion.equalsIgnoreCase("n")) {
                break;
            } else {
                System.out.println("Opcion incorrecta");
            }

        } // sale del while

        // System.out.println(LHS);
        System.out.println(LHS);
        System.out.println("----------");
        // CONVERTIR DE LHS A TS
        // Set<String> TS = new TreeSet<>(LHS);
        TreeSet<String> TS = new TreeSet<>(LHS);
        System.out.println("Convertido a TS, ordenado:");
        System.out.println(TS);

        System.out.println("Ingrese pais a buscar:");
        String PaisBuscar = s.next();
        Boolean flag = false;
        Iterator<String> it = TS.iterator();
        while (it.hasNext()) {
            if (it.next().equals(PaisBuscar)) {
                it.remove();
                flag = true;
            }
        }
        if (!flag)
            System.out.println("No se encontró pais.");
        else
            System.out.println(TS);
        
    } // main
} // app

// Después deberemos mostrar el conjunto ordenado alfabéticamente: para esto
// recordar
// cómo se ordena un conjunto.
// Por último, al usuario se le pedirá un país y se recorrerá el conjunto con un
// Iterator, se
// buscará el país en el conjunto y si está en el conjunto se eliminará el país
// que ingresó el
// usuario y se mostrará el conjunto. Si el país no se encuentra en el conjunto
// se le informará
// al usuario.