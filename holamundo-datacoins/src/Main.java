import java.util.Scanner;

import Controller.ParEimpar;
import Controller.NumeroRandom;
import Controller.ConversionGrados;
import Controller.CrudTareas;

public class Main {
    public static void main(String[] args) {

        //Instancias
        ParEimpar pei = new ParEimpar();
        NumeroRandom rdm = new NumeroRandom();
        ConversionGrados cvns = new ConversionGrados();
        CrudTareas crudT = new CrudTareas();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Elige una de las siguientes opciones");
        System.out.println("1. Verifica si un número es par o impar");
        System.out.println("2. Verificador número aleatorio");
        System.out.println("3. Centrígrados a farenheit y vicevesa");
        System.out.println("4. CRUD lista de tareas");
        System.out.println("5. Agenda de contactos (Database)");

        int opcion = scanner.nextInt();

        switch(opcion){
            case 1:
                pei.Numeros();
                break;
            case 2:
                rdm.NumRandom();
                break;
            case 3:
                cvns.convertir();
                break;
            case 4:
                crudT.menu();
                break;
            default:
                System.out.println("No existe esa opción");
        }
    }
}