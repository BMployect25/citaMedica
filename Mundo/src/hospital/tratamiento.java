package hospital;

public class tratamiento {

    public int idTratamiento;
    public String medicamento;
    public String dosis;
    public String frecuencia;
    public int duracionDias;
    public String indicaciones;
    public diagnostico diagnostico;

    public tratamiento(int idTratamiento, String medicamento, String dosis, String frecuencia, int duracionDias, String indicaciones, diagnostico diagnostico) {
        this.idTratamiento = idTratamiento;
        this.medicamento = medicamento;
        this.dosis = dosis;
        this.frecuencia = frecuencia;
        this.duracionDias = duracionDias;
        this.indicaciones = indicaciones;
        this.diagnostico = diagnostico;
    }

    public int getIdTratamiento() {
        return idTratamiento;
    }

    public void setIdTratamiento(int idTratamiento) {
        this.idTratamiento = idTratamiento;
    }

    public String getMedicamento() {
        return medicamento;
    }

    public void setMedicamento(String medicamento) {
        this.medicamento = medicamento;
    }

    public String getDosis() {
        return dosis;
    }

    public void setDosis(String dosis) {
        this.dosis = dosis;
    }

    public String getFrecuencia() {
        return frecuencia;
    }

    public void setFrecuencia(String frecuencia) {
        this.frecuencia = frecuencia;
    }

    public int getDuracionDias() {
        return duracionDias;
    }

    public void setDuracionDias(int duracionDias) {
        this.duracionDias = duracionDias;
    }

    public String getIndicaciones() {
        return indicaciones;
    }

    public void setIndicaciones(String indicaciones) {
        this.indicaciones = indicaciones;
    }

    public diagnostico getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(diagnostico diagnostico) {
        this.diagnostico = diagnostico;
    }
}
