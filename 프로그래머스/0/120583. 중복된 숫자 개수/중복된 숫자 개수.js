function solution(array, n) {
    var answer = 0;

    answer = array.reduce((cnt, element) => cnt + (n === element), 0);
    return answer;
}