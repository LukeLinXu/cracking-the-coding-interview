/**
 * Created by llin on 2016-02-23.
 */
public class Code_1_5 {

    public static void main(String[] args){
        String test1 = "";
        String test2 = "abc";
        String test3 = "aabbcc";
        String test4 = "abababbbbbbbbbbbbbbbbbbb";
        System.out.println(getShorterString(test1));
        System.out.println(getShorterString(test2));
        System.out.println(getShorterString(test3));
        System.out.println(getShorterString(test4));

        System.out.println(getShorterString1(test1));
        System.out.println(getShorterString1(test2));
        System.out.println(getShorterString1(test3));
        System.out.println(getShorterString1(test4));
    }

    public static String getShorterString(String s){
        if(s.length() <= getShorterVersionLength(s)) return s;

        StringBuffer stringBuffer = new StringBuffer();
        char c = s.charAt(0);
        int count = 1;
        for(int i = 1; i < s.length(); i++){
            if(s.charAt(i) == c){
                count ++;
            }else {
                stringBuffer.append(c);
                stringBuffer.append(count);
                c = s.charAt(i);
                count = 1;
            }
        }
        stringBuffer.append(c);
        stringBuffer.append(count);
        return stringBuffer.toString();
    }

    public static String getShorterString1(String s){
        int length = getShorterVersionLength(s);
        if(s.length() <= length) return s;

        char[] chars = new char[length];
        char c = s.charAt(0);
        int count = 1;
        int sum = -1;
        for(int i = 1; i < s.length(); i++){
            if(s.charAt(i) == c){
                count ++;
            }else {
                sum++;
                chars[sum] = c;
                char[] chars1 = String.valueOf(count).toCharArray();
                for(int j = 0; j < chars1.length; j ++){
                    sum++;
                    chars[sum] = chars1[j];
                }
                c = s.charAt(i);
                count = 1;
            }
        }
        sum++;
        chars[sum] = c;
        char[] chars1 = String.valueOf(count).toCharArray();
        for(int j = 0; j < chars1.length; j ++){
            chars[sum + 1] = chars1[j];
            sum++;
        }
        return new String(chars);
    }

    public static int getShorterVersionLength(String str){
        if(str.isEmpty()) return 0;
        char c = str.charAt(0);
        int count = 1;
        int sum = 0;
        for(int i = 1; i < str.length(); i++){
            if(str.charAt(i) == c){
                count++;
            }else {
                c = str.charAt(i);
                sum += 1 + String.valueOf(count).length();
                count = 1;
            }
        }
        sum += 1 + String.valueOf(count).length();
        return sum;
    }

}
