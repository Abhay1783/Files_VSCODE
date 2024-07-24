import java.util.*;
class AggressiveCows{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int ans = solve(c,arr);
        System.out.println(ans);
        
    }
    static int solve(int k,int[] stalls){

        if(stalls.length<k){
            return -1;
        }
        int ans=-1;
        Arrays.sort(stalls);
        int start=1;
        int end=stalls[n-1]-stalls[0];
        while (start<=end) {
            int mid=(start+mid)/2;
            if(isValid(stalls,k,mid)){
                ans=mid;
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return ans;
    }
    static boolean isValid(int[] stalls,int k,int mid){
        int cow=1;
        int dist=stalls[0];
        for(int i=1;i<stalls.length;i++){
            if(stalls[i]-dist>=mid){
                cow++;
                dist=stalls[i];
            }
            if(cow>=k) return true;
        }return false;
    }
}