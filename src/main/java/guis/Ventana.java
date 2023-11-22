package guis;

import datos.ListaDeTrabajadores;
import modelo.Trabajador;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Ventana extends JFrame {
    private JTextField nombreTextField;
    private JTextField apellidoTextField;
    private JTextField rutTextField;
    private JTextField isapreTextField;
    private JTextField afpTextField;
    private ListaDeTrabajadores listaDeTrabajadores;

    public Ventana(ListaDeTrabajadores listaDeTrabajadores) {
        this.listaDeTrabajadores = listaDeTrabajadores;

        setTitle("Gestión de Trabajadores");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        nombreTextField = new JTextField();
        apellidoTextField = new JTextField();
        rutTextField = new JTextField();
        isapreTextField = new JTextField();
        afpTextField = new JTextField();

        JButton btnAgregar = new JButton("Agregar Trabajador");
        btnAgregar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                agregarTrabajador();
            }
        });

        JButton btnMostrar = new JButton("Mostrar Trabajadores");
        btnMostrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mostrarTrabajadores();
            }
        });

        setLayout(new GridLayout(7, 2));
        add(new JLabel("Nombre:"));
        add(nombreTextField);
        add(new JLabel("Apellido:"));
        add(apellidoTextField);
        add(new JLabel("RUT:"));
        add(rutTextField);
        add(new JLabel("Isapre:"));
        add(isapreTextField);
        add(new JLabel("AFP:"));
        add(afpTextField);
        add(btnAgregar);
        add(btnMostrar);

        setVisible(true);
    }

    private void agregarTrabajador() {
        String nombre = nombreTextField.getText();
        String apellido = apellidoTextField.getText();
        String rut = rutTextField.getText();
        String isapre = isapreTextField.getText();
        String afp = afpTextField.getText();

        if (!nombre.isEmpty() && !apellido.isEmpty() && !rut.isEmpty() && !isapre.isEmpty() && !afp.isEmpty()) {
            Trabajador nuevoTrabajador = new Trabajador(nombre, apellido, rut, isapre, afp);
            listaDeTrabajadores.agregarTrabajador(nuevoTrabajador);
            JOptionPane.showMessageDialog(this, "Trabajador agregado correctamente");
            limpiarCampos();
        } else {
            JOptionPane.showMessageDialog(this, "Todos los campos son obligatorios", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void mostrarTrabajadores() {
        ArrayList<Trabajador> trabajadores = listaDeTrabajadores.getTrabajadores();
        StringBuilder sb = new StringBuilder();
        sb.append("Lista de Trabajadores:\n");

        for (Trabajador trabajador : trabajadores) {
            sb.append("Nombre: ").append(trabajador.getNombre()).append(", ");
            sb.append("Apellido: ").append(trabajador.getApellido()).append(", ");
            sb.append("RUT: ").append(trabajador.getRut()).append(", ");
            sb.append("Isapre: ").append(trabajador.getIsapre()).append(", ");
            sb.append("AFP: ").append(trabajador.getAfp()).append("\n");
        }

        JOptionPane.showMessageDialog(this, sb.toString(), "Lista de Trabajadores", JOptionPane.INFORMATION_MESSAGE);
    }

    private void limpiarCampos() {
        nombreTextField.setText("");
        apellidoTextField.setText("");
        rutTextField.setText("");
        isapreTextField.setText("");
        afpTextField.setText("");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                ListaDeTrabajadores listaDeTrabajadores = new ListaDeTrabajadores();
                new Ventana(listaDeTrabajadores);
            }
        });
    }
}
