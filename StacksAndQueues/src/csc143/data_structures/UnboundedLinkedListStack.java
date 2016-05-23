package csc143.data_structures;

import java.util.LinkedList;

/**
 * Created by baumelbi.
 */
public class UnboundedLinkedListStack implements UnboundedStack {

    private Node head;
    private int counter;

    public UnboundedLinkedListStack() {
        head = null;
        counter = 0;

    }

    /**
     * This method takes in an object and adds it to the stack
     *
     * @param o the object to be added to the stack
     */
    @Override
    public void push(Object o) {
        if(head == null){
            head = new Node(o);
        }
    }

    /**
     * This method removes an object from the stack
     *
     * @return the object that was removed
     * @throws Underempty exception for an empty queue
     */
    @Override
    public Object pop() throws Underempty {
        return null;
    }

    /**
     * This method is a boolean to show if the method is NOT empty
     *
     * @return true or false whether istack is not empty
     */
    @Override
    public boolean isNotEmpty() {
        return head != null && counter != 0;
    }

    /**
     * This method will give you the size of the stack
     * meaning how many items are currently in it
     *
     * @return the int value of the items in the stack
     */
    @Override
    public int size() {
        return counter;
    }

    /**
     * This method will give a string representation of the stack
     *
     * @return the string version of the stack
     */
    @Override
    public String toString() {
        String temp;

        if (size() == 0) {
            temp = String.format("[ %s : ", size());
//        } else {
//            temp = String.format("[ %s : ", size());
//            for (int i = 0; i < size(); i++) {
//                if (i+1 >= size()) {
//                    temp += ubLinkedList[i] + " ";
//                } else {
//                    temp += ubLinkedList[i] + ", ";
//                }
//            }
//        }
//        temp += "]";
        return temp;
    }

    class Node{

        Node next;
        Object value;

        public Node(Object o) {
            next = null;
            value = o;
        }

        public Node(Object o, Node nextValue){
            next = nextValue;
            value = o;
        }

        public Object getValue(){
            return value;
        }

        public void setValue(Object o){
            value = o;
        }

        public Node getNext(){
            return next;
        }

        public void setNext(Node nextValue){
            next = nextValue;
        }
    }
}
