package arbolgen;

import CapaNegocio.NodoArbol;
import CapaNegocio.Tree;

public class ArbolGen {
    public static void main(String[] args) {
        Tree arbol = new Tree();

        // Agregar nodos manualmente
        NodoArbol raiz = new NodoArbol((short) 1, "Raíz");
        NodoArbol activo = new NodoArbol((short) 2, "Activo");
        NodoArbol variable = new NodoArbol((short) 3, "Variable");

        arbol.agregarNodo(raiz);
        arbol.agregarNodo(activo);
        arbol.agregarNodo(variable);

        // Agregar enlaces manualmente
        arbol.agregarEnlace((short) 1, (short) 2, 'T', (short) 1);
        arbol.agregarEnlace((short) 1, (short) 3, 'F', (short) 2);

        // Mostrar el árbol
        arbol.mostrarArbol();
    }
}
