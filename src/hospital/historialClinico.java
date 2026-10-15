package hospital;

import java.time.LocalDate;

public class historialClinico {

    public int idHistoria;
    public LocalDate fechaApertura;
    public String grupoSanguineo;
    public String antecedentes;
    public String alergias;
    public paciente paciente;

    public historialClinico(int idHistoria, LocalDate fechaApertura, String grupoSanguineo, String antecedentes, String alergias, paciente paciente) {
        this.idHistoria = idHistoria;
        this.fechaApertura = fechaApertura;
        this.grupoSanguineo = grupoSanguineo;
        this.antecedentes = antecedentes;
        this.alergias = alergias;
        this.paciente = paciente;
    }

    public int getIdHistoria() {
        return idHistoria;
    }

    public void setIdHistoria(int idHistoria) {
        this.idHistoria = idHistoria;
    }

    public LocalDate getFechaApertura() {
        return fechaApertura;
    }

    public void setFechaApertura(LocalDate fechaApertura) {
        this.fechaApertura = fechaApertura;
    }

    public String getGrupoSanguineo() {
        return grupoSanguineo;
    }

    public void setGrupoSanguineo(String grupoSanguineo) {
        this.grupoSanguineo = grupoSanguineo;
    }

    public String getAntecedentes() {
        return antecedentes;
    }

    public void setAntecedentes(String antecedentes) {
        this.antecedentes = antecedentes;
    }

    public String getAlergias() {
        return alergias;
    }

    public void setAlergias(String alergias) {
        this.alergias = alergias;
    }

    public paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(paciente paciente) {
        this.paciente = paciente;
    }
}
