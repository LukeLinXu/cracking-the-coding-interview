/**
 * Created by llin on 2016-02-23.
 */
public class Code_1_1 {

    public static void main(String[] args){
        System.out.println(isUniqueChars2("nima"));
        System.out.println(isUniqueChars("nima"));
    }

    public static boolean isUniqueChars2(String str){
        if (str.length() > 256) return false;
        boolean[] char_set = new boolean[256];
        for(int i = 0; i < str.length(); i++){
            int val = str.charAt(i);
            if(char_set[val]){
                return false;
            }
            char_set[val] = true;
        }
        return true;
    }

    public static boolean isUniqueChars(String str){
        int checker = 0;
        for (int i = 0 ; i < str.length(); i++){
            int temp = str.charAt(i);
            if ((checker & 1 << temp) > 0) return false;
            checker |= 1 << temp;
        }
        return true;
    }
}
