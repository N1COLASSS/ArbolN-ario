package CapaNegocio;

import java.math.BigDecimal;

public class NodoVariable {

    private short variableId;
    private String nombre;
    private short componenteId;
    private String tipo;
    private short largo;
    private short valorIntero;
    private BigDecimal valorReal;
    private String vectorEntero;
    private String vectorStrung;
    private short activoId;
    private short localizacionId;
    private short activiId;
    private short localizacionIdLocalizacion;
    private short asociacionId;
    private String valorString;
    private short asociacionIdAsociaciones;
    private short componenteIdComponentesActivos;
    private short activoIdActivos;
    private short expresionIdExpresiones;

    public NodoVariable(short variableId, String nombre, short componenteId, String tipo, short largo, short valorIntero, BigDecimal valorReal, String vectorEntero, String vectorStrung, short activoId, short localizacionId, short activiId, short localizacionIdLocalizacion, short asociacionId, String valorString, short asociacionIdAsociaciones, short componenteIdComponentesActivos, short activoIdActivos, short expresionIdExpresiones) {
        this.variableId = variableId;
        this.nombre = nombre;
        this.componenteId = componenteId;
        this.tipo = tipo;
        this.largo = largo;
        this.valorIntero = valorIntero;
        this.valorReal = valorReal;
        this.vectorEntero = vectorEntero;
        this.vectorStrung = vectorStrung;
        this.activoId = activoId;
        this.localizacionId = localizacionId;
        this.activiId = activiId;
        this.localizacionIdLocalizacion = localizacionIdLocalizacion;
        this.asociacionId = asociacionId;
        this.valorString = valorString;
        this.asociacionIdAsociaciones = asociacionIdAsociaciones;
        this.componenteIdComponentesActivos = componenteIdComponentesActivos;
        this.activoIdActivos = activoIdActivos;
        this.expresionIdExpresiones = expresionIdExpresiones;
    }

    // Getters and Setters

    public short getVariableId() {
        return variableId;
    }

    public void setVariableId(short variableId) {
        this.variableId = variableId;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public short getComponenteId() {
        return componenteId;
    }

    public void setComponenteId(short componenteId) {
        this.componenteId = componenteId;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public short getLargo() {
        return largo;
    }

    public void setLargo(short largo) {
        this.largo = largo;
    }

    public short getValorIntero() {
        return valorIntero;
    }

    public void setValorIntero(short valorIntero) {
        this.valorIntero = valorIntero;
    }

    public BigDecimal getValorReal() {
        return valorReal;
    }

    public void setValorReal(BigDecimal valorReal) {
        this.valorReal = valorReal;
    }

    public String getVectorEntero() {
        return vectorEntero;
    }

    public void setVectorEntero(String vectorEntero) {
        this.vectorEntero = vectorEntero;
    }

    public String getVectorStrung() {
        return vectorStrung;
    }

    public void setVectorStrung(String vectorStrung) {
        this.vectorStrung = vectorStrung;
    }

    public short getActivoId() {
        return activoId;
    }

    public void setActivoId(short activoId) {
        this.activoId = activoId;
    }

    public short getLocalizacionId() {
        return localizacionId;
    }

    public void setLocalizacionId(short localizacionId) {
        this.localizacionId = localizacionId;
    }

    public short getActiviId() {
        return activiId;
    }

    public void setActiviId(short activiId) {
        this.activiId = activiId;
    }

    public short getLocalizacionIdLocalizacion() {
        return localizacionIdLocalizacion;
    }

    public void setLocalizacionIdLocalizacion(short localizacionIdLocalizacion) {
        this.localizacionIdLocalizacion = localizacionIdLocalizacion;
    }

    public short getAsociacionId() {
        return asociacionId;
    }

    public void setAsociacionId(short asociacionId) {
        this.asociacionId = asociacionId;
    }

    public String getValorString() {
        return valorString;
    }

    public void setValorString(String valorString) {
        this.valorString = valorString;
    }

    public short getAsociacionIdAsociaciones() {
        return asociacionIdAsociaciones;
    }

    public void setAsociacionIdAsociaciones(short asociacionIdAsociaciones) {
        this.asociacionIdAsociaciones = asociacionIdAsociaciones;
    }

    public short getComponenteIdComponentesActivos() {
        return componenteIdComponentesActivos;
    }

    public void setComponenteIdComponentesActivos(short componenteIdComponentesActivos) {
        this.componenteIdComponentesActivos = componenteIdComponentesActivos;
    }

    public short getActivoIdActivos() {
        return activoIdActivos;
    }

    public void setActivoIdActivos(short activoIdActivos) {
        this.activoIdActivos = activoIdActivos;
    }

    public short getExpresionIdExpresiones() {
        return expresionIdExpresiones;
    }

    public void setExpresionIdExpresiones(short expresionIdExpresiones) {
        this.expresionIdExpresiones = expresionIdExpresiones;
    }

    @Override
    public String toString() {
        return "NodoVariable{" +
                "variableId=" + variableId +
                ", nombre='" + nombre + '\'' +
                ", componenteId=" + componenteId +
                ", tipo='" + tipo + '\'' +
                ", largo=" + largo +
                ", valorIntero=" + valorIntero +
                ", valorReal=" + valorReal +
                ", vectorEntero='" + vectorEntero + '\'' +
                ", vectorStrung='" + vectorStrung + '\'' +
                ", activoId=" + activoId +
                ", localizacionId=" + localizacionId +
                ", activiId=" + activiId +
                ", localizacionIdLocalizacion=" + localizacionIdLocalizacion +
                ", asociacionId=" + asociacionId +
                ", valorString='" + valorString + '\'' +
                ", asociacionIdAsociaciones=" + asociacionIdAsociaciones +
                ", componenteIdComponentesActivos=" + componenteIdComponentesActivos +
                ", activoIdActivos=" + activoIdActivos +
                ", expresionIdExpresiones=" + expresionIdExpresiones +
                '}';
    }
}