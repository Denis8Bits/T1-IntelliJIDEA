package Controller;

import java.util.Random;
import java.util.Scanner;

public class NumeroRandom {
    public void NumRandom() {
        Scanner scanner = new Scanner(System.in);
        Random rndm = new Random();

        //generar un numero aleatorio entre 1 y 100
        int numSecret = rndm.nextInt(100) + 1;

        System.out.println("Adivina el número secreto");
        int intento = scanner.nextInt();

        if (intento == numSecret) {
            System.out.println("Felicidades, el número si era " + numSecret);
        }else{
            System.out.println("Ups, numero quivocado, era " + numSecret);
        }
    }
}
