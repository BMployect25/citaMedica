package mundo;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class OperacionesMedicos {

    private static ArrayList<Medico> listaMedicos = new ArrayList<>();

    public ArrayList<Medico> getListaMedicos() {
        return listaMedicos;
    }

    public Medico buscarMedico(String documento) {
        for (Medico m : listaMedicos) {
            if (m.getDocumento().equals(documento)) {
                return m;
            }
        }
        return null;
    }

    public boolean registrarMedico(String documento, String nombre, String apellido, String especialidad) {
        if (buscarMedico(documento) != null) {
            JOptionPane.showMessageDialog(null, 
                "El médico con documento " + documento + " ya se encuentra registrado.", 
                "Registro Denegado", 
                JOptionPane.WARNING_MESSAGE);
            return false;
        }

        Medico nuevo = new Medico(documento, nombre, apellido, especialidad);
        listaMedicos.add(nuevo);
        return true;
    }

    public boolean eliminarMedico(String documento) {
        Medico m = buscarMedico(documento);
        if (m != null) {
            listaMedicos.remove(m);
            JOptionPane.showMessageDialog(null, "Médico eliminado correctamente.");
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "No se encontró ningún médico con ese documento.");
            return false;
        }
    }
}