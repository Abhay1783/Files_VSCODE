import java.util.*;
class bookal{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        // ArrayList<Integer> list=new ArrayList<>();
        // int s1=0,s2=0,max=Integer.MIN_VALUE,min=Integer.MAX_VALUE;
        // for(int i=0;i<=n-1;i++){
        //     s1=0;s2=0;
        //     for(int k=0;k<=i;k++){
                
        //         s1=s1+a[k];
        //         //System.out.println("Sum1 = " +s1);
        //     }
        //     for(int j=i+1;j<n;j++){
        //         s2=s2+a[j];
        //         //System.out.println("Sum2 = "+s2);
        //     }
        //     max=Math.max(s1,s2);
        //     //System.out.println("Max = "+max);
        //     list.add(max);
        // }
        // for(int i=0;i<list.size();i++){
        //     System.out.println(list.get(i));
        //     min=Math.min(min,list.get(i));
        // }
        // System.out.println(min);
        System.out.println(bookAllocation(a,2));


    }
    static int bookAllocation(int book[],int students){
        if(book.length<students){
            return-1;
        }
        //rangeof array
        int start=Integer.MIN_VALUE;
        int end=0;//sum of array
        for(int i=0;i<book.length;i++){
            start=Math.max(start,book[i]);
        }
        for(int i=0;i<book.length;i++){
            end+=book[i];

        }
        //binary search
        int res=-1;
        while(start<end){
            int mid=start+(end-start)/2;
            //System.out.println("Mid = "+mid);
            if(isAllocationPossible(book,mid,students)){
                res=mid;
                end=mid-1;
            }else{
                start=mid+1;
            }    
        }
        return res;
    }
    static boolean isAllocationPossible(int books[],int mid,int students){
        int currStudent=1;
        int pages=0;
        for(int i=0;i<books.length;i++){
            pages+=books[i];
            if(pages>mid){
                currStudent++;
                pages=books[i];
            }
            if(currStudent>students){
                return false;
            }
        }
        return true;
    }
}