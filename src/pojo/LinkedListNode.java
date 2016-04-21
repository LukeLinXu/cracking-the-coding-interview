package pojo;

/**
 * Created by llin on 02/03/2016.
 */
public class LinkedListNode {
    public Object data;
    public LinkedListNode next;
    public LinkedListNode previous;

    public LinkedListNode(Object data, LinkedListNode next, LinkedListNode previous) {
        this.data = data;
        this.next = next;
        this.previous = previous;
    }

}
