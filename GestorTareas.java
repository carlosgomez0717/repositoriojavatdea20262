import java.util.ArrayList;
import java.util.Scanner;

public class GestorTareas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> tareas = new ArrayList<>();
        int opcion = 0;

        do {
            System.out.println("\n--- GESTOR DE TAREAS EN JAVA ---");
            System.out.println("1. Ver tareas pendientes");
            System.out.println("2. Agregar nueva tarea");
            System.out.println("3. Eliminar una tarea");
            System.out.println("4. Salir");
            System.out.print("Elige una opción: ");

            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer del scanner

            switch (opcion) {
                case 1:
                    System.out.println("\n--- TUS TAREAS ---");
                    if (tareas.isEmpty()) {
                        System.out.println("No hay tareas registradas.");
                    } else {
                        for (int i = 0; i < tareas.size(); i++) {
                            System.out.println((i + 1) + ". " + tareas.get(i));
                        }
                    }
                    break;

                case 2:
                    System.out.print("Escribe la nueva tarea: ");
                    String nuevaTarea = scanner.nextLine();
                    tareas.add(nuevaTarea);
                    System.out.println("¡Tarea agregada con éxito!");
                    break;

                case 3:
                    if (tareas.isEmpty()) {
                        System.out.println("No hay tareas para eliminar.");
                    } else {
                        System.out.println("\n--- TAREAS ACTUALES ---");
                        for (int i = 0; i < tareas.size(); i++) {
                            System.out.println((i + 1) + ". " + tareas.get(i));
                        }
                        System.out.print("Ingresa el número de la tarea a eliminar: ");
                        int indice = scanner.nextInt();
                        
                        if (indice > 0 && indice <= tareas.size()) {
                            tareas.remove(indice - 1);
                            System.out.println("¡Tarea eliminada!");
                        } else {
                            System.out.println("Número inválido.");
                        }
                    }
                    break;

                case 4:
                    System.out.println("Saliendo del gestor de tareas. ¡Buen trabajo!");
                    break;

                default:
                    System.out.println("Opción no válida. Intenta de nuevo.");
            }

        } while (opcion != 4);

        scanner.close();
    }
}