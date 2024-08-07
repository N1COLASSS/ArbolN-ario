package CapaNegocio;

public class NodoHijos {

    private short nodoPadre;
    private short nodoHijo;
    private char opcionTF;
    private short posicionRango;
    private short nodoArbolIdNodoArbol;

    public NodoHijos(short nodoPadre, short nodoHijo, char opcionTF, short posicionRango, short nodoArbolIdNodoArbol) {
        this.nodoPadre = nodoPadre;
        this.nodoHijo = nodoHijo;
        this.opcionTF = opcionTF;
        this.posicionRango = posicionRango;
        this.nodoArbolIdNodoArbol = nodoArbolIdNodoArbol;
    }

    // Getters and Setters

    public short getNodoPadre() {
        return nodoPadre;
    }

    public void setNodoPadre(short nodoPadre) {
        this.nodoPadre = nodoPadre;
    }

    public short getNodoHijo() {
        return nodoHijo;
    }

    public void setNodoHijo(short nodoHijo) {
        this.nodoHijo = nodoHijo;
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

    public short getNodoArbolIdNodoArbol() {
        return nodoArbolIdNodoArbol;
    }

    public void setNodoArbolIdNodoArbol(short nodoArbolIdNodoArbol) {
        this.nodoArbolIdNodoArbol = nodoArbolIdNodoArbol;
    }

    @Override
    public String toString() {
        return "NodoHijos{" +
                "nodoPadre=" + nodoPadre +
                ", nodoHijo=" + nodoHijo +
                ", opcionTF=" + opcionTF +
                ", posicionRango=" + posicionRango +
                ", nodoArbolIdNodoArbol=" + nodoArbolIdNodoArbol +
                '}';
    }
}