def maxheap(A,n,parentindex):
    largest=parentindex
    left=2*parentindex+1
    right=2*parentindex+2

    if left<n and A[left]>A[largest]:
        largest=left
    if right<n and A[right]>A[largest]:
        largest=right
    if largest != parentindex:
        A[largest],A[parentindex]=A[parentindex],A[largest]
        maxheap(A,n,largest)

def heapsort(A):
    n=len(A)

    for i in range(n//2-1,-1,-1):
        maxheap(A,n,i)

    for i in range(n-1,0,-1):
        A[i],A[0]=A[0],A[i]
        maxheap(A,i,0)

A = [7, 4, 8, 2, 6, 3, 9, 1, 5]

heapsort(A)
print(A)
