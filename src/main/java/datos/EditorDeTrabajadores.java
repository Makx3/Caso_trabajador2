package datos;

import modelo.Trabajador;

import java.util.ArrayList;
import java.util.Scanner;

public class EditorDeTrabajadores {

    private ArrayList<Trabajador> listaTrabajadores;

    public EditorDeTrabajadores(ArrayList<Trabajador> listaTrabajadores) {
        this.listaTrabajadores = listaTrabajadores;
    }

    public void editarTrabajador() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el RUT del trabajador que desea editar:");
        String rutBuscado = scanner.nextLine();

        Trabajador trabajadorEncontrado = null;

        // Buscar el trabajador por su RUT
        for (Trabajador trabajador : listaTrabajadores) {
            if (trabajador.getRut().equals(rutBuscado)) {
                trabajadorEncontrado = trabajador;
                break;
            }
        }

        if (trabajadorEncontrado != null) {
            System.out.println("Trabajador encontrado. Ingrese los nuevos datos:");

            // Permitir editar los datos del trabajador (excepto el RUT)
            System.out.print("Nuevo nombre: ");
            String nuevoNombre = scanner.nextLine();
            trabajadorEncontrado.setNombre(nuevoNombre);

            System.out.print("Nuevo apellido: ");
            String nuevoApellido = scanner.nextLine();
            trabajadorEncontrado.setApellido(nuevoApellido);

            System.out.print("Nueva isapre: ");
            String nuevaIsapre = scanner.nextLine();
            trabajadorEncontrado.setIsapre(nuevaIsapre);

            System.out.print("Nueva AFP: ");
            String nuevaAfp = scanner.nextLine();
            trabajadorEncontrado.setAfp(nuevaAfp);

            System.out.println("Datos del trabajador actualizados correctamente.");
        } else {
            System.out.println("Trabajador no encontrado.");
        }
    }

    public void eliminarTrabajador() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el RUT del trabajador que desea eliminar:");
        String rutBuscado = scanner.nextLine();

        Trabajador trabajadorAEliminar = null;

        // Buscar el trabajador por su RUT
        for (Trabajador trabajador : listaTrabajadores) {
            if (trabajador.getRut().equals(rutBuscado)) {
                trabajadorAEliminar = trabajador;
                break;
            }
        }

        if (trabajadorAEliminar != null) {
            // Eliminar el trabajador de la lista trabajadores
            listaTrabajadores.remove(trabajadorAEliminar);
            System.out.println("Trabajador eliminado correctamente.");
        } else {
            System.out.println("Trabajador no encontrado.");
        }
    }
}
