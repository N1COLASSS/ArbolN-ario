package CapaNegocio;

import java.util.Date;

public class Sentencias extends NodoArbol {
    
    private String query;
    private String estado;
    private Date fechaAprobacion;

    public Sentencias(String query, String estado, Date fechaAprobacion, short nodoId, String nombre, String tipoExpresion, String expresion) {
        super(nodoId, nombre, "Sentencias", tipoExpresion, expresion);
        this.query = query;
        this.estado = estado;
        this.fechaAprobacion = fechaAprobacion;
    }

    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Date getFechaAprobacion() {
        return fechaAprobacion;
    }

    public void setFechaAprobacion(Date fechaAprobacion) {
        this.fechaAprobacion = fechaAprobacion;
    }
    
    @Override
    public String toString() {
        return super.toString() + ", query=" + query + ", estado=" + estado + ", fechaAprobacion=" + fechaAprobacion;
    }
}