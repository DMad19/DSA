package binarySearch;

public class FindInRotatedSortedArray {
    public static void main(String[] args) {
        int[] nums = {4,5,6,7,0,1,2,3};
        int target = 7;
        System.out.println(findIndexInRotated(nums, target));
    }
    static int findIndexInRotated(int nums[],int target)
    {
        int pivot = findpivot(nums);
        if(pivot==-1)
        {
            return search(nums,target,0,nums.length-1);
        }
        int ans = search(nums,target,0,pivot);
        if(ans==-1)
        {
            return search(nums,target,pivot+1,nums.length-1);
        }
        return ans;
    }
    static int search(int[] nums,int target,int start,int end)
    {
        while(start<=end)
        {
            int mid = start+(end-start)/2;
            if(nums[mid]>target)
            {
                end = mid-1;
            }
            else if(nums[mid]<target)
            {
                start = mid+1;
            }
            else
            {
                return mid;
            }
        }
        return -1;
    }
    static int findpivot(int nums[])
    {
        int start = 0;
        int end = nums.length-1;
        while(start<end)
        {
            int mid = start + (end-start)/2;
            if(nums[mid]>nums[mid+1])
            {
                return mid;
            }
            if(nums[mid]<nums[mid-1])
            {
                return mid-1;
            }
            if(nums[start]>=nums[mid])
            {
                end = mid-1;
            }
            else
            {
                start = mid+1;
            }
        }
        return -1;
    }
}
