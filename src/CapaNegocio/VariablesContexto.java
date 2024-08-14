package CapaNegocio;

import java.math.BigDecimal;


public class VariablesContexto {
    private short variableId;
    private String nombre;
    private String tipo;
    private short largo;
    private Integer valorEntero;
    private BigDecimal valorReal;
    private String vectorEntero;
    private String vectorString;
    private String valorString;

    public VariablesContexto(short variableId, String nombre, String tipo, short largo, Integer valorEntero, BigDecimal valorReal, String vectorEntero, String vectorString, String valorString) {
        this.variableId = variableId;
        this.nombre = nombre;
        this.tipo = tipo;
        this.largo = largo;
        this.valorEntero = valorEntero;
        this.valorReal = valorReal;
        this.vectorEntero = vectorEntero;
        this.vectorString = vectorString;
        this.valorString = valorString;
    }

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

    public Integer getValorEntero() {
        return valorEntero;
    }

    public void setValorEntero(Integer valorEntero) {
        this.valorEntero = valorEntero;
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

    public String getVectorString() {
        return vectorString;
    }

    public void setVectorString(String vectorString) {
        this.vectorString = vectorString;
    }

    public String getValorString() {
        return valorString;
    }

    public void setValorString(String valorString) {
        this.valorString = valorString;
    }
    
    
}