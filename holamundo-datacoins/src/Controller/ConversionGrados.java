package Controller;

import java.util.Scanner;

public class ConversionGrados {
    public void convertir(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("====CONVERESION DE TEMPERATURA====");
        System.out.println("1. Farenheir a Celcius");
        System.out.println("2. Celcius a Farenheit");
        System.out.println("3. Salir");

        int opcion = scanner.nextInt();

        switch (opcion){
            case 1:
                System.out.println("Ingrese grados farenheit");
                double fa = scanner.nextDouble();
                double ce = (fa - 32.0) * (5.0 / 9.0);
                System.out.println(fa + "grado Farenheit son = " + ce + " grados celcius.");
                break;

            case 2:
                System.out.println("Ingrese grados celcius");
                double c = scanner.nextDouble();
                double f = c * (9.0 / 5.0  + 32.0);
                System.out.println(c + "grados Celcius son = " + f + " grados Farenheit");
                break;
            case 3:
                System.out.println("Adios xd");
                return;
            default:
                System.out.println("Opcion no disponible.");
        }
    }
}