package Controller;

import java.util.Scanner;

public class ParEimpar {
    public void Numeros(){

        System.out.println("Ingrese un numero");
        Scanner scanner = new Scanner(System.in);

        int numero = scanner.nextInt();

        if (numero % 2 == 0){
            System.out.println(numero + " SI es un numero par");
        }else{
            System.out.println(numero + " NO es un numero par");
        }
    }
}
