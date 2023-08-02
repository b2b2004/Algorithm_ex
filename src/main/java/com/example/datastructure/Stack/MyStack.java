package com.example.datastructure.Stack;

import com.example.datastructure.List.MyLinkedList;

public class MyStack<T> implements IStack<T>{

    private int size;
    private Node head;

    public MyStack() {
        this.size = size();
        this.head = new Node(null);
    }

    @Override
    public void push(T data) {
        Node node = new Node(data, this.head.next);
        this.head.next = node;
        this.size++;
    }

    // 하나 가져오기
    @Override
    public T pop() {
        if(this.isEmpty()){
            return null;
        }
        Node curr = this.head.next;
        this.head.next = curr.next;
        curr.next = null;
        this.size--;
        return curr.data;
    }

    // 데이터 확인
    @Override
    public T peek() {
        if(this.isEmpty()){
            return null;
        }
        return this.head.next.data;
    }

    private boolean isEmpty() {
        return this.head.next == null;
    }

    @Override
    public int size() {
        return this.size;
    }

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
