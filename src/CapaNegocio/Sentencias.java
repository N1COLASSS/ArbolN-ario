package CapaNegocio;

import java.util.Date;

public class Sentencias {
    private short sentenciaId;
    private String nombre;
    private String query;
    private String estado;
    private Date fechaAprobacion;

    public Sentencias(short sentenciaId, String nombre, String query, String estado, Date fechaAprobacion) {
        this.sentenciaId = sentenciaId;
        this.nombre = nombre;
        this.query = query;
        this.estado = estado;
        this.fechaAprobacion = fechaAprobacion;
    }

    public short getSentenciaId() {
        return sentenciaId;
    }

    public void setSentenciaId(short sentenciaId) {
        this.sentenciaId = sentenciaId;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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
}