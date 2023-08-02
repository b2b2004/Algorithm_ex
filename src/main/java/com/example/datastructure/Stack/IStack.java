package com.example.datastructure.Stack;

public interface IStack<T> {
    void push(T data);
    T pop();
    T peek();
    int size();
}
