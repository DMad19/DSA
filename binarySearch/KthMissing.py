def kthmissing(nums,n):
    i=0
    a = nums[0]
    while(i<n):
        if a not in nums:
            i+=1
            ans = a
        a+=1
    return ans
print(kthmissing([1,2,3,4,5],1))