import java.util.Scanner;

public class SmallestDivisor {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter threshold");
        int threshold=sc.nextInt();
        int ans=smallestDivisor(arr,threshold);
        System.out.println(ans);
    }
    static int smallestDivisor(int arr[],int t){
        int start=1;
        int end=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            end=Math.max(end,arr[i]);
        }
        int res=-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(isDivisonPossilble(arr,mid,t)){
            res=mid;
            end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return res;
    }
    static boolean isDivisonPossilble(int arr[],int mid,int t){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i]/mid;
            if(arr[i]%mid!=0){
                sum+=1;
            }
            if(sum>t) return false;
        }
        return true;
    }
}
