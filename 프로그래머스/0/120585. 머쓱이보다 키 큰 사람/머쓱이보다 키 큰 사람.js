function solution(array, height) {
    let count = 0;
    array.forEach((el) => {
        
        if(el > height){
            count++;
        }
    });
    return count;
}