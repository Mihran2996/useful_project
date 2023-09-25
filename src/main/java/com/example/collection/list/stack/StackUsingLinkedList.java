package com.example.collection.list.stack;

public class StackUsingLinkedList <T> {

    public static void main(String[] args) {

        //If Stack use as LinkedList

        StackUsingLinkedList stack = new StackUsingLinkedList();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack);
        System.out.println(stack.peek());
        System.out.println(stack);
        System.out.println(stack.pop());
        System.out.println(stack);
        System.out.println(stack.pop());
        System.out.println(stack);
        System.out.println(stack.pop());
        System.out.println(stack);

    }

    private Node top;

    public StackUsingLinkedList(){
        this.top = null;
    }

    public void push(T value){
        Node<T> node = new Node<T>();
        node.setValue(value);
        node.setNode(top);
        this.top = node;
    }

    public T peek(){
        return (T) top.getValue();
    }
    public T pop(){
        T value = (T)top.getValue();
        this.top = top.link;
        return value;
    }


    public Node getNode() {
        return top;
    }

    public void setNode(Node node) {
        this.top = node;
    }

    @Override
    public String toString() {
        return "StackUsingLinkedList{" +
                "top=" + top +
                '}';
    }

    private static class Node<T>{
        private T value;
        private Node link;

        public T getValue() {
            return value;
        }

        public Node getNode() {
            return link;
        }

        public void setNode(Node node) {
            this.link = node;
        }

        public void setValue(T value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "value=" + value +
                    ", link=" + link +
                    '}';
        }
    }

}
