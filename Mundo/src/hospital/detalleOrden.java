package hospital;

public class detalleOrden {

    public int idDetalle;
    public String descripcion;
    public int cantidad;
    public String indicaciones;
    public orden orden;

    public detalleOrden(int idDetalle, String descripcion, int cantidad, String indicaciones, orden orden) {
        this.idDetalle = idDetalle;
        this.descripcion = descripcion;
        this.cantidad = cantidad;
        this.indicaciones = indicaciones;
        this.orden = orden;
    }

    public int getIdDetalle() {
        return idDetalle;
    }

    public void setIdDetalle(int idDetalle) {
        this.idDetalle = idDetalle;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getIndicaciones() {
        return indicaciones;
    }

    public void setIndicaciones(String indicaciones) {
        this.indicaciones = indicaciones;
    }

    public orden getOrden() {
        return orden;
    }

    public void setOrden(orden orden) {
        this.orden = orden;
    }
}