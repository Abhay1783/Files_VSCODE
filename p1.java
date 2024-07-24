import java.util.*;
class p1 {
    public static long[] distance(int[] nums) {
        long arr[]=new long[nums.length];
        int d=0;
        for(int i=0;i<nums.length;i++){
            int j=0;int k=nums.length-1;
            int s=0;
            while(j<k){
                if(nums[i]==nums[j]&&i!=j){
                    s=s+Math.abs(i-j);
                    arr[d++]=s;
                    j++;
                }else{j++;}
                if(nums[i]==nums[k]&&i!=k){
                    s=s+Math.abs(i-k);
                    arr[d++]=s;
                    k--;
                }else{k--;}
                
            }
        }
        return arr;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        long arr1[]=distance(arr);
        for(int i=0;i<arr1.length;i++){
            System.out.println(arr1[i]);
        }
    }
}
