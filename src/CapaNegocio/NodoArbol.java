package CapaNegocio;

public class NodoArbol {

    private short nodoArbolId;
    private String tipoNodo;
    private short causaId;
    private short tipoExpresion;
    private short arbolIdArbolDecision;
    private short causaIdCausas;
    private short expresion;
    private short expresionIdExpresiones;

    public NodoArbol(short nodoArbolId, String tipoNodo, short causaId, short tipoExpresion, short arbolIdArbolDecision, short causaIdCausas, short expresion, short expresionIdExpresiones) {
        this.nodoArbolId = nodoArbolId;
        this.tipoNodo = tipoNodo;
        this.causaId = causaId;
        this.tipoExpresion = tipoExpresion;
        this.arbolIdArbolDecision = arbolIdArbolDecision;
        this.causaIdCausas = causaIdCausas;
        this.expresion = expresion;
        this.expresionIdExpresiones = expresionIdExpresiones;
    }

    // Getters and Setters

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

    public short getCausaId() {
        return causaId;
    }

    public void setCausaId(short causaId) {
        this.causaId = causaId;
    }

    public short getTipoExpresion() {
        return tipoExpresion;
    }

    public void setTipoExpresion(short tipoExpresion) {
        this.tipoExpresion = tipoExpresion;
    }

    public short getArbolIdArbolDecision() {
        return arbolIdArbolDecision;
    }

    public void setArbolIdArbolDecision(short arbolIdArbolDecision) {
        this.arbolIdArbolDecision = arbolIdArbolDecision;
    }

    public short getCausaIdCausas() {
        return causaIdCausas;
    }

    public void setCausaIdCausas(short causaIdCausas) {
        this.causaIdCausas = causaIdCausas;
    }

    public short getExpresion() {
        return expresion;
    }

    public void setExpresion(short expresion) {
        this.expresion = expresion;
    }

    public short getExpresionIdExpresiones() {
        return expresionIdExpresiones;
    }

    public void setExpresionIdExpresiones(short expresionIdExpresiones) {
        this.expresionIdExpresiones = expresionIdExpresiones;
    }

    @Override
    public String toString() {
        return "NodoArbol{" +
                "nodoArbolId=" + nodoArbolId +
                ", tipoNodo='" + tipoNodo + '\'' +
                ", causaId=" + causaId +
                ", tipoExpresion=" + tipoExpresion +
                ", arbolIdArbolDecision=" + arbolIdArbolDecision +
                ", causaIdCausas=" + causaIdCausas +
                ", expresion=" + expresion +
                ", expresionIdExpresiones=" + expresionIdExpresiones +
                '}';
    }
}