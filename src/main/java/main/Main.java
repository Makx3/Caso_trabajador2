package main;


import datos.ListaDeTrabajadores;
import guis.Ventana;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            ListaDeTrabajadores listaDeTrabajadores = new ListaDeTrabajadores();
            new Ventana(listaDeTrabajadores);
        });
    }
}

