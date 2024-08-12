package CapaNegocio;

public class NodoArbol {
    
    private short nodoId;
    private String nombre;
    private String tipoNodo;
    private String tipoExpresion;
    private String expresion;

    public NodoArbol(short nodoId, String nombre, String tipoNodo, String tipoExpresion, String expresion) {
        this.nodoId = nodoId;
        this.nombre = nombre;
        this.tipoNodo = tipoNodo;
        this.tipoExpresion = tipoExpresion;
        this.expresion = expresion;
    }    

    public short getNodoId() {
        return nodoId;
    }

    public void setNodoId(short nodoId) {
        this.nodoId = nodoId;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoNodo() {
        return tipoNodo;
    }

    public void setTipoNodo(String tipoNodo) {
        this.tipoNodo = tipoNodo;
    }

    public String getTipoExpresion() {
        return tipoExpresion;
    }

    public void setTipoExpresion(String tipoExpresion) {
        this.tipoExpresion = tipoExpresion;
    }

    public String getExpresion() {
        return expresion;
    }

    public void setExpresion(String expresion) {
        this.expresion = expresion;
    }
    
    @Override
    public String toString() {
        return "NodoArbol{" +
                "nodoId=" + nodoId +
                ", nombre='" + nombre + '\'' +
                ", tipoNodo='" + tipoNodo + '\'' +
                ", tipoExpresion='" + tipoExpresion + '\'' +
                ", expresion='" + expresion + '\'' +
                '}';
    }
}