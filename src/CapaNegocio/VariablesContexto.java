package CapaNegocio;


public class VariablesContexto {
    private short variableId;
    private String nombre;
    private String tipo;
    private short largo;
    private short valorEntero;
    private double valorReal;
    private String vectorEntero;
    private String vectorString;
    private String valorString;

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

    public short getValorEntero() {
        return valorEntero;
    }

    public void setValorEntero(short valorEntero) {
        this.valorEntero = valorEntero;
    }

    public double getValorReal() {
        return valorReal;
    }

    public void setValorReal(double valorReal) {
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