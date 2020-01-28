/*
 *   Created by IntelliJ IDEA Ultimate, 2020
 *   User: dbc2201
 *   Date: 28/01/20
 *   Time: 12:43 PM
 */

package definition;

import adt.LinkedListADT;

public class MyLinkedList<E> implements LinkedListADT<E> {

    @Override
    public void add(E item) {

    }

    @Override
    public E remove(E item) {
        return null;
    }

    @Override
    public int search(E item) {
        return 0;
    }

    @Override
    public void sort() {

    }

    @Override
    public void print() {

    }

    private static class Node<E> {
        private E data;
        private Node<E> next;

        public Node(E data, Node<E> next) {
            this.data = data;
            this.next = next;
        }

        public Node(E data) {
            this.data = data;
        }
    }
}
