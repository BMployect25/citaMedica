package hospital;

public class diagnostico {

    public int idDiagnostico;
    public String codigoCie10;
    public String descripcion;
    public String tipo;
    public cita cita;

    public diagnostico(int idDiagnostico, String codigoCie10, String descripcion, String tipo, cita cita) {
        this.idDiagnostico = idDiagnostico;
        this.codigoCie10 = codigoCie10;
        this.descripcion = descripcion;
        this.tipo = tipo;
        this.cita = cita;
    }

    public int getIdDiagnostico() {
        return idDiagnostico;
    }

    public void setIdDiagnostico(int idDiagnostico) {
        this.idDiagnostico = idDiagnostico;
    }

    public String getCodigoCie10() {
        return codigoCie10;
    }

    public void setCodigoCie10(String codigoCie10) {
        this.codigoCie10 = codigoCie10;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public cita getCita() {
        return cita;
    }

    public void setCita(cita cita) {
        this.cita = cita;
    }
}