x=int(input("Enter Value for X: "))
n=int(input("Enter Value for n: "))

def power(base,exp):
    if (exp==0):
        return 1
    else:
        return base*power(base,exp-1)

while(x!=-1 and n!=-1):
    ans = power(x,n)

    print("Answer: ",ans)
    x=int(input("Enter Value for X: "))
    n=int(input("Enter Value for n: "))

print("Program Ended")
