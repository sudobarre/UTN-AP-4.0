package Ej1;
public class Ej1 {

    public static void main(String[] args) {
        System.out.println("----------Ejercicio 1----------");
        // Se deberían mostrar los números 5,6,7,8,9,10,11,12,13,14
        int numeroInicio = 5;
        int numeroFin = 14;

        while(numeroInicio <= numeroFin){
            if(esPar(numeroInicio)){
                System.out.println(numeroInicio);
            }
            numeroInicio++;
        }

        System.out.println("lo mismo pero invirtiendo el orden y con for:");
        numeroInicio = 5;
        //hacer lo mismo pero invirtiendo el orden y con for
        for(int i = numeroFin; i >= numeroInicio; i--){
            if(esPar(i)){
                System.out.println(i);
            };
        }


        System.out.println("----------Ejercicio 2----------\n" +
                "-----determinar si una persona pertenece al segmento de ingresos altos-----");
        float ingresos = 299000;
        int vehiculos = 3;
        int edadTotalVehiculos = 10;
        int cantInmuebles = 2;
        //si posee una embarcación, una aeronave de lujo o es titular de activos societarios que demuestren capacidad económica plena.
        boolean esCheto = false;
        if(ingresos >= 489.083 ||
                (vehiculos != 0 && (vehiculos > 2 && edadTotalVehiculos <= 12)) ||
                (cantInmuebles >= 3 && esCheto)){
            System.out.println("Categoria A");
        }
    }

    public static boolean esPar(int num){
        return (num % 2 == 0);
    }
}
