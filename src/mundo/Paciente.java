/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mundo;

/**
 *
 * @author COORD RYC
 */
public class Paciente {
   private String idPaciente;
   private String nombrePaciente;
   private String edad;
   private String direccion;
   private String telefono;

    public Paciente(String idPaciente, String nombrePaciente, String edad, String direccion, String telefono) {
        this.idPaciente = idPaciente;
        this.nombrePaciente = nombrePaciente;
        this.edad = edad;
        this.direccion = direccion;
        this.telefono = telefono;
    }

 
    public String getIdPaciente() {
        return idPaciente;
    }

    /**
     * @param idPaciente the idPaciente to set
     */
    public void setIdPaciente(String idPaciente) {
        this.idPaciente = idPaciente;
    }

    /**
     * @return the nombrePaciente
     */
    public String getNombrePaciente() {
        return nombrePaciente;
    }

    /**
     * @param nombrePaciente the nombrePaciente to set
     */
    public void setNombrePaciente(String nombrePaciente) {
        this.nombrePaciente = nombrePaciente;
    }

    /**
     * @return the edad
     */
    public String getEdad() {
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(String edad) {
        this.edad = edad;
    }

    /**
     * @return the direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * @param direccion the direccion to set
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * @return the telefono
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * @param telefono the telefono to set
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
   
   
}
