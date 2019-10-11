package ejerciciostema3;

import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero = teclado.nextInt();
        /* if(numero%20==0){
          if(numero>-100 && numero<= 100){
              System.out.println("es multiplo y esta en el rango");
          }else{
              System.out.println("es multiplo y no esta en el rango");
          }
          System.out.println("es multiplo"); 
          
      }else{
          if(numero >=-100 && numero<=100){
              System.out.println("no es multiplo y esta en el rango");
          }else{
              System.out.println("no es multiplo y no esta en el rango");
          }
          System.out.println("no es multiplo");
      }*/
        if (numero % 20 == 0 && (numero >= -100 && numero <= 100)) {
            System.out.println("es multiplo y esta en el rango");
        } else if (numero % 20 != 0 && (numero >= -100 && numero <= 100)) {
            System.out.println("no es mulrtiplo y esta en el rango");
        } else if (numero % 20 == 0 && !(numero >= -100 && numero <= 100)) {
            System.out.println("es multiplo y ni esta en el rango");
        } else if (numero % 20 != 0 && !(numero >= -100 && numero <= 100)) {
            System.out.println("no es multiplo y no esta en el rango");
        }

    }
}
