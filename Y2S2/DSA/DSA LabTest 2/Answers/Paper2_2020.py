def algo(n):
    if n<=1:
        return n
    else:
        return algo(n-1)+algo(n-2)

n=int(input("Enter number: "))

while(n!=-1):
    print("Output: ",algo(n-1))

    n=int(input("Enter number: "))

print("Output: Finished")
