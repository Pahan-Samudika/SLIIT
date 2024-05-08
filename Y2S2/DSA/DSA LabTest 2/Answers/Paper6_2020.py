n=int(input("Enter Value for n: "))

def algorithm_S(n):
    if n==1:
        return 1
    else:
        return algorithm_S(n-1)+n*n*n

while(n!=-1):
    ans = algorithm_S(n)

    print("Answer: ",ans)
    n=int(input("Enter Value for n: "))
