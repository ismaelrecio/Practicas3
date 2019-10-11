
        
package ejerciciostema3;

import java.util.Scanner;
public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
         System.out.println("El primer numero es");
        int numero1  = teclado.nextInt();
        System.out.println("El segundo numero es");
        int numero2 = teclado.nextInt();
         
        if(numero1 > numero2){
            System.out.println("El primero es mayor que el segundo");
        } else if(numero1<numero2){
            System.out.println("el primero no es mayor que el segundo");
        }
    }
}
