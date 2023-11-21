class twosum {
    public static int[] twoSum(int[] nums, int target) {
        int i,a[]=new int[2],d=0,j;
        for(i=0;i<nums.length-1;i++)
        {
            for(j=i+1;j<nums.length;j++)
            if(nums[i]+nums[j]==target)
            {
                a[d++]=i;
                a[d++]=j;
                break;
            }
        }
        return a;
    }
}