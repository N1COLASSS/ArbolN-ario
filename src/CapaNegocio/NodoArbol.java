package CapaNegocio;

import java.util.ArrayList;
import java.util.List;

public class NodoArbol {
    private short nodoArbolId;
    private String tipoNodo;
    private Short tipoExpresion;
    private List<NodoHijo> hijos; 

    public NodoArbol(short nodoArbolId, String tipoNodo, Short tipoExpresion) {
        this.nodoArbolId = nodoArbolId;
        this.tipoNodo = tipoNodo;
        this.tipoExpresion = tipoExpresion;
        this.hijos = new ArrayList<>();
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

    public Short getTipoExpresion() {
        return tipoExpresion;
    }

    public void setTipoExpresion(Short tipoExpresion) {
        this.tipoExpresion = tipoExpresion;
    }

    public List<NodoHijo> getHijos() {
        return hijos;
    }

    public void setHijos(List<NodoHijo> hijos) {
        this.hijos = hijos;
    }
}