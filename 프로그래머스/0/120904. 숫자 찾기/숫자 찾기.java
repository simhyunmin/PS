class Solution {
    public int solution(int num, int k) {
        String numstr = Integer.toString(num);
        char ch = (char)('0' + k);
        if (numstr.indexOf(ch) == -1) {
            return -1;
        } else {
            return numstr.indexOf(ch) + 1;   
        }
    }
}