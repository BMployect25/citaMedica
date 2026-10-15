/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mundo;
import java.util.LinkedList;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
/**
 *
 * @author COORD RYC
 */
public class OperacionesPacientes {
public static int con=0;
public static LinkedList<Paciente> lc = new LinkedList();

public static void Guardar(Paciente p){
    lc.add(con++, p);
}
public static boolean buscar(String cedula)
   {
       boolean saber=false;
       Paciente c1=null;
       for(int i=0;i<lc.size();i++)
       {
           c1=(Paciente)lc.get(i);
           if(cedula.equals(c1.getIdPaciente()))
           {
               con=i;
               saber=true;
           }
       }

       return saber;
   }


   public static void modificar(String idPaciente, String nombrePaciente, String edad, String direccion, String telefono)
   {
         Paciente c2=null;
         c2=(Paciente)lc.get(con);
         c2.setIdPaciente(idPaciente);
         c2.setNombrePaciente(nombrePaciente);
         c2.setEdad(edad);
         c2.setTelefono(telefono);
         c2.setDireccion(direccion);
        
   }
  
  
public static JTable crearTablaPacientes() {
   
    String[] columnas = {"Cédula", "Nombre", "Edad", "Teléfono", "Dirección"};
    

    Object[][] datos = new Object[lc.size()][5];
    for (int i = 0; i < lc.size(); i++) {
        Paciente paciente = (Paciente) lc.get(i);
        datos[i][0] = paciente.getIdPaciente();
        datos[i][1] = paciente.getNombrePaciente();
        datos[i][2] = paciente.getEdad();
        datos[i][3] = paciente.getTelefono();
        datos[i][4] = paciente.getDireccion();
    }
    
    DefaultTableModel modelo = new DefaultTableModel(datos, columnas) ;
    JTable tabla = new JTable(modelo);
    tabla.setRowHeight(25);
    tabla.getTableHeader().setFont(new Font("Arial", Font.BOLD, 12));
    tabla.setAutoCreateRowSorter(true);
    

    tabla.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
    tabla.getColumnModel().getColumn(0).setPreferredWidth(100); // Cédula
    tabla.getColumnModel().getColumn(1).setPreferredWidth(200); // Nombre
    tabla.getColumnModel().getColumn(2).setPreferredWidth(50);  // Edad
    tabla.getColumnModel().getColumn(3).setPreferredWidth(100); // Teléfono
    tabla.getColumnModel().getColumn(4).setPreferredWidth(250); // Dirección
    
    return tabla;
}

}
