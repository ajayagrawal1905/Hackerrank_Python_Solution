def average(array):
    s = set(array)
    temp = 0
    for i in s:
        temp+=i
    return temp/len(s)
    
if __name__ == '__main__':
    n = int(input())
    arr = list(map(int, input().split()))
    result = average(arr)
    print(result)