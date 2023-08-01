package com.example.datastructure.List;

public class MyLinkedList<T> implements IList<T>{

    private int size;
    private Node head;

    public MyLinkedList(){
        this.size = 0;
        this.head = new Node(null); // 더미 헤더 노드
    }

    @Override
    public void add(T t) {
        Node curr = this.head;

        // 헤드부터 curr Next가 null이 아닐때 까지
        while(curr.next != null){
            curr = curr.next;
        }

        // 노드 생성 후 마지막에 추가
        Node node = new Node(t);
        curr.next = node;
        this.size++;
    }

    @Override
    public void insert(int index, T t) {
        if(index > this.size || index < 0){
            throw new IndexOutOfBoundsException();
        }

        Node prev = this.head;
        Node curr = prev.next;

        int i = 0;
        while(i++ < index){
            prev = prev.next;
            curr = curr.next;
        }

        Node node = new Node(t, curr);
        prev.next = node;
        this.size++;

    }

    @Override
    public void clear() {
        this.size = 0;
        this.head.next = null;
    }

    @Override
    public boolean delete(T t) {
        Node prev = this.head;
        Node curr = prev.next;

        while(curr != null){
            if(curr.data.equals(t)){
                prev.next = curr.next;
                curr.next = null;
                this.size--;
                return true;
            }
            prev = prev.next;
            curr = curr.next;
        }

        return false;
    }

    @Override
    public boolean deleteByIndex(int index) {
        if(index >= this.size || index < 0){
            throw new IndexOutOfBoundsException();
        }

        Node prev = this.head;
        Node curr = prev.next;

        int i = 0;
        while(i++ < index){
            prev = prev.next;
            curr = curr.next;
        }

        prev.next = curr.next;
        curr.next = null;
        this.size--;
        return true;

    }

    @Override
    public T get(int index) {
        if(index >= this.size || index < 0){
            throw new IndexOutOfBoundsException();
        }

        Node curr = this.head.next;
        int i = 0;
        while(i++ < index){
            curr = curr.next;
        }
        return curr.data;
    }

    @Override
    public int indexOf(T t) {
        Node curr = this.head.next;
        int index = 0;

        while(curr != null){
            if(t.equals(curr.data)){
                return index;
            }
            curr = curr.next;
            index++;
        }
        return -1;
    }

    @Override
    public boolean isEmpty() {
        return this.head.next == null;
    }

    @Override
    public boolean contains(T t) {
        Node curr = this.head.next;
        while(curr != null){
            if(t.equals(curr.data)){
                return true;
            }
            curr = curr.next;
        }
        return false;
    }

    @Override
    public int size() {
        return this.size;
    }

    // LinkedList는 노드 기반이기 때문에
    private class Node{
        T data;
        Node next;

        Node(T data){
            this.data = data;
        }

        Node(T data, Node next){
            this.data = data;
            this.next = next;
        }
    }

}
