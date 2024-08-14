package CapaNegocio;

public class NodoArbol {
    private short nodoArbolId;
    private String tipoNodo;
    private short tipoExpersion;
    private short expresion;

    public NodoArbol(short nodoArbolId, String tipoNodo, short tipoExpersion, short expresion) {
        this.nodoArbolId = nodoArbolId;
        this.tipoNodo = tipoNodo;
        this.tipoExpersion = tipoExpersion;
        this.expresion = expresion;
    }

    public short getNodoArbolId() {
        return nodoArbolId;
    }

    public void setNodoArbolId(short nodoArbolId) {
        this.nodoArbolId = nodoArbolId;
    }

    public String getTipoNodo() {
        return tipoNodo;
    }

    public void setTipoNodo(String tipoNodo) {
        this.tipoNodo = tipoNodo;
    }

    public short getTipoExpersion() {
        return tipoExpersion;
    }

    public void setTipoExpersion(short tipoExpersion) {
        this.tipoExpersion = tipoExpersion;
    }

    public short getExpresion() {
        return expresion;
    }

    public void setExpresion(short expresion) {
        this.expresion = expresion;
    }
    
    
}