import java.util.Scanner;
public class cuadro {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa la base (B): ");
        int base = scanner.nextInt();

        System.out.print("Ingresa la altura (H): ");
        int altura = scanner.nextInt();

        for (int i = 0; i < altura; i++) {
            if (i == 0 || i == altura - 1) {
            	for (int j = 0; j < base; j++) {
                    System.out.print("*");
                }
            } else {
                System.out.print("*");
                for (int j = 1; j < base - 1; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println(); 
        }

        scanner.close();
    }
}


