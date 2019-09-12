if __name__ == '__main__':
    lst = []
    lst2 = []
    for _ in range(int(input())):
        name = input()
        score = float(input())
        lst.append([name , score])
for i in range(len(lst)):
    lst1 = []
    if i>0:
        break
    for row in lst:
        lst1.append(row[i+1])
        
    sh = (sorted(list(set(lst1)))[1])   
             
for i in range(len(lst)-1,-1,-1):
    if sh == lst[i][1]:
        lst2.append(lst[i][0])
    lst2.sort()
for ele in lst2:
    print(ele)

