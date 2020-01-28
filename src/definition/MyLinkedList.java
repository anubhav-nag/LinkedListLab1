/*
 *   Created by IntelliJ IDEA Ultimate, 2020
 *   User: dbc2201
 *   Date: 28/01/20
 *   Time: 12:43 PM
 */

package definition;

import adt.LinkedListADT;

public class MyLinkedList<E> implements LinkedListADT<E> {

    private Node<E> head = null;
    private int size = 0;

    private Node<E> getNode(int index) {
        Node<E> response = null;
        return response;
    }

    public E get(int index) {
        E response = null;
        return response;
    }

    public E set(int index, E newValue) {
        E response = null;
        return response;
    }

    private void addFirst(E item) {

    }

    private void addAfter(Node<E> node, E item) {

    }

    public void add(int index, E item) {

    }

    @Override
    public void add(E item) {

    }

    private E removeFirst() {
        E response = null;
        return response;
    }

    private E removeAfter(Node<E> node) {
        return null;
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

        private Node(E data, Node<E> next) {
            this.data = data;
            this.next = next;
        }

        private Node(E data) {
            this.data = data;
        }

        private E getData() {
            return data;
        }

        private Node<E> getNext() {
            return next;
        }
    }
}
