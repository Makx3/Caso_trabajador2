package datos;

import modelo.Trabajador;

import java.util.ArrayList;

public class ListaDeTrabajadores {
    private ArrayList<Trabajador> trabajadores;

    public ListaDeTrabajadores() {
        this.trabajadores = new ArrayList<>();

        // trabajadores de ejemplo
        trabajadores.add(new Trabajador("John", "Doe", "12345678-9", "IsapreA", "AFP1"));
        trabajadores.add(new Trabajador("Jane", "Smith", "98765432-1", "IsapreB", "AFP2"));
        trabajadores.add(new Trabajador("Alice", "Johnson", "11111111-1", "IsapreC", "AFP3"));
        trabajadores.add(new Trabajador("Bob", "Williams", "22222222-2", "IsapreD", "AFP4"));
        trabajadores.add(new Trabajador("Charlie", "Brown", "33333333-3", "IsapreE", "AFP5"));
        trabajadores.add(new Trabajador("Eva", "Davis", "44444444-4", "IsapreF", "AFP6"));
        trabajadores.add(new Trabajador("Frank", "Miller", "55555555-5", "IsapreG", "AFP7"));
        trabajadores.add(new Trabajador("Grace", "Moore", "66666666-6", "IsapreH", "AFP8"));
        trabajadores.add(new Trabajador("Henry", "Taylor", "77777777-7", "IsapreI", "AFP9"));
        trabajadores.add(new Trabajador("Ivy", "Clark", "88888888-8", "IsapreJ", "AFP10"));
    }

    public void agregarTrabajador(Trabajador trabajador) {
        trabajadores.add(trabajador);
    }

    public ArrayList<Trabajador> getTrabajadores() {
        return trabajadores;
    }
}

