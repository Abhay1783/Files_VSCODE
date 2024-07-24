import java.util.*;
class p2{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //int n=sc.nextInt();
        int arr[]={-5,1,-2,3,-1,2,-2};
        //int res=countOnes(arr);
        System.out.println(maxSubArraySum(arr));
    }
    static int countOnes(int []arr){
        int n=arr.length,c=0,res=Integer.MIN_VALUE;
        for(int i=0;i<n-1;i++){
            if(arr[i]==0){
                c=0;
                
                //if(arr[i]!=1) i--;
            }
            else{
                c++;
                res=Math.max(c,res);
                
            }
        }
        return res;
    }
    static int maxSubArraySum(int arr[]){
        int n=arr.length;
        int res=arr[0];
        int maxEnd=arr[0];
        for(int i=0;i<n;i++){
            maxEnd=Math.max(maxEnd+arr[i],arr[i]);
            res=Math.max(res,maxEnd);
        } 
        return res;
    }
    static int countOddEven(int[] arr){
        int n=arr.length;
        if(arr[0]%2==0){
            int i=0;
            while(i<n){
                if(a[i]%2==0){
                    if(a[i+1]%2!=0)
                }
            }
        }
    }
}