package com.zs;

public class LinkedList <E>{
    private int size;
    private Node<E> first;

    public static void mian(String aaa){
        
    }

    private static  class Node<E>{
        E element;
        Node<E>next;
        public Node(E element, Node<E> next){
            this.element = element;
                    this.next = next;
        }
    }
}
