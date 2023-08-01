package com.example.datastructure.List;

import java.util.Arrays;

public class MyArrayList<T> implements IList<T> {

    private int size;
    private T[] elements;

    public MyArrayList(){
        this.size = 0;
        this.elements = (T[]) new Object[50];
    }

    // 데이터 추가
    @Override
    public void add(T t){
        // 배열 늘리기
        if(this.size == this.elements.length){
            this.elements = Arrays.copyOf(this.elements, this.size * 2);
        }
        this.elements[this.size++] = t;
    }

    // 원하는 위치에 데이터 추가
    @Override
    public void insert(int index, T t){

        // 배열 늘리기
        if(this.size == this.elements.length){
            this.elements = Arrays.copyOf(this.elements, this.size * 2);
        }

        // 데이터 한칸씩 뒤로 밀어주기
        for(int i = index; i < this.size; i++){
            this.elements[i + 1] = this.elements[i];
        }
        this.elements[index] = t;
        this.size++;
    }

    // 모두 비우기
    @Override
    public void clear(){
        this.size = 0;
        this.elements = (T[]) new Object[50];
    }

    // 원하는 데이터 삭제
    @Override
    public boolean delete(T t){
        for(int i = 0; i < this.size; i++){
            if(this.elements[i].equals(t)){
                for(int j = i; j< this.size; j++){
                    this.elements[j] = this.elements[j + 1];
                }
                this.size--;
                return true;
            }
        }
        return false;
    }

    // 원하는 위치의 데이터 삭제하기
    @Override
    public boolean deleteByIndex(int index){
        // 인덱스가 잘못 들어왔을때 처리
        if(index < 0 || index > this.size - 1){
            return false;
        }
        for(int i = index; i < this.size - 1; i++){
            this.elements[i] = this.elements[i+1];
        }
        this.size--;
        return true;
    }

    // 값 가져오기
    @Override
    public T get(int index){
        // 인덱스가 잘못 들어왔을때 처리
        if(index < 0 || index > this.size - 1){
            throw new IndexOutOfBoundsException();
        }
        return this.elements[index];
    }

    // index 값 가져오기
    @Override
    public int indexOf(T t){
        for(int i = 0; i < this.size; i++){
            if(this.elements[i].equals(t)){
                return i;
            }
        }
        return -1;
    }

    // 데이터가 있나 없나 확인
    @Override
    public boolean isEmpty(){
        return this.size == 0;
    }

    // 값을 가지고 있나 확인
    @Override
    public boolean contains(T t){
        for(int i = 0; i < this.size; i++){
            if(this.elements[i].equals(t)){
                return true;
            }
        }
        return false;
    }

    // 사이즈 반환
    @Override
    public int size(){
        return this.size;
    }

}
