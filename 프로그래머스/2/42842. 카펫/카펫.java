import java.util.*;
import java.io.*;

class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        //i는 세로
        //width는 가로
        for (int i = 3; i < brown + yellow; i++) {
            int width = (brown + yellow) / i;
            if (width >= i) {
                if ((i - 2) * (width - 2) == yellow) {
                    answer[0] = width;
                    answer[1] = i;
                    break;
                }
            }
        }
        return answer;
    }
}