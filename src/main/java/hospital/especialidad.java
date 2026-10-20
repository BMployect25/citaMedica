package hospital;

public class especialidad {
    
    public int idEspecialidad;
    public String nombre;
    public String descripcion;
    public boolean activo;
    
    public especialidad(int idEspecialidad, String nombre, String descripcion, boolean activo){

        this.idEspecialidad=idEspecialidad;
        this.nombre=nombre;
        this.descripcion=descripcion;
        this.activo=activo;
    }
    
    public int getIdEspecialidad() {
        return idEspecialidad;
    }
    public void setIdEspecialidad(int idEspecialidad) {
        this.idEspecialidad = idEspecialidad;
    }
    
    public String getNombre (){
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
     public String getDescripcion (){
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    public boolean getActivo (){
        return activo;
    }
    public void setActivo(boolean activo) {
        this.activo = activo;
    }
}
