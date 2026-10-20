package mundo;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class OperacionesPacientes {

    private static ArrayList<Paciente> listaPacientes = new ArrayList<>();

    public ArrayList<Paciente> getListaPacientes() {
        return listaPacientes;
    }

    public Paciente buscarPaciente(String cedula) {
        for (Paciente p : listaPacientes) {
            if (p.getCedula().equals(cedula)) {
                return p;
            }
        }
        return null;
    }

    public boolean registrarPaciente(String cedula, String nombre, String apellido, String telefono) {
        if (buscarPaciente(cedula) != null) {
            JOptionPane.showMessageDialog(null, 
                "El paciente con cédula " + cedula + " ya se encuentra registrado.", 
                "Registro Denegado", 
                JOptionPane.WARNING_MESSAGE);
            return false;
        }

        Paciente nuevo = new Paciente();
        nuevo.setCedula(cedula);
        nuevo.setNombre(nombre);
        nuevo.setApellido(apellido);
        nuevo.setTelefono(telefono);

        listaPacientes.add(nuevo);
        return true;
    }

    public boolean eliminarPaciente(String cedula) {
        Paciente p = buscarPaciente(cedula);
        if (p != null) {
            listaPacientes.remove(p);
            JOptionPane.showMessageDialog(null, "Paciente eliminado correctamente.");
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "No se encontró ningún paciente con esa cédula.");
            return false;
        }
    }
}