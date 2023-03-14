package Ej6;

public class CalculadoraTest {

    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        // Test 1
        double resultado1 = calculadora.multiplicar(80, 3);
        if (resultado1 == 240) {
            System.out.println("Test 1: PASO");
        } else {
            System.out.println("Test 1: FALLO");
        }

        // Test 2
        double resultado2 = calculadora.dividir(calculadora.sumar(150, 180), 3);
        if (resultado2 == 110) {
            System.out.println("Test 2: PASO");
        } else {
            System.out.println("Test 2: FALLO");
        }

        // Test 3
        double resultado3 = calculadora.multiplicar(calculadora.restar(90, 50), 15);
        //que sea igual a 600 es mas fuerte a que sea distinto de 605
        if (resultado3 == 600) {
            System.out.println("Test 3: PASO");
        } else {
            System.out.println("Test 3: FALLO");
        }

        // Test 4
        double resultado4 = calculadora.multiplicar(calculadora.sumar(70, 40), 25);
        //idem arriba
        if (resultado4 == 2750) {
            System.out.println("Test 4: PASO");
        } else {
            System.out.println("Test 4: FALLO");
        }
    }
}
