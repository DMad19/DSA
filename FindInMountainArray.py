class Solution:
    def findInMountainArray(self, target: int, nums) -> int:
        peak = peakindex(nums)
        print(peak)
        if(ascbinary(nums,0,peak-1,target)!=-1):
            return ascbinary(nums,0,peak-1,target)
        else:
            return dscbinary(nums,peak,len(nums)-1,target)
def peakindex(nums):
    start = 0;
    end = len(nums)-1
    while(start<end):
        mid = start + (end-start)//2
        if(nums[mid]>nums[mid+1]):
            end = mid
        elif(nums[mid]<nums[mid+1]):
            start = mid+1
    return start
def ascbinary(arr,start,end,target):
    while(start<=end):
        mid = start + (end-start)//2
        if(target<arr[mid]):
            end = mid-1
        elif(target>arr[mid]):
            start = mid+1
        else:
            return mid
    return -1
def dscbinary(arr,start,end,target):
    while(start<=end):
        mid = start + (end-start)//2; 
        if(target<arr[mid]):
            start = mid+1
        elif(target>arr[mid]):
            end = mid-1
        else:
            return mid
    return -1
s = Solution()
print(s.findInMountainArray(1,[1,2,3,10,11,9,8,7]))