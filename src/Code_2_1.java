import pojo.LinkedListNode;

import java.util.Hashtable;
import java.util.LinkedList;

/**
 * Created by llin on 2016-02-23.
 */
public class Code_2_1 {

    public static void main(String[] args){

    }

    public static void deleteDups(LinkedListNode n){
        Hashtable hashtable = new Hashtable();
        LinkedListNode previous = null;
        while(n != null){
            if(hashtable.containsKey(n.data)){
                previous.next = n.next;
            }else {
                hashtable.put(n.data, true);
                previous = n;
            }
            n = n.next;
        }
    }

    public static void deleteDupsNoBuffer(LinkedListNode n){
        if (n == null) return;
        while(n != null){
            LinkedListNode runner = n;
            while (runner.next != null){
                if(runner.next.data == n.data){
                    runner.next = runner.next.next;
                }else {
                    runner = runner.next;
                }
            }
            n = n.next;
        }

//        if (n == null) return;
//        LinkedListNode runner = n;
//        while(true) {
//            while (true) {
//                if (n.data == runner.next.data) {
//                    runner.next = runner.next.next;
//                    //remove this node
//                    break;
//                } else {
//                    if (runner.next == null) {
//                        n = n.next;
//                        runner = n;
//                        break;
//                    } else {
//                        runner = runner.next;
//                    }
//                }
//            }
//            if(n.next == null) break;
//        }
    }

}
