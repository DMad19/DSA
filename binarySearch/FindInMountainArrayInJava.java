package binarySearch;

public class FindInMountainArrayInJava {
    public static void main(String[] args) {
        int[] nums = {1,2,3,40,5,3,2,1};
        int target = 40;
        System.out.println(find(nums,target));
    }
    static int find(int[] nums,int target)
    {
        int peakindex = peak(nums);
        int ascans = ascbinary(nums,target,0,peakindex+1);
        if(ascans== -1){
            return dscbinary(nums,target,peakindex+1,nums.length);
        }
        return ascans;
    }
    static int peak(int[] nums)
    {
        int start = 0;
        int end = nums.length -1;
        while(start<end)
        {
            int mid = start+(end-start)/2;
            if(nums[mid]>nums[mid+1])
            {
                end = mid;
            }
            else if(nums[mid]<nums[mid+1])
            {
                start = mid+1;
            }
        }
        return start;
    }
    static int ascbinary(int[] nums,int target,int start,int end)
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
    static int dscbinary(int[] nums,int target,int start,int end)
    {
        while(start<=end)
        {
            int mid = start+(end-start)/2;
            if(nums[mid]<target)
            {
                end = mid-1;
            }
            else if(nums[mid]>target)
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
}
