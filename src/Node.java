public class Node {
    Node head;
    int value;
    int pointNext;
    int size;

    //Node(){} constructor
    Node(){
        this.value = 0;
        this.pointNext = 0;
        this.size = 5;
    }
    //Setter Methods


    public void setValue(int value) {
        if (value < 0) {
            System.out.println("Value cannot be negative: try a positive value");
        }
        this.value = value;
    }

    public void setPointNext(int pointNext) {
        this.pointNext = pointNext;
    }

    public void setSize(int size) {
        if ( size < 0 ) {
            System.out.println("cannot set a negative size");
        }
        this.size = size;
    }

    //Getter Methods
    public Node getHead() {
        return head;
    }

    public int getValue(){
        return value;
    }

    public int getPointNext(){
        return pointNext;
    }

}
