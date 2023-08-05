import java.util.ArrayList;

public class Perros {
    ArrayList<String> razas = new ArrayList<String>();
    public void add(String raza){
        razas.add(raza);
    }
    public void razas(){
        for (String string : razas) {
            System.out.println(string);
        }
    }
    public String toStringg(){
         return razas.toString();
        // String r = "[";
        // for (String string : razas) {
        //     r += string + ", ";
        // }
        // r = r.substring(0, r.length()-2);
        // r += "]";
        // return r;
    }
}
