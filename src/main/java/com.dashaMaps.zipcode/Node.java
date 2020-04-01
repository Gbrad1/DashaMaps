package com.dashaMaps.zipcode;

public class Node {

    private String key;
    private Integer value;
    private Node nextNode;

    public Node(String newKey, Integer newValue, Node nextNode) {
        this.key = newKey;
        this.value = newValue;
        this.nextNode = nextNode;
    }

    public Node(String newKey, Integer newValue) {
        this.key = newKey;
        this.value = newValue;
        this.nextNode = null;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public Node getNextNode() {
        return nextNode;
    }

    public void setNextNode(Node nextNode) {
        this.nextNode = nextNode;
    }
}
