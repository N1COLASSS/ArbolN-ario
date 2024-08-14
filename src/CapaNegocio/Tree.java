package CapaNegocio;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Tree {
    private NodoArbol root;
    private Map<Short, NodoArbol> nodeMap;
    private Map<Short, List<Short>> parentChildMap;

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
        for (Map.Entry<Short, List<Short>> entry : parentChildMap.entrySet()) {
            if (entry.getValue().contains(childId)) {
                return nodeMap.get(entry.getKey());
            }
        }
        return null;
    }

    public void removeNode(short id) {
        NodoArbol parent = searchParent(id);
        if (parent != null) {
            List<Short> children = parentChildMap.get(parent.getNodoArbolId());
            children.remove(Short.valueOf(id));
            parentChildMap.put(parent.getNodoArbolId(), children);
        }
        nodeMap.remove(id);
        parentChildMap.remove(id);
    }

    public void addNewNode(NodoArbol node, short parentId) {
        nodeMap.put(node.getNodoArbolId(), node);
        parentChildMap.putIfAbsent(parentId, new ArrayList<>());
        parentChildMap.get(parentId).add(node.getNodoArbolId());
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