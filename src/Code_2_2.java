import pojo.LinkedListNode;

/**
 * Created by llin on 2016-02-23.
 */
public class Code_2_2 {

    public static void main(String[] args){

    }

    LinkedListNode nthToLast(LinkedListNode head, int k) {
        if(head == null) return null;
        LinkedListNode p1 = head;
        LinkedListNode p2 = head;
        for(int i = 0; i < k; i++){
            if(p1.next != null){
                p1 = p1.next;
            }else {
                return null;
            }
        }
        if(p1 == null) return null;
        while (p1.next != null){
            p1 = p1.next;
            p2 = p2.next;
        }
        return p2;
    }
}
