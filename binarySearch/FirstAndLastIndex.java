package binarySearch;
import java.util.Arrays;

public class FirstAndLastIndex {
    public static void main(String[] args) {
        int[] nums = {1,2,2,2,2,2,3,4,5,6};
        int target = 2;
        System.out.println(Arrays.toString(search(nums, target)));
    }
    static int[] search(int[] nums,int target)
    {
        int[] ans = {-1,-1};
        ans[0] = binarysearch(nums,target,true);
        ans[1] = binarysearch(nums,target,false);
        return ans;
    }
    static int binarysearch(int[] nums,int target,boolean findStartValue)
    {
        int ans = -1;
        int start = 0;
        int end = nums.length;
        while(start<=end)
        {
            int mid = start+(end-start)/2;
            if(target>nums[mid])
            {
                start = mid+1;
            }
            else if(target<nums[mid])
            {
                end = mid-1;
            }
            else
            {
                ans = mid;
                if(findStartValue)
                {
                    end = mid-1;
                }
                else
                {
                    start = mid+1;
                }
            }
        }
        return ans;
    }
}
