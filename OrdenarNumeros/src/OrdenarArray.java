import java.util.Scanner;
import java.util.Arrays;

public class OrdenarArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("¿Cuántos números deseas ingresar?: ");
        int n = scanner.nextInt();

        int[] array = new int[n];
        System.out.println("Ingresa los números a ordenar:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        int iteracionGlobal = 0;
        int iteracionSimple = 0;
        int variableAuxiliarIntercambio = 0;

        for (iteracionGlobal = 0; iteracionGlobal < (array.length - 1); iteracionGlobal++) {
            for (iteracionSimple = 0; iteracionSimple < (array.length - iteracionGlobal - 1); iteracionSimple++) {
                if (array[iteracionSimple] > array[iteracionSimple + 1]) {
                    variableAuxiliarIntercambio = array[iteracionSimple + 1];
                    array[iteracionSimple + 1] = array[iteracionSimple];
                    array[iteracionSimple] = variableAuxiliarIntercambio;
                }
            }
        }

        System.out.println("Array ordenado: " + Arrays.toString(array));
        
        scanner.close();
    }
}
