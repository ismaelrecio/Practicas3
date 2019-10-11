package ejerciciostema3;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("El primer numero es");
        int numero1 = teclado.nextInt();
        System.out.println("El segundo numero es");
        int numero2 = teclado.nextInt();
        System.out.println("El tercer numero es");
        int numero3 = teclado.nextInt();
        if (numero1 + numero2 == numero3) {
            System.out.println("La suma del primero con el segundo es igual al tercero");
        } else if (numero2 + numero3 == numero1) {
            System.out.println("La suma del segundo con el tercero es igual al primero");
        } else if (numero1 + numero3 == numero2) {
            System.out.println("La suma del primero con el tercero es igual al segundo");
        }

    }
}
