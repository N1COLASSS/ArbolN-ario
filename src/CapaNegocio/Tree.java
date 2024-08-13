package CapaNegocio;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Tree {
    
    private Map<Short, NodoArbol> nodos = new HashMap<>();
    private Map<Short, List<NodoHijo>> enlaces = new HashMap<>();

    // Método para obtener los nodos
    public Map<Short, NodoArbol> getNodos() {
        return nodos;
    }

    // Método para agregar un nodo al árbol
    public void agregarNodo(NodoArbol nodo) {
        nodos.put(nodo.getNodoArbolId(), nodo);
    }

    // Método para agregar un enlace (relación padre-hijo)
    public void agregarEnlace(short nodoPadreId, short nodoHijoId, char opcionTF, short posicionRango) {
        NodoHijo enlace = new NodoHijo(nodoPadreId, nodoHijoId, opcionTF, posicionRango);
        enlaces.computeIfAbsent(nodoPadreId, k -> new ArrayList<>()).add(enlace);
        
        // También agregar el nodo hijo a la lista de hijos del nodo padre
        NodoArbol nodoPadre = nodos.get(nodoPadreId);
        NodoArbol nodoHijo = nodos.get(nodoHijoId);
        if (nodoPadre != null && nodoHijo != null) {
            nodoPadre.agregarHijo(nodoHijo);
        }
    }

    // Método para mostrar la estructura del árbol
    public void mostrarArbol() {
        for (Map.Entry<Short, NodoArbol> entry : nodos.entrySet()) {
            NodoArbol nodo = entry.getValue();
            System.out.println("Nodo ID: " + nodo.getNodoArbolId() + ", Tipo: " + nodo.getTipoNodo());
            List<NodoHijo> hijos = enlaces.get(nodo.getNodoArbolId());
            if (hijos != null) {
                for (NodoHijo hijo : hijos) {
                    System.out.println("  -> Hijo ID: " + hijo.getNodoHijoId() + ", OpciónTF: " + hijo.getOpcionTF());
                }
            }
        }
    }
    
    public NodoArbol buscarNodo(short nodoId) {
        return nodos.get(nodoId);
    }

    public void eliminarNodo(NodoArbol nodo) {
        nodos.remove(nodo.getNodoArbolId());
        enlaces.remove(nodo.getNodoArbolId());
        for (List<NodoHijo> hijos : enlaces.values()) {
            hijos.removeIf(hijo -> hijo.getNodoHijoId() == nodo.getNodoArbolId());
        }
    }
}