class Solution {
    public String solution(int age) {
         StringBuilder answer = new StringBuilder();
        char[] CharArr = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j'};
        while(age != 0) {
             int digit = age % 10; 
            answer.insert(0, CharArr[digit]);
            age /= 10;
        }
        return answer.toString();
    }
}