import java.util.*;
import java.io.*;

class Solution
{
    public int solution(int n, double a, double b)
    {
        int answer = 1;

        while (n % 2 != 1) {
            if (Math.ceil(a / 2) == Math.ceil(b / 2)) {
                return answer;
            } else {
                a = Math.ceil(a / 2);
                b = Math.ceil(b / 2);
                answer++;
            }
        }
        return answer;
    }
}