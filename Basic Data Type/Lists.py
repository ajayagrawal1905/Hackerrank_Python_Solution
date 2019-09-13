if __name__ == '__main__':
    N = int(input())
    a = []
    a1= []
    a2= []
    for i in range(N):
        tokens = input().split()
        str = tokens[0]
        if str == 'insert':
            a.insert(int(tokens[1]),int(tokens[2]))
        elif str == 'append':
            a.append(int(tokens[1]))
        elif str == 'remove':
            a.remove(int(tokens[1]))
        elif str == 'sort':
            a1 = a.sort()
        elif str == 'reverse':
            a2 = a.reverse()
        elif str == 'pop':
            a2 = a.pop()
        elif str == 'print':
            print(a)
        
