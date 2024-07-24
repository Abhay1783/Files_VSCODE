
import java.util.*;

public class binarys {
    public static void main(String args[]){
        int[] arr = {1,2,3,4,5,6,7};
        int target = 4;
        System.out.println(binarySearch(arr,target));
        int arr1[]={1,2,3,4,5,6,11,10,9,8,7};
        System.out.println(findPeakElement(arr1));
    }
    public static int binarySearch(int[] arr,int target){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]>target){
                end = mid-1;
            }
            else{
                    start = mid+1;
                }
        }
        return -1;
    }
    static int findPeakElement(int arr[]){
        int start = 0;
        int end = arr.length-1;
        int n=arr.length;
        while(start<end){
          int mid=(start+end)/2;
          int prev=((mid-1)+n)%n;
          int next=(mid+1)%n;
          if(arr[mid]>arr[prev] && arr[mid]>arr[next]){
            return mid;
          }
          else if(arr[mid]<arr[prev]){
            end=mid-1;
          }
          else{
            start=mid+1;
          }
        }
        return -1;
    }
    static void findElementInBiotonicElement(int arr[], int target){
        int idx=findPeakElement(arr);
        if(idx==-1){
            System.out.println("Element does not exist");
        }
        else{
            if(target==arr[idx]){
                System.out.println("Element found at index "+idx);
                return;
            }
            else if(target>arr[idx]){
                System.out.println("Element doesn't lie");
            }
            
        }
    }
    static int minElement(int arr[]){
        int start=0;
        int end=arr.length-1;
        while(start<end){
            int mid=(start+(end-start))/2;
            if(mid>0&&arr[mid]<arr[mid-1]){
                return mid;
            }
            else if(arr[end]>arr[mid]){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return start;
    }
    static int maxElement(int arr[]){
        int start=0;
        int end=arr.length-1;
        while(start<end){
            int mid=(start+(end-start))/2;
            if(mid<arr.length-1&&arr[mid]>arr[mid+1]){
                return mid;
            }
            else if(arr[start]>arr[mid]){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return start;
    }


}
