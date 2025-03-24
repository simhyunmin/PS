import java.util.*;

class Solution {
     static Set<Integer> numberSet = new HashSet<>();
    //Set
    //Collection 인터페이스를 상속받은 자료구조
    //중복 허용 x
    //HashSet
    //요소를 추가할 때 해시값을 이용해 저장 위치를 결정하므로, 검색 속도가 빠르다
    public static void mixSet(String prefix, String remaining) {
        if (!prefix.equals("")) {
            numberSet.add(Integer.parseInt(prefix));
        }


        for (int i = 0; i < remaining.length(); i++) {
            mixSet(
                    prefix + remaining.charAt(i),
                    remaining.substring(0, i) + remaining.substring(i + 1)
            );
        }
    }

    public static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }

        if (n == 2) {
            return true;
        }

        if (n % 2 == 0) {
            return false;
        }

        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
    public int solution(String numbers) {
        mixSet("", numbers);

        int count = 0;
        for (int num : numberSet) {
            if (isPrime(num)) {
                count++;
            }
        }
        return count;
    }
}