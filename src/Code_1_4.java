/**
 * Created by llin on 2016-02-23.
 */
public class Code_1_4 {

    public static void main(String[] args){

    }

    public static String replaceAllSpace(char[] chars, int length){
        int count = 0;
        for(char c : chars){
            if(c == ' '){
                count++;
            }
        }
        int afterlength = length + count * 2;
        for(int i = length - 1; i > -1; i --){
            if(chars[i] == ' '){
                chars[afterlength - 1] = '0';
                chars[afterlength - 2] = '2';
                chars[afterlength - 3] = '%';
                afterlength = afterlength -3;
            }else {
                chars[afterlength - 1] = chars[i];
                afterlength --;
            }
        }
        return new String(chars);
    }

}
