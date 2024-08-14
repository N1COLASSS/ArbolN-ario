package CapaNegocio;

public class Activos {
    private short activoId;
    private String nombre;
    private String tipo;
    private String estado;
    private String monitor;
    private String docEstado;

    public Activos(short activoId, String nombre, String tipo, String estado, String monitor, String docEstado) {
        this.activoId = activoId;
        this.nombre = nombre;
        this.tipo = tipo;
        this.estado = estado;
        this.monitor = monitor;
        this.docEstado = docEstado;
    }

    public short getActivoId() {
        return activoId;
    }

    public void setActivoId(short activoId) {
        this.activoId = activoId;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getMonitor() {
        return monitor;
    }

    public void setMonitor(String monitor) {
        this.monitor = monitor;
    }

    public String getDocEstado() {
        return docEstado;
    }

    public void setDocEstado(String docEstado) {
        this.docEstado = docEstado;
    }
    
    
}