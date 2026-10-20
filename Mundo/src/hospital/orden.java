package hospital;

import java.time.LocalDate;

public class orden {

    public int idOrden;
    public tipoOrden tipo;
    public LocalDate fechaOrden;
    public String estado;
    public String observaciones;
    public cita cita;

    public orden(int idOrden, tipoOrden tipo, LocalDate fechaOrden, String estado, String observaciones, cita cita) {
        this.idOrden = idOrden;
        this.tipo = tipo;
        this.fechaOrden = fechaOrden;
        this.estado = estado;
        this.observaciones = observaciones;
        this.cita = cita;
    }

    public int getIdOrden() {
        return idOrden;
    }

    public void setIdOrden(int idOrden) {
        this.idOrden = idOrden;
    }

    public tipoOrden getTipo() {
        return tipo;
    }

    public void setTipo(tipoOrden tipo) {
        this.tipo = tipo;
    }

    public LocalDate getFechaOrden() {
        return fechaOrden;
    }

    public void setFechaOrden(LocalDate fechaOrden) {
        this.fechaOrden = fechaOrden;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public cita getCita() {
        return cita;
    }

    public void setCita(cita cita) {
        this.cita = cita;
    }
}