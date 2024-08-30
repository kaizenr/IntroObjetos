
public class ejercicio1 {

	public static void main(String[] args) {
		int numero1;
		int numero2;
		int numero3;
		
		numero1=3;
		numero2=4;
		numero3=45;
			
		if (numero1>numero2) {
			if (numero2>numero3) {
				System.out.print("el numero mayor es el 1");
			}else {
				System.out.print("el mayor es el 3");				
			}
		}else if (numero2>numero3) {
			System.out.print("el numero mayor es el  2");
		}else {
			System.out.print("el numero mayor es el 3");
		}
		
		if (numero1<numero2 && numero1 < numero3) {
				System.out.print("el numero menor es el 1 ");
			} else if (numero2<numero3) {
					System.out.print(" el numero menor es el 2");
		}else {
			System.out.print(" el menor es el 3");
			}
		
	}
}


