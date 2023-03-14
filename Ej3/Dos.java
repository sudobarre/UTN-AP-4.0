package Ej3;
/*
2. Genere una clase que tenga los métodos para realizar la codificación y decodificación
de un string, dado un número de desplazamiento.

Por ejemplo, con desplazo de 1:
“hola que tal” -> “ipmbarvfaubm”
h -> i
o -> p

con desplazo de 2
“hola que tal” -> “jqncbswgbvcn”
h -> j
o -> q
En el ejemplo estoy usando este abecedario: "
abcdefghijklmnñopqrstuvwxyz "
Para este ejercicio puede usar todos los métodos de String, tanto de instancia (por
ejemplo length) como de clase, por ejemplo String.valueOf(arr) # donde
arr es un char[]
 */

import java.util.Scanner;

public class Dos {

    public static String codificar(String s, int offset) throws Exception{
        String res = "";
        char nuevaLetra;
        for(int i = 0; i < s.length(); i++) {
            nuevaLetra = (char) (s.charAt(i) + offset);
            res+=nuevaLetra;
        }
        return res;
    }
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Escribi un numero: ");
        Integer x = scanner.nextInt() % 26;
        System.out.print("Escribi una palabra: ");
        String s = scanner.next();
        System.out.println("La nueva palabra es: " + codificar(s, x));
        scanner.close();
        return;
    }
}
