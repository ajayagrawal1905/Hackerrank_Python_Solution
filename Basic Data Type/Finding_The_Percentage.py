if __name__ == '__main__':
    n = int(input())
    student_marks = {}
    for _ in range(n):
        name, *line = input().split()
        scores = list(map(float, line))
        student_marks[name] = scores
    query_name = input()
    lst = []
    lst = (student_marks[query_name])
    temp = 0
    for ele in lst:
        temp = temp + ele
    avg = temp/3
print('%1.2f'%(avg))
