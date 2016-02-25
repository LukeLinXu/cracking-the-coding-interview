/**
 * Created by llin on 2016-02-23.
 */
public class Code_1_8 {

    public static void main(String[] args){
        System.out.println(isRotation("waterbottle", "bottlewater"));
        System.out.println(isRotation("waterbottlewater", "bottlewater"));
    }

    public static boolean isSubstring(String s1, String s2){
        return s1.contains(s2);
    }

    public static boolean isRotation(String s1, String s2){
        if(s1.length() == s2.length() && !s1.isEmpty()){
            return isSubstring(s1+s1, s2);
        }
        return false;
    }

}
