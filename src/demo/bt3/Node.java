package demo.bt3;

public class Node {
    private int data;
    Node link;

    public Node(int data) {
        this.data = data;
        this.link = null;
    }
    public int getData() {
        return this.data;
    }
}
