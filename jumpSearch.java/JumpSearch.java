import java.util.Scanner;

public class JumpSearch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a[]={1,2,3,4,5,6,7,8,9};
        int n=9;
        System.out.println(jumpSearch(a,n));
        System.out.println(ternarySearch(a,n));
    }
    static int jumpSearch(int a[],int t){
        int n=a.length;
        int step=(int)(Math.sqrt(n));
        int start=0;
        int end=step;
        while(end<n&&a[end]<=t){
            start=end;
            end+=step;
            if(end>n){
                end=n;
            }
        }
        for(int i=start;i<end;i++){
            if(a[i]==t){
                return i;
            }
        }
        return -1;
    }
    static int ternarySearch(int a[],int t){
        int start=0;
        int end=a.length;
        int idx=-1;
        while(start<=end){
            int mid1=start+(end-start)/3;
            int mid2=end-(end-start)/3;
            if(a[mid1]>=t){
                if(a[mid1]==t){
                    idx=mid1;break;
                }
                end=mid1-1;
            }else if(a[mid2]<=t){
                if(a[mid1]==t){
                    idx=mid2;break;
                }
                end=mid2-1;
            }else{
                start=mid1+1;
                end=mid2-1;
            }

            
        }
        return idx;
    }
    static int exponentialSearch(int a[],int t){
        int n=a.length;
        if(a[0]==t){
            return 0;
        }
        int i=1;
        while(i<n&&a[i]<=t){
            i=2*i;
        }
        int end=Math.min(i,n-1);
        int idx=binarySearchOnRange(a,i/2,end,t);
        return idx;
    }
    static int binarySearchOnRange(int []a,int start,int end,int t){
        int idx=-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(a[mid]==t){
                idx=mid;
                break;
            }else if(a[mid]>t){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }return idx;
    }
}
