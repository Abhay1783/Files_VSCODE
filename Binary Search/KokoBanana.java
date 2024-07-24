import java.util.Scanner;

public class KokoBanana {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the range");
        int n=sc.nextInt();
        System.out.println("Enter the array element");
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the hour");
        int k=sc.nextInt();
        System.out.println(minEatingSpeed(arr,k));
    }
    static int minEatingSpeed(int piles[], int h){
        int start=1,ans=-1;
        int end=Integer.MIN_VALUE;
        for(int i=0;i<piles.length;i++){
            end=Math.max(piles[i],end);
        }
        while(start<=end){
            int mid=(start+end)/2;
            if(isEatingSpeedValid(piles,mid,h)){
                ans=mid;
                end=mid-1;
            }
            else{
                start=mid+1;
            }

        }
        return ans;
    }
    static boolean isEatingSpeedValid(int[]piles,int mid,int h){
        int hoursSpent=0;
        for(int i=0;i<piles.length;i++){
            hoursSpent+=Math.ceil((double)piles[i]/(double)mid);
            if(hoursSpent>h) return false;
        }
        return true;
    }
    
}
