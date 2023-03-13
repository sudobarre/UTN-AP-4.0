package Ej4;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriteToFile {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Escribi el nombre del archivo a crear: ");
        String fileName = scanner.nextLine();
        System.out.print("Cuantos numeros queres que tenga? Va a escribir del numero 1 hasta el numero que escribas: ");
        int amt = scanner.nextInt();
        if(amt < 1) {
            scanner.close();
            System.out.println("El numero debe ser mayor a cero.");
            return;
        }
        scanner.close();

        File file = new File(fileName);

        try {
            FileWriter writer = new FileWriter(file);

            for (int i = 1; i <= amt; i++) {
                writer.write(Integer.toString(i) + ", ");
            }

            writer.close();
            System.out.println("Escrito archivo: " + fileName);
        } catch (IOException e) {
            System.out.println("Ocurrio un error. Intente de nuevo mas tarde.");
            e.printStackTrace();
        }
    }
}
