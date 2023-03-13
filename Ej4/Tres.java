package Ej4;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/*
Tome el ejercicio B de la clase 3 y que por parámetro se pueda elegir si es una
codificación o decodificación, el valor del desplazo, y 2 archivos, uno para la entrada y
otro para la salida. Que por pantalla solo indique si terminó o no correctamente, los
resultados deben estar en el archivo de salida.
 */
public class Tres {
    public static void codificarNuevo(boolean tipo, int offset, String src, String dst) throws Exception {
        StringBuilder res = new StringBuilder();
        File srcFile = new File(src);
        Scanner scanner = new Scanner(srcFile);
        try {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                for (int i = 0; i < line.length(); i++) {
                    char letra = line.charAt(i);
                    char nuevaLetra = (tipo) ? (char) (letra + offset) : (char) (letra - offset);
                    res.append(nuevaLetra);
                }
            }
            scanner.close();
            FileWriter writer = new FileWriter(dst);
            writer.write(res.toString());
            writer.close();
            System.out.println("El programa terminó correctamente.");
        } catch (IOException e){
            System.out.println("El programa exploto");
        }
    }

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Codificar o decodificar? (c/d): ");
        char c = scanner.next().charAt(0);
        if(c!= 'c' && c != 'd'){
            System.out.println("Decision invalida.");
            scanner.close();
            return;
        }
        boolean tipo = scanner.next().charAt(0) == 'c';
        System.out.print("Escribi un offset: ");
        int offset = scanner.nextInt() % 26;
        System.out.print("Escribi la direccion del archivo donde esta el string: ");
        String src = scanner.next();
        System.out.print("Escribi la direccion del archivo a escribir el nuevo string: ");
        String dst = scanner.next();
        codificarNuevo(tipo, offset, src, dst);
        scanner.close();
        return;
    }
}
