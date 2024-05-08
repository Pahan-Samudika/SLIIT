A=[7,4,8,2,6,3,9,1,5]

def binarySearch(A,minVal,maxVal,key):
    if maxVal<minVal:
        return False
    else:
        mid=(minVal+maxVal)//2
        if A[mid]>key:
            return binarySearch(A,minVal,mid-1,key)
        elif A[mid]<key:
            return binarySearch(A,mid+1,maxVal,key)
        else:
            return mid

print(binarySearch(A,0,len(A)-1,6))
