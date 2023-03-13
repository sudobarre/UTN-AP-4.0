package Ej3;

import java.util.Arrays;
import java.util.Scanner;

/*
a. Dado un String y una letra, que cuente la cantidad de apariciones de la letra en
el String
b. Dados 3 números y un orden (ascendente o decreciente) que ordene los
mismos y los retorne en un vector de 3
c. dado un vector de números, y un número X, que sume todos los números > X y
retorne el resultado
 */
public class Uno {
    public static Integer apariciones(String s, char c) throws Exception{
        if (s.length() == 0) {
            throw new Exception("La cadena no puede ser vacía");
        }
        if (c < 'a' || c > 'z') {
            throw new Exception("La letra no es valida");
        }
        Integer count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                count++;
            }
        }
        return count;
    }


    public static Integer[] ordenarPor(Integer[] arr, String orden) throws Exception{
        //si se quiere conservar el original
        Integer[] res = arr.clone();
        if(!(orden.equals("ascendente") || orden.equals("decreciente"))) throw new Exception("EL orden tiene que ser ascendente o decreciente.");
        if (orden.equals("ascendente")) {
            for (int i = 0; i < res.length - 1; i++) {
                for (int j = i + 1; j < res.length; j++) {
                    if (res[i] > res[j]) {
                        Integer temp = res[i];
                        res[i] = res[j];
                        res[j] = temp;
                    }
                }
            }
        } else {
            for (int i = 0; i < res.length - 1; i++) {
                for (int j = i + 1; j < res.length; j++) {
                    if (res[i] < res[j]) {
                        Integer temp = res[i];
                        res[i] = res[j];
                        res[j] = temp;
                    }
                }
            }
        }
        return res;
    }

    public static Integer sumarMayorA(Integer[] arr, Integer x){
        Integer suma = 0;
        for (Integer integer : arr) {
            if (integer > x) {
                suma += integer;
            }
        }
        return suma;
    }
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        Integer[] numbers = new Integer[3];

        System.out.print("Escribi el primer numero: ");
        numbers[0] = scanner.nextInt();

        System.out.print("Escribi el segundo numero: ");
        numbers[1] = scanner.nextInt();

        System.out.print("Escribi el tercer numero: ");
        numbers[2] = scanner.nextInt();

        System.out.print("Escribi ascendente o decreciente: ");
        String str = scanner.next().toLowerCase();
        while(!(str.equals("ascendente") || str.equals("decreciente"))){
            System.out.println("Por favor escribi ascendente o decreciente: ");
            str = scanner.next().toLowerCase();
        }

        System.out.println("Los numeros son: " + numbers[0] + ", " + numbers[1] + ", " + numbers[2]);
        System.out.println("La palabra es: " + str);

        System.out.println("el arreglo con orden " + str + " es: " + Arrays.toString(ordenarPor(numbers, str)));

        System.out.print("Escribi un numero: ");
        Integer x = scanner.nextInt();
        System.out.println("La suma de numeros mayor a " + x + "en el arreglo es: " + sumarMayorA(numbers, x));

        System.out.println("Escribi una palabra");
        String palabra = scanner.next();
        System.out.println("Escribi una letra");
        char letra = scanner.next().charAt(0);
        System.out.println("La cantidad de apariciones de " + letra + " en " + palabra + " es: " + apariciones(palabra, letra));

        scanner.close();
    }




}
