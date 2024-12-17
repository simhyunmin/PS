def solution(num, k):
    num = str(num);
    if (num.find(str(k)) == -1):
        return -1
    else:
        return num.find(str(k)) + 1