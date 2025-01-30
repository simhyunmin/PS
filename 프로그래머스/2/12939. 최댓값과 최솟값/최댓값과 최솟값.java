import java.util.*;
import java.io.*;

class Solution {
    public String solution(String s) {
        StringTokenizer st = new StringTokenizer(s);
        ArrayList<Integer> arr = new ArrayList<>();
        while (st.hasMoreTokens()) {
            arr.add(Integer.parseInt(st.nextToken()));
        }

        String min = String.valueOf(Collections.min(arr));
        String max = String.valueOf(Collections.max(arr));

       return min + " " + max;
    }
}