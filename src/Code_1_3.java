import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;

/**
 * Created by llin on 2016-02-23.
 */
public class Code_1_3 {

    public static void main(String[] args){
        System.out.println(run("god", "dog"));
        System.out.println(run2("god", "dog"));
        System.out.println(run("god", "dogd"));
        System.out.println(run2("god", "dogd"));
    }

    public static boolean run(String s1, String s2){
        if(s1.length() != s2.length()) return false;
        return sort(s1).equals(sort(s2));
    }

    public static boolean run2(String s1, String s2){
        if(s1.length() != s2.length()) return false;
        int[] set = new int[256];
        for(int i = 0; i < s1.length(); i++){
            set[s1.charAt(i)]++;
        }

        for(int i = 0; i < s2.length(); i++){
            int count = set[s2.charAt(i)]--;
            if(count < 0) return false;
        }
        return true;
    }

    public static String sort(String s){
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }

}
