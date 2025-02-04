class Solution {
    
    public static int binary(int num) {
        int count = 0;
        while (num / 2 != 0) {
            if (num % 2 == 1) {
                count++;
            }
            num /= 2;
        }
        if (num % 2 == 1) {
            count++;
        }
        return count;
    }
    
    public int solution(int n) {
        int count = binary(n);
        for (int i = n + 1; i < 1000000; i++) {
            if (count == binary(i)) {
                return i;
            }
        }
        return 1;
    }
}