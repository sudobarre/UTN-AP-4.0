package Ej4;

import java.io.File;
import java.util.Scanner;

/*Haga una main donde por parámetro envíe la ruta de un archivo. Ese archivo debe
contener números. El programa debe escribir por consola la suma de esos números
a. Al programa anterior agreguele un parámetro para que la operación pueda ser
suma o multiplicación.

 */

public class Dos {
    public static void main(String[] args) throws Exception {
        if (args.length !=  2) {
            System.out.println("Uso: java Main <filename> suma/multiplicacion");
            System.exit(1);
        }

        if(!(args[1].equals("suma") || args[1].equals("multiplicacion"))){
            System.out.println("Uso: java Main <filename> suma/multiplicacion");
            System.exit(1);
        }
        boolean esSuma = args[1].equals("suma");

        String filename = args[0];
        File file = new File(filename);
        Scanner scanner = new Scanner(file);

        if(esSuma){
            int suma = 0;
            while (scanner.hasNextInt()) {
                int number = scanner.nextInt();
                suma += number;
            }
            System.out.println("Suma: " + suma);
        } else {
            double suma = 1.0;
            while (scanner.hasNextDouble()) {
                double number = scanner.nextDouble();
                suma *= number;
            }
            System.out.println("Multiplicatoria: " + suma);
        }

        scanner.close();

    }
}
