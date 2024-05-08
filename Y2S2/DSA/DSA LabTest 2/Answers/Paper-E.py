def insertionSort(A):
    n=len(A)
    for k in range(1,n):
        key = A[k]
        i = k - 1
        while i>=0 and A[i]>key:
            A[i+1] = A[i]
            i -= 1
        A[i+1] = key

Marks = []

for i in range(0,10):
    Marks.append(int(input("Enter Marks of Student %d :" %(i+1))))

print("Entered Marks: ",Marks)

insertionSort(Marks)

print("Sorted Marks: ",Marks)

print("Top 5 Marks selected for scholarship: ",Marks[5:])
    
