package com.example.datastructure.Tree;

import java.util.ArrayList;
import java.util.List;

public class BinarySearchTree<T extends Comparable<T>> implements ITree<T> {

    private Node root;
    private int size;

    public BinarySearchTree() {
        this.size = 0;
    }

    @Override
    public void insert(T val) {
        this.root = insertNode(root, val);
        size++;
    }

    @Override
    public void delete(T val) {
        deleteNode(root, val);
    }

    private Node deleteNode(Node node, T val) {
        if (node == null) {
            return null;
        }

        if (val.compareTo(node.data) < 0) {
            node.left = deleteNode(node.left, val);
        } else if (val.compareTo(node.data) > 0) {
            node.right = deleteNode(node.right, val);
        } else {
            this.size--;
            if (node.left == null) {
                return node.right;
            } else if (node.right == null) {
                return node.left;
            }
            node.data = minNode(node.right);
            node.right = deleteNode(node.right, node.data);
        }
        return node;
    }

    public T min() {
        return this.minNode(this.root);
    }

    public T max() {
        return this.maxNode(this.root);
    }

    private T minNode(Node node) {
        T minData = node.data;
        while (node.left != null) {
            minData = node.left.data;
            node = node.left;
        }
        return minData;
    }

    private T maxNode(Node node) {
        T maxData = node.data;
        while (node.right != null) {
            maxData = node.right.data;
            node = node.right;
        }
        return maxData;
    }

    private Node insertNode(Node node, T val) {
        if (node == null) {
            return new Node(val);
        }
        // a.compareTo(b) 는 a 가 b 보다 작으면 -1 을 리턴
        // 동일할 때 0 , b 가 더 크면 1을 리턴
        if (val.compareTo(node.data) < 0) {
            // 추가될 값이 노드의 데이터 보다 작은 경우 노드의 왼쪽에 위치 해야 함
            node.left = insertNode(node.left, val);
        } else if (val.compareTo(node.data) > 0) {
            // 추가될 값이 노드의 데이터 보다 큰 경우 노드의 오른쪽 위치 해야 함
            node.right = insertNode(node.right, val);
        }

        return node;
    }

    @Override
    public boolean contains(T val) {
        return containsNode(root, val);
    }

    @Override
    public int size() {
        return this.size;
    }

    private boolean containsNode(Node node, T val) {
        if (node == null) {
            return false;
        }

        // a.compareTo(b)
        // a < b   --> return -1
        // a == b  --> return 0
        // a > b   --> return 1

        if (val.compareTo(node.data) == 0) {
            return true;
        }

        if (val.compareTo(node.data) < 0) {
            return containsNode(node.left, val);
        }

        return containsNode(node.right, val);
    }

    public List<T> preOrder() {
        return preOrderTree(root, new ArrayList<>());
    }

    private List<T> preOrderTree(Node node, List<T> visited) {
        if (node == null) return visited;

        visited.add(node.data);
        preOrderTree(node.left, visited);
        preOrderTree(node.right, visited);

        return visited;
    }

    public List<T> inOrder() {
        return inOrderTree(root, new ArrayList<>());
    }

    private List<T> inOrderTree(Node node, List<T> visited) {
        if (node == null) return visited;

        inOrderTree(node.left, visited);
        visited.add(node.data);
        inOrderTree(node.right, visited);

        return visited;
    }

    public List<T> postOrder() {
        return postOrderTree(root, new ArrayList<>());
    }

    private List<T> postOrderTree(Node node, List<T> visited) {
        if (node == null) return visited;

        postOrderTree(node.left, visited);
        postOrderTree(node.right, visited);
        visited.add(node.data);

        return visited;
    }

    private class Node {
        T data;
        Node left;
        Node right;

        Node(T data) {
            this.data = data;
        }

        Node(T data, Node left, Node right) {
            this.data = data;
            this.left = left;
            this.right = right;
        }
    }

    public static void main(String[] args) {
        // 이진 검색 트리 생성
        BinarySearchTree<Integer> bst = new BinarySearchTree<>();

        // 값 삽입
        bst.insert(50);
        bst.insert(30);
        bst.insert(70);
        bst.insert(20);
        bst.insert(40);
        bst.insert(60);
        bst.insert(80);

        // 트리의 전위 순회 결과 출력
        List<Integer> preOrderResult = bst.preOrder();
        System.out.println("전위 순회 결과: " + preOrderResult);

        // 트리의 중위 순회 결과 출력
        List<Integer> inOrderResult = bst.inOrder();
        System.out.println("중위 순회 결과: " + inOrderResult);

        // 트리의 후위 순회 결과 출력
        List<Integer> postOrderResult = bst.postOrder();
        System.out.println("후위 순회 결과: " + postOrderResult);

        // 최소값과 최대값 출력
        System.out.println("최소값: " + bst.min());
        System.out.println("최대값: " + bst.max());

        // 값 찾기
        int targetValue = 40;
        if (bst.contains(targetValue)) {
            System.out.println(targetValue + "는 트리에 존재합니다.");
        } else {
            System.out.println(targetValue + "는 트리에 존재하지 않습니다.");
        }

        // 값 삭제
        int valueToDelete = 30;
        bst.delete(valueToDelete);
        System.out.println(valueToDelete + "를 삭제한 후 중위 순회 결과: " + bst.inOrder());
    }

}
