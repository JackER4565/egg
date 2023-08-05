// Diseñar un programa que lea una serie de valores numéricos enteros desde el teclado y
// los guarde en un ArrayList de tipo Integer. La lectura de números termina cuando se
// introduzca el valor -99. Este valor no se guarda en el ArrayList. 

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        Scanner s = new Scanner(System.in);
        int numero = 0;
        while (true) { // bucle infinito
            System.out.println("Ingrese numero, -99 para salir.");
            numero = s.nextInt();
            if (numero != -99) { // si el numero NO es -99 lo agrega
                numeros.add(numero);
            } else { // pero si es -99 Sale y no lo agrega
                break; // sale del bucle infinito
            }
        } // end while

        // A continuación, el programa mostrará por pantalla
        // el número de valores que se han leído, su suma y su media (promedio).
        int suma = 0;

        System.out.println(numeros); // muestra el arraylist.
        for (int i = 0; i < numeros.size(); i++) {
            suma += numeros.get(i);
        }
        System.out.println("Suma: " + suma); // ?habra metodo para sumar todo de una?
        System.out.println("Promedio: " + suma / numeros.size());
    }
}
