package CapaNegocio;

import java.util.ArrayList;
import java.util.List;

public class NodoArbol {
    private short nodoArbolId;
    private String tipoNodo;
    private List<NodoArbol> hijos;

    // Constructor con inicialización de la lista de hijos
    public NodoArbol(short nodoArbolId, String tipoNodo) {
        this.nodoArbolId = nodoArbolId;
        this.tipoNodo = tipoNodo;
        this.hijos = new ArrayList<>(); // Inicializa la lista de hijos
    }

    public NodoArbol(short nodoArbolId, String tipoNodo, List<NodoArbol> hijos) {
        this.nodoArbolId = nodoArbolId;
        this.tipoNodo = tipoNodo;
        this.hijos = hijos != null ? hijos : new ArrayList<>(); // Inicializa si es null
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

    public List<NodoArbol> getHijos() {
        return hijos;
    }

    public void setHijos(List<NodoArbol> hijos) {
        this.hijos = hijos;
    }
    
    public void agregarHijo(NodoArbol nodoHijo) {
        hijos.add(nodoHijo);
    }
}