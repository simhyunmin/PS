import java.util.*;
import java.io.*;

class Solution {
    public int solution(int[] people, int limit) {
        Arrays.sort(people);
        int answer = 0;
        int left = 0;
        int right = people.length - 1;

        while (left <= right) {
            if (left < right && people[left] + people[right] <= limit) {
                left++;
                right--;
            }

            else {
                right--;
            }
            answer++;
        }

        return answer;
    }
}