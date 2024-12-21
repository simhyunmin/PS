import java.util.*;

class Solution {
    public int solution(String before, String after) {
        int answer = 0;
        String[] arr1 = before.split("");
        String[] arr2 = after.split("");
        
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        
        answer = (Arrays.equals(arr1, arr2)) ? 1 : 0;
        
       
        return answer;
    }
}