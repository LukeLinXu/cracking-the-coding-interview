import pojo.LinkedListNode;

/**
 * Created by llin on 2016-02-23.
 */
public class Code_2_5 {

    public static void main(String[] args){
        //todo: follow up
    }

    LinkedListNode addLists(LinkedListNode l1, LinkedListNode l2, int carry) {
        if(l1 == null && l2 == null && carry == 0) return null;
        LinkedListNode result = new LinkedListNode(carry, null, null);
        int value = carry;
        if(l1 != null){
            value += (int)l1.data;
        }
        if(l2 != null){
            value += (int)l2.data;
        }
        result.data = value%10;
        if(l1 != null || l2 != null){
            LinkedListNode more = addLists(l1 == null ? null : l1, l2 == null ? null : l2, (int)result.data >= 10 ? 1 : 0);
            result.next = more;
        }
        return result;
    }



}
