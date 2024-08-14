package CapaNegocio;

public class NodoHijo {
    private short nodoPadre;
    private short nodoHijo;
    private char opcionTF;
    private short posicionRango;
    private short nodoArbolId;

    public NodoHijo(short nodoPadre, short nodoHijo, char opcionTF, short posicionRango, short nodoArbolId) {
        this.nodoPadre = nodoPadre;
        this.nodoHijo = nodoHijo;
        this.opcionTF = opcionTF;
        this.posicionRango = posicionRango;
        this.nodoArbolId = nodoArbolId;
    }

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

    public short getNodoArbolId() {
        return nodoArbolId;
    }

    public void setNodoArbolId(short nodoArbolId) {
        this.nodoArbolId = nodoArbolId;
    }
    
    
}