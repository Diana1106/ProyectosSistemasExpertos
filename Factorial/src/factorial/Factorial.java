
package factorial;

import java.util.Scanner;

/**
 *
 * @author norah
 */
public class Factorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Escribe un número");
        Scanner f = new Scanner(System.in);
        int fac = Integer.parseInt(f.nextLine());
        
        System.out.println("El factorial es: " + factorial(fac));
    }
    public static long factorial(long numero) {
		if (numero <= 1)
			return 1;
		return numero * factorial(numero - 1);
}
}
