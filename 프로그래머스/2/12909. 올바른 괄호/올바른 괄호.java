import java.util.*;
import java.io.*;

class Solution {
    boolean solution(String s) {
        ArrayList<String> arr = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                arr.add("(");
            } else {
                if (arr.size() == 0) {
                    return false;
                }
                arr.remove(arr.size() - 1);
            }
        }

        if (arr.size() > 0) {
            return false;
        } else if (arr.size() == 0) {
            return true;
        }
        return false;
    }
}