package CapaNegocio;

import javax.swing.tree.DefaultMutableTreeNode;
import java.util.Stack;

public class Tree {

    private NodoHijo root;

    public Tree(NodoHijo root) {
        this.root = root;
    }

    public NodoHijo searchNode(Object obj) {
        return searchNode(root, obj);
    }

    private NodoHijo searchNode(NodoHijo rootNode, Object obj) {
        if (rootNode.getNodoArbol().getNombre().equals(obj)) {
            return rootNode;
        }
        for (NodoHijo hijo : rootNode.getNodoHijos()) {
            NodoHijo found = searchNode(hijo, obj);
            if (found != null) {
                return found;
            }
        }
        return null;
    }

    public void removeNode(Object parentNodeValue) {
        NodoHijo parentNode = searchNode(root, parentNodeValue);
        if (parentNode != null) {
            parentNode.getNodoHijos().removeIf(h -> h.getNodoArbol().getNombre().equals(parentNodeValue));
        } else if (root.getNodoArbol().getNombre().equals(parentNodeValue)) {
            root = null;
        }
    }

    public NodoHijo addNewNode(NodoHijo parentNode, NodoHijo newNode) {
        if (parentNode != null) {
            parentNode.add(newNode);
        } else {
            System.out.println("No se puede agregar porque el nodo padre no existe.");
        }
        return newNode;
    }

    public boolean modifyNode(NodoHijo node, NodoArbol newNodoArbol) {
        if (node != null) {
            node.setNodoArbol(newNodoArbol);
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return toString(root, 0);
    }

    private String toString(NodoHijo root, int level) {
        StringBuilder sb = new StringBuilder();
        if (root != null) {
            sb.append(" ".repeat(level * 2)).append(root.getNodoArbol().getNombre()).append("\n");
            for (NodoHijo hijo : root.getNodoHijos()) {
                sb.append(toString(hijo, level + 1));
            }
        }
        return sb.toString();
    }

    public String[] nodes2StringArray() {
        return toString().split("\n");
    }
    
    public static DefaultMutableTreeNode text2DTree(String text) {
        Stack<DefaultMutableTreeNode> pila = new Stack<>();
        Stack<DefaultMutableTreeNode> aux = new Stack<>();

        String[] lines = text.split("\n");
        DefaultMutableTreeNode S1, S2;
        DefaultMutableTreeNode auxS1, auxS2;

        pila.push(new DefaultMutableTreeNode(lines[0]));
        aux.push(new DefaultMutableTreeNode(lines[0]));
        for (int i = 1; i < lines.length; i++) {
            S1 = pila.peek();
            auxS1 = aux.peek();

            S2 = new DefaultMutableTreeNode(lines[i]);
            auxS2 = new DefaultMutableTreeNode(lines[i].replace("-", " "));

            int s1 = countDepth(S1.toString(), '-');
            int s2 = countDepth(S2.toString(), '-');

            if (s1 < s2) {
                S1.add(S2);
                auxS1.add(auxS2);

                pila.push(S2);
                aux.push(auxS2);
            } else {
                while (s1 >= s2 && pila.size() >= 2) {
                    pila.pop();
                    aux.pop();

                    S1 = pila.peek();
                    auxS1 = aux.peek();

                    s1 = countDepth(S1.toString(), '-');
                }
                S1.add(S2);
                auxS1.add(auxS2);

                pila.push(S2);
                aux.push(auxS2);
            }
        }
        return aux.get(0);
    }

    private static int countDepth(String s, char c) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                count++;
            }
        }
        return count;
    }

}