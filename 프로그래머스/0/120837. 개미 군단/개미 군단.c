#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

int solution(int hp) {
    int answer = 0;
    //5, 3, 1
    if(hp >= 5){
        answer += hp / 5;
        hp  %= 5;
    }
    if(hp >= 3){
        answer += hp / 3;
        hp %= 3;
    }
    if(hp >= 1){
        answer += hp;
    }
    return answer;
}