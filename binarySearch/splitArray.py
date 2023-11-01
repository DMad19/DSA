def splitArray(nums,k):
    for i in range(len(nums)):
        for j in range(0,len(nums)):
            if(j>i):
                print(nums[i:j])
            else:
                print(nums[j:i])
print(splitArray([1,2,3,4,5,6],2))
