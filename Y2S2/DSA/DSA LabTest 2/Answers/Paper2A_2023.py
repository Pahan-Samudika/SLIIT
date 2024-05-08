Marks=[]
n = int(input("Enter no.of Students: "))
for i in range(n):
    element=int(input("Enter Marks of Student %d: " %(i+1)))
    Marks.append(element)

print("Entered Marks: ",Marks)

def range1(A):
    return max(A)-min(A)

def median(A):
    n=len(A)

    if(n%2==0):
        return (A[n//2]+A[n//2-1])//2
    else:
        return A[n//2]

    
    mid=(min_val+max_val)//2

    return A[mid]

def insertionSort(A):
    for j in range(1,len(A)):
        key=A[j]
        i=j-1
        while i>=0 and A[i]>key:
            A[i+1]=A[i]
            i=i-1
        A[i+1]=key

def selectionSort(A):
    n=len(A)
    for j in range(0,n):
        smallest=j
        for i in range(j+1,n):
            if A[i]<A[smallest]:
                smallest=i
            A[j],A[smallest]=A[smallest],A[j]

selectionSort(Marks)

x=len(Marks)

print("Sorted Marks: ",Marks)
print("Median: ",median(Marks))
print("Range: ",range1(Marks))
