class Solution {
    public int[] solution(String s) {
        int[] answer = {0, 0};

        while (true) {
            String str = "";
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '1') {
                    str += "1";
                }
                else if(s.charAt(i) == '0') {
                    answer[1]++;
                }
            }
            int len = str.length();
            String binaryString = "";
            while (len / 2 != 0) {
                binaryString += String.valueOf(len % 2);
                len /= 2;
            }
            binaryString += String.valueOf(len % 2);
            s = new StringBuilder(binaryString).reverse().toString();
            answer[0]++;

            if (s.equals("1")) {
                break;
            }
        }
        return answer;
    }
}