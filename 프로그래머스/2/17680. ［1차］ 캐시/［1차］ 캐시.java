import java.util.LinkedList;
import java.util.List;

class Solution {
    public int solution(int cacheSize, String[] cities) {
        return problem(cacheSize, cities);
    }
    public static int problem(int cacheSize, String[] cities) {
        int answer = 0;

        //캐시 크기가 0일 때
        if (cacheSize == 0) {
            return cities.length * 5;
        }

        List<String> caches = new LinkedList<>();
        for (int i = 0; i < cities.length; i++) {
            String city = cities[i].toLowerCase();
            //cache miss
            if (!caches.contains(city)) {
                answer += 5;
                if (caches.size() >= cacheSize) {
                    caches.remove(0);
                }
                caches.add(city);
                continue;
            }

            if (caches.contains(city)) {
                caches.remove(city);
                caches.add(city);
                answer += 1;
            }
        }
        return answer;
    }
}