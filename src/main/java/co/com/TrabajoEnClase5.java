package co.com.ps;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//Programa que filtre las palabras que tengan mas de 5 caracteres e imprimirlas en lista
public class TrabajoEnClase5 {
    public static void main(String[] args) {
        List<String> Palabras = Arrays.asList("Turnos", "Paro", "Entrevista", "Curriculum", "Fase");

        List<String> PalabrasFiltradas = FiltrarPalabras(Palabras);

        System.out.println("Palabras con más de 5 caracteres:");
        for (String Palabra : PalabrasFiltradas) {
            System.out.println(Palabra);
        }
    }
    public static List<String> FiltrarPalabras(List<String> lista) {
        List<String> PalabrasFiltradas = new ArrayList<>();

        // Imprimir palabras filtradas
        for (String Palabra : lista) {
            if (Palabra.length() > 5) {
                PalabrasFiltradas.add(Palabra);
            }
        }
        return PalabrasFiltradas;
    }
}