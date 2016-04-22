import pojo.LinkedListNode;

/**
 * Created by llin on 2016-02-23.
 */
public class Code_2_6 {

    public static void main(String[] args){

    }

    LinkedListNode FindBeginning(LinkedListNode head) {
        if (head == null) return null;
        LinkedListNode fastRunner = head;
        LinkedListNode slowRunner = head;
        int i = 0;
        do{
            i++;
            fastRunner = head.next.next;
            slowRunner = head.next;
        }while (fastRunner.data != slowRunner.data);

        int j = 0;
        do{
            j++;
            fastRunner = head.next.next;
            slowRunner = head.next;
        }while (fastRunner.data != slowRunner.data);

        LinkedListNode finalRunner = head;
        int k = Math.abs(i - j);
        while (k > 0){
            k --;
            if(i > j){
                finalRunner = finalRunner.next;
            }else {
                slowRunner =slowRunner.next;
            }
        }
        while (finalRunner != slowRunner){
            finalRunner = finalRunner.next;
            slowRunner = slowRunner.next;
        }
        return fastRunner;
    }

    LinkedListNode FindBeginningOfficial(LinkedListNode head) {
        if (head == null) return null;
        LinkedListNode fastRunner = head;
        LinkedListNode slowRunner = head;
        while (true){
            if(fastRunner.next == null || fastRunner.next.next == null) return null;
            fastRunner = fastRunner.next.next;
            slowRunner = slowRunner.next;
            if(fastRunner == slowRunner) break;
        }
        fastRunner = head;
        while (true){
            fastRunner = fastRunner.next;
            slowRunner = slowRunner.next;
            if(fastRunner == slowRunner) break;
        }
        return fastRunner;
    }

}
