def algo(n):
    if n==1:
        return 1
    else:
        return algo(n-1)+(n-1)

n=int(input("Enter number: "))

while(n!=-1):
    print("Output: ",algo(n))

    n=int(input("Enter number: "))

print("Output: Finished")

