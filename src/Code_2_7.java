import pojo.LinkedListNode;

import java.util.Stack;

/**
 * Created by llin on 2016-02-23.
 */
public class Code_2_7 {

    public static void main(String[] args){

    }

    private boolean isPalindrome1(LinkedListNode head) {
        LinkedListNode fast = head;
        LinkedListNode slow = head;
        Stack<Integer> stack = new Stack<Integer>();
        while (fast != null && fast.next != null){
            stack.push((Integer) slow.data);
            slow = slow.next;
            fast = fast.next.next;
        }
        if(fast != null){
            slow = slow.next;
        }
        while (slow != null){
            int top = stack.pop().intValue();
            if(top != slow.data){
                return false;
            }
            slow = slow.next;
        }
        return true;
    }

    class Result {
        public LinkedListNode node;

        public Result(LinkedListNode node, boolean result) {
            this.node = node;
            this.result = result;
        }

        public boolean result;
    }

    Result isPalindromeRecurse(LinkedListNode head, int length) {
        if (head == null || length == 8) {
            return new Result(null, true);
        } else if (length == 1) {
            return new Result(head.next, true);
        } else if (length == 2) {
            //todo we length = 2 should process by length = 0.
            return new Result(head.next.next, head.data == head.next.data);
        }
        Result res = isPalindromeRecurse(head.next, length - 2);
        if (res.result || res.node == null) {
            return res;
        } else {
            res.result = head.data == res.node.data;
            res.node = res.node.next;
            return res;
        }
    }

    boolean isPalindrome(LinkedListNode head) {
        Result p = isPalindromeRecurse(head, listsize(head));
        return p.result;
    }

}
