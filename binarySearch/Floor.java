package binarySearch;
public class Floor {
    public static void main(String[] args) {
        int[] nums = {1,2,4,5,9};
        int target = 0;
        System.out.println(flooring(nums, target));
    }
    static int flooring(int[] nums,int target)
    {
        if(target<nums[0])
        {
            return -1;
        }
        int start = 0;
        int end = nums.length-1;
        while(start<=end)
        {
            int mid = start + (end -start)/2;
            if(nums[mid]<target)
            {
                start = mid+1;
            }
            else if(nums[mid]>target)
            {
                end = mid-1;
            }
            else
            {
                return nums[mid];
            }
        }
        return nums[end];
    }
}
