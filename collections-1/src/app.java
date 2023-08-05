// Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. El
// programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
// después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si decide
// salir, se mostrará todos los perros guardados en el ArrayList.

import java.util.Scanner;

public class app {
    public static void main(String[] args) throws Exception {
        Perros p = new Perros();
        Scanner s = new Scanner(System.in);
        while(true){
            System.out.println("Ingrese una raza de perro: ");
            String raza = s.nextLine();
            p.add(raza);
            System.out.println("Desea ingresar otra raza? (s/n)");
            String respuesta = s.nextLine();
            if(respuesta.equals("n")){
                break;
            }
        }
        p.razas();
        
        System.out.println("################################");
        System.out.println(p.toStringg());
    }
}
