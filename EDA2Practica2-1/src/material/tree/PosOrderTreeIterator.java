/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package material.tree;

import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import javafx.util.Pair;

/**
 *
 * @author jvelez
 * @param <T>
 */
public class PosOrderTreeIterator<T> implements Iterator<Position<T>> {

    private final Deque< Pair<Position<T>,Iterator<? extends Position<T>>> > nodeStack = new LinkedList<>();
    private final Tree<T> tree;

    public PosOrderTreeIterator(Tree<T> tree) {
        this(tree, tree.root());
    }

    public PosOrderTreeIterator(Tree<T> tree, Position<T> root) {
        this.tree = tree;
        nodeStack.add(new Pair <>(root,tree.children(root).iterator()));
    }

    @Override
    public boolean hasNext() {
        return (!nodeStack.isEmpty());
    }

    /**
     * This method visits the nodes of a tree by following a pos-order
     */
    @Override
    public Position<T> next() {
        if (nodeStack.isEmpty())
            throw new RuntimeException("No next element");
        
        Pair<Position<T>,Iterator<? extends Position<T>>> element = nodeStack.getLast();
        Position<T> node = element.getKey();
        Iterator<? extends Position<T>> iterator = element.getValue();
        
        while (tree.isInternal(node) && iterator.hasNext()) {
            node = iterator.next();
            iterator = tree.children(node).iterator();
            nodeStack.addLast(new Pair <>(node,iterator));
        }

        nodeStack.removeLast();
        return node;

    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException("Not implemented.");
    }
}
