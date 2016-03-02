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

}
