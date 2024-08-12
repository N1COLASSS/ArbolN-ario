package CapaNegocio;

public class Activos extends NodoArbol {
    
    private String tipo;
    private String estado;
    private boolean monitor;
    private String docEstado;

    public Activos(String tipo, String estado, boolean monitor, String docEstado, short nodoId, String nombre, String tipoNodo, String tipoExpresion, String expresion) {
        super(nodoId, nombre, "Activos", tipoExpresion, expresion);
        this.tipo = tipo;
        this.estado = estado;
        this.monitor = monitor;
        this.docEstado = docEstado;
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

    public boolean isMonitor() {
        return monitor;
    }

    public void setMonitor(boolean monitor) {
        this.monitor = monitor;
    }

    public String getDocEstado() {
        return docEstado;
    }

    public void setDocEstado(String docEstado) {
        this.docEstado = docEstado;
    }
    
    @Override
    public String toString() {
        return super.toString() + ", tipo=" + tipo + ", estado=" + estado + ", monitor=" + monitor + ", docEstado=" + docEstado;
    }
}