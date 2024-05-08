A=[7,4,8,2,6,3,9,1,5]

def partition(A,low,high):
    pivot=A[high]
    i=low-1
    for j in range(low,high):
        if A[j]<=pivot:
            i=i+1
            A[i],A[j]=A[j],A[i]
    A[i+1],A[high]=A[high],A[i+1]
    return i+1

def quickSort(A,low,high):
    if low<high:
        q=partition(A,low,high)
        quickSort(A,low,high-1)
        quickSort(A,low+1,high)

quickSort(A,0,len(A)-1)

print(A)

