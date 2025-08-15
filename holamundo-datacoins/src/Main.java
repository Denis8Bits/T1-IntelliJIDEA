import java.util.Scanner;
import Controller.ParEImpar;
public class Main {
    public static void main(String[] args) {
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
                ParEImpar.
                break;
            case 2:
                System.out.println("Verificador número aleatorio");
                break;
            case 3:
                System.out.println("Centrígrados a farenheit y vicevesa");
                break;
            case 4:
                System.out.println("CRUD lista de tareas");
                break;
            case 5:
                System.out.println("Agenda de contactos (Database)");
                break;
            default:
                System.out.println("No existe esa opción");
        }
    }
}