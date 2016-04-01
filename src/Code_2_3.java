import pojo.LinkedListNode;

/**
 * Created by llin on 2016-02-23.
 */
public class Code_2_3 {

    public static void main(String[] args){

    }

    public static boolean deleteNode(LinkedListNode n) {
        if(n == null || n.next == null) return false;
        LinkedListNode p = n.next;
        n.data = p.data;
        n.next = p.next;
        return true;
    }

}
