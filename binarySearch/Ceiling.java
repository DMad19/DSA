package binarySearch;
public class Ceiling {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7,10};
        int target = 11;
        System.out.println(ceiling(nums, target));
    }
    static int ceiling(int[] nums,int target)
    {
        if(target>nums[nums.length-1])
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
        return nums[start];
    }
}
