package CapaNegocio;

import java.math.BigDecimal;

public class VariablesContexto extends NodoArbol{
    
    private String tipo;
    private short largo;
    private short valorEntero;
    private BigDecimal valorReal;
    private String vectorEntero;
    private String vectorString;
    private String valorString;

    public VariablesContexto(String tipo, short largo, short valorEntero, BigDecimal valorReal, String vectorEntero, String vectorString, String valorString, short nodoId, String nombre, String tipoNodo, String tipoExpresion, String expresion) {
        super(nodoId, nombre, tipoNodo, tipoExpresion, expresion);
        this.tipo = tipo;
        this.largo = largo;
        this.valorEntero = valorEntero;
        this.valorReal = valorReal;
        this.vectorEntero = vectorEntero;
        this.vectorString = vectorString;
        this.valorString = valorString;
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

    public short getValorEntero() {
        return valorEntero;
    }

    public void setValorEntero(short valorEntero) {
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
    
    @Override
    public String toString() {
        return super.toString() + ", tipo=" + tipo + ", largo=" + largo + ", valorEntero=" + valorEntero + ", valorReal=" + valorReal;
    }
}