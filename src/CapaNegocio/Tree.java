package CapaNegocio;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Tree {
    private NodoArbol root;
    private Map<Short, NodoArbol> nodeMap;  // Mapa de nodos por ID
    private Map<Short, List<NodoHijo>> parentChildMap;  // Relación padre-hijo

    public Tree() {
        this.nodeMap = new HashMap<>();
        this.parentChildMap = new HashMap<>();
    }

    public Tree(NodoArbol root) {
        this();
        this.root = root;
        this.nodeMap.put(root.getNodoArbolId(), root);
        this.parentChildMap.put(root.getNodoArbolId(), new ArrayList<>());
    }

    public NodoArbol searchNode(short id) {
        return nodeMap.get(id);
    }

    private NodoArbol searchParent(short childId) {
        for (Map.Entry<Short, List<NodoHijo>> entry : parentChildMap.entrySet()) {
            for (NodoHijo hijo : entry.getValue()) {
                if (hijo.getNodoHijoId() == childId) {
                    return nodeMap.get(entry.getKey());
                }
            }
        }
        return null;
    }

    public void removeNode(short id) {
        NodoArbol parent = searchParent(id);
        if (parent != null) {
            List<NodoHijo> children = parentChildMap.get(parent.getNodoArbolId());
            children.removeIf(hijo -> hijo.getNodoHijoId() == id);
            parentChildMap.put(parent.getNodoArbolId(), children);
        }
        nodeMap.remove(id);
        parentChildMap.remove(id);
    }

    public void addNewNode(NodoArbol node, short parentId) {
        nodeMap.put(node.getNodoArbolId(), node);
        parentChildMap.putIfAbsent(parentId, new ArrayList<>());

        // Cambiar `1` a `(short) 1` para asegurar que sea un `short`
        NodoHijo relacion = new NodoHijo(parentId, node.getNodoArbolId(), 'T', (short) 1, node);
        parentChildMap.get(parentId).add(relacion);
        parentChildMap.put(node.getNodoArbolId(), new ArrayList<>());
    }


    public void modifyNode(NodoArbol node) {
        if (nodeMap.containsKey(node.getNodoArbolId())) {
            nodeMap.put(node.getNodoArbolId(), node);
        }
    }

    public NodoArbol getRoot() {
        return root;
    }

    public void setRoot(NodoArbol root) {
        this.root = root;
    }
}