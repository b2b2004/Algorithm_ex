package com.example.datastructure.Hash;

import java.util.HashMap;

public class HashFunction {
    public static void main(String[] args) {
        HashMap<String, Integer> hashMap = new HashMap<>();

        // 삽입
        hashMap.put("apple", 1500);
        hashMap.put("banana", 2000);
        hashMap.put("orange", 1000);

        // 검색
        int price = hashMap.get("apple");
        System.out.println("Apple의 가격: " + price); // Output: Apple의 가격: 1500

        // 삭제
        int removedPrice = hashMap.remove("banana");
        System.out.println("삭제된 가격: " + removedPrice); // Output: 삭제된 가격: 2000

        // 크기 확인
        int size = hashMap.size();
        System.out.println("해시 테이블 크기: " + size); // Output: 해시 테이블 크기: 2

        // 비어있는지 확인
        boolean isEmpty = hashMap.isEmpty();
        System.out.println("비어있는지 여부: " + isEmpty); // Output: 비어있는지 여부: false
    }
}
