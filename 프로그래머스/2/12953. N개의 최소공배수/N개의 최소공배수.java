class Solution {
    public int solution(int[] arr) {
        boolean check = true;
        for (int i = 2; i < 100000000; i++) {
            check = true;
            for (int num : arr) {
                if (i % num != 0) {
                    check = false;
                    break;
                }
            }
            if (check) {
                return i;
            }
        }
        return 0;
    }
}