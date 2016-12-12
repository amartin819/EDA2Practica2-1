/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package material.tree.binarysearchtree;

import java.util.Iterator;
import java.util.List;

import material.tree.Position;

/**
 *
 * @author A. Duarte, J. Vélez
 * 
 */
public interface BinarySearchTree<E> extends Iterable<Position<E>> {

    /**
     * Returns an entry containing the given key. Returns null if no such entry
     * exists.
     */
    Position<E> find(E value);

    /**
     * Returns an iterable collection of all the entries containing the given
     * key.
     */
    Iterable<? extends Position<E>> findAll(E value);

    /**
     * Inserts an entry into the tree and returns the newly created entry.
     */
    Position<E> insert(E value);

    /**
     * Returns whether the tree is empty.
     */
    boolean isEmpty();


    /**
     * Removes a position.
     * @param pos the position to be removed.
     * @return if the removal has moved other node it return the content 
     * of the other node. In other case it return null.
     */
    void remove(Position<E> pos) throws IllegalStateException;

    /**
     * Returns the number of entries in the tree.
     */
    int size();
    
    
}
