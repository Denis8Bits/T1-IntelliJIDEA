package Controller;

import java.util.Scanner;

public void class ParEimpar {
    public static void Numeros () {
        //Solicitarle el número al usuario
        System.out.println("Ingresa un número");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        //Verificar si es par o impar
        if (num %2 == 0) {
            return num + "es par";
        }else{
            return num + "es impar";

        }
    }
}
