package CapaNegocio;

public class NodoHijo {
    
    private short nodoPadreId;
    private short nodoHijoId;
    private char opcionTF;
    private short posicionRango;

    public NodoHijo(short nodoPadreId, short nodoHijoId, char opcionTF, short posicionRango) {
        this.nodoPadreId = nodoPadreId;
        this.nodoHijoId = nodoHijoId;
        this.opcionTF = opcionTF;
        this.posicionRango = posicionRango;
    }

    public short getNodoPadreId() {
        return nodoPadreId;
    }

    public void setNodoPadreId(short nodoPadreId) {
        this.nodoPadreId = nodoPadreId;
    }

    public short getNodoHijoId() {
        return nodoHijoId;
    }

    public void setNodoHijoId(short nodoHijoId) {
        this.nodoHijoId = nodoHijoId;
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
}