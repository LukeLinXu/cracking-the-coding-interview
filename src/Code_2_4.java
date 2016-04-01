import pojo.LinkedListNode;

/**
 * Created by llin on 2016-02-23.
 */
public class Code_2_4 {

    public static void main(String[] args){

    }

    public LinkedListNode partition(LinkedListNode node, int x) {
        LinkedListNode beforeStart = null;
        LinkedListNode beforeEnd = null;
        LinkedListNode afterStart = null;
        LinkedListNode afterEnd = null;
        if(node == null) return null;
        while (node != null){
            if(((int) node.data) > x){
                if(beforeStart == null){
                    beforeStart = node;
                    beforeEnd = beforeStart;
                }else {
                    beforeEnd.next = node;
                    beforeEnd = node;
                }
            }else {
                if(afterStart == null){
                    afterStart = node;
                    afterEnd = afterStart;
                }else {
                    afterEnd.next = node;
                    afterEnd = node;
                }
            }
            node = node.next;
        }
        if(beforeStart == null) return afterStart;
        if(afterStart == null) return beforeStart;
        beforeEnd.next = afterStart;
        return beforeStart;
    }
}
