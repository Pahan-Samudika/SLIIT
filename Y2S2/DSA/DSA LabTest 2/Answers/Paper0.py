M=int(input("Enter Number: "))
n=int(input("Enter No.of times: "))

def multiply(M,n):
    if(n==1):
        return M
    else:
        return (M+multiply(M,n-1))

while(M!=-1 and n!=-1):
    print("Answer: ",multiply(M,n))

    M=int(input("Enter Number: "))
    n=int(input("Enter No.of times: "))

print("Program Ended")
    

