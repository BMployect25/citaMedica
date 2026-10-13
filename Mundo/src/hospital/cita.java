package hospital;

import java.time.LocalDateTime;

public class cita {

    public int idCita;
    public LocalDateTime fechaHora;
    public String motivo;
    public estadoCita estado;
    public paciente paciente;
    public medico medico;

    public cita(int idCita, LocalDateTime fechaHora, String motivo, estadoCita estado, paciente paciente, medico medico) {
        this.idCita = idCita;
        this.fechaHora = fechaHora;
        this.motivo = motivo;
        this.estado = estado;
        this.paciente = paciente;
        this.medico = medico;
    }

    public int getIdCita() {
        return idCita;
    }

    public void setIdCita(int idCita) {
        this.idCita = idCita;
    }

    public LocalDateTime getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(LocalDateTime fechaHora) {
        this.fechaHora = fechaHora;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public estadoCita getEstado() {
        return estado;
    }

    public void setEstado(estadoCita estado) {
        this.estado = estado;
    }

    public paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(paciente paciente) {
        this.paciente = paciente;
    }

    public medico getMedico() {
        return medico;
    }

    public void setMedico(medico medico) {
        this.medico = medico;
    }
}