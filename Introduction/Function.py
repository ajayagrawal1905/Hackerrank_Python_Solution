def is_leap(year):
    leap = False
    
    if(year%4==0):
        if(year%400==00):
            return True
        elif(year%100!=0):
            return True
        else:
            return leap
    else:
        return leap
year = int(input())
print(is_leap(year))