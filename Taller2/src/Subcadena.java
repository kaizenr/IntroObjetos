import java.util.HashSet;
import java.util.Scanner;

public class Subcadena {
    public static int longitudSubcadenaMasLarga(String s) {
        HashSet<Character> ventana = new HashSet<>();
        int izquierda = 0;
        int maxLongitud = 0;
        int inicioMax = 0;

        for (int derecha = 0; derecha < s.length(); derecha++) {
            while (ventana.contains(s.charAt(derecha))) {
                ventana.remove(s.charAt(izquierda));
                izquierda++;
            }

            ventana.add(s.charAt(derecha));

            if (derecha - izquierda + 1 > maxLongitud) {
                maxLongitud = derecha - izquierda + 1;
                inicioMax = izquierda;
            }
        }

        System.out.println("Cadena resultante: " + s.substring(inicioMax, inicioMax + maxLongitud));

        return maxLongitud;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa una cadena de caracteres: ");
        String cadena = scanner.nextLine();

        int longitud = longitudSubcadenaMasLarga(cadena);
        System.out.println("La longitud de la subcadena más larga sin caracteres repetidos es: " + longitud);

        scanner.close();
    }
}
