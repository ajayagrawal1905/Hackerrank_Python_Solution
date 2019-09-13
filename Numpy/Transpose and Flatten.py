import numpy as np
lst = []
(R,C) = tuple(map(int, input().split()))
for i in range(R):  
    
    for j in range(1):
        a = map(int, input().split())
        lst.append(list(a))  
        
print(np.transpose(lst))
lst = np.array(lst)
print(lst.flatten())
  



