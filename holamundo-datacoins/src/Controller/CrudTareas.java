package Controller;

import java.util.ArrayList;
import java.util.Scanner;

public class CrudTareas {
    private ArrayList<String> tareas = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);

    public void menu() {
        while (true) {
            System.out.println("\n=== CRUD Lista de Tareas ===");
            System.out.println("1. Agregar tarea");
            System.out.println("2. Ver tareas");
            System.out.println("3. Actualizar tarea");
            System.out.println("4. Eliminar tarea");
            System.out.println("0. Volver al menú principal");
            System.out.print("Elige una opción: ");

            String opcion = sc.nextLine();

            switch (opcion) {
                case "1":
                    agregarTarea();
                    break;
                case "2":
                    verTareas();
                    break;
                case "3":
                    actualizarTarea();
                    break;
                case "4":
                    eliminarTarea();
                    break;
                case "5":
                    return; // sale al Main xd
                default:
                    System.out.println("Opción inválida.");
            }
        }
    }

    private void agregarTarea() {
        System.out.print("Escribe la nueva tarea: ");
        String tarea = sc.nextLine();
        tareas.add(tarea);
        System.out.println("Tarea agregada.");
    }

    private void verTareas() {
        if (tareas.isEmpty()) {
            System.out.println("No hay tareas registradas.");
            return;
        }
        System.out.println("\n--- Lista de Tareas ---");
        for (int i = 0; i < tareas.size(); i++) {
            System.out.println((i + 1) + ". " + tareas.get(i));
        }
    }

    private void actualizarTarea() {
        verTareas();
        if (tareas.isEmpty()) return;

        System.out.print("Elige el número de la tarea a actualizar: ");
        try {
            int index = Integer.parseInt(sc.nextLine()) - 1;
            if (index < 0 || index >= tareas.size()) {
                System.out.println("Número inválido.");
                return;
            }
            System.out.print("Escribe la nueva descripción: ");
            String nueva = sc.nextLine();
            tareas.set(index, nueva);
            System.out.println("Tarea actualizada.");
        } catch (NumberFormatException e) {
            System.out.println("Ingresa un número válido.");
        }
    }

    private void eliminarTarea() {
        verTareas();
        if (tareas.isEmpty()) return;

        System.out.print("Elige el número de la tarea a eliminar: ");
        try {
            int index = Integer.parseInt(sc.nextLine()) - 1;
            if (index < 0 || index >= tareas.size()) {
                System.out.println("Número inválido.");
                return;
            }
            tareas.remove(index);
            System.out.println("Tarea eliminada.");
        } catch (NumberFormatException e) {
            System.out.println("Ingresa un número válido.");
        }
    }
}
