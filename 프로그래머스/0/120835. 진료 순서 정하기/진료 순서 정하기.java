import java.util.*;
import java.io.*;

class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        Integer[] integerArray = Arrays.stream(emergency)
                                        .boxed() 
                                        .toArray(Integer[]::new);
        
        Integer[] orgArr = integerArray;
        Arrays.sort(integerArray, Collections.reverseOrder());
        
        int size = integerArray.length;
        int count = 0;
        
        for(int orgNum : emergency) {
            for(int i = 0 ; i < size ; i++) {
                if(orgNum == (int)integerArray[i]) {
                    answer[count] = i + 1;
                    count++;
                }
            }
        }
        return answer;
    }
}