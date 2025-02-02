import java.util.*;
class Solution {
    public String solution(String s) {

        s = s.toLowerCase();

        StringBuffer sb = new StringBuffer();

        for(int i=0;i<s.length();i++){

            String c = String.valueOf(s.charAt(i));

            if(i==0){
               c = c.toUpperCase();
            }

            else if(s.charAt(i-1)==' '){
                c = c.toUpperCase();
            }

            sb.append(c);
        }

        return sb.toString();
    }
}