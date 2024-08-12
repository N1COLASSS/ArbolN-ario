package CapaNegocio;

import java.util.ArrayList;

public class NodoHijo {
    
    private short nodoPadreId;
    private ArrayList<NodoHijo> nodoHijos;
    private char opcionTF;
    private short posicionRango;
    private NodoArbol nodoArbol;

    public NodoHijo(short nodoPadreId, char opcionTF, short posicionRango, NodoArbol nodoArbol) {
        this.nodoPadreId = nodoPadreId;
        this.nodoHijos = new ArrayList<>();
        this.opcionTF = opcionTF;
        this.posicionRango = posicionRango;
        this.nodoArbol = nodoArbol;
    }

    public short getNodoPadreId() {
        return nodoPadreId;
    }

    public void setNodoPadreId(short nodoPadreId) {
        this.nodoPadreId = nodoPadreId;
    }

    public ArrayList<NodoHijo> getNodoHijos() {
        return nodoHijos;
    }

    public void setNodoHijos(ArrayList<NodoHijo> nodoHijos) {
        this.nodoHijos = nodoHijos;
    }

    public char getOpcionTF() {
        return opcionTF;
    }

    public void setOpcionTF(char opcionTF) {
        this.opcionTF = opcionTF;
    }

    public short getPosicionRango() {
        return posicionRango;
    }

    public void setPosicionRango(short posicionRango) {
        this.posicionRango = posicionRango;
    }

    public NodoArbol getNodoArbol() {
        return nodoArbol;
    }

    public void setNodoArbol(NodoArbol nodoArbol) {
        this.nodoArbol = nodoArbol;
    }

    // Método para añadir un nuevo NodoHijo a la lista de hijos
    public NodoHijo add(NodoHijo nodoHijo) {
        this.nodoHijos.add(nodoHijo);
        return nodoHijo;
    }
    
    @Override
    public String toString() {
        return nodoArbol.toString();
    }
}
