import java.util.*;
// interface task{
//     public int add(int a,int b);
// }
public class p3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // task obj=(int a,int b)->a+b;
        // System.out.println(obj.add(sc.nextInt(),sc.nextInt()));
        ArrayList<Integer> list=new ArrayList<>();
        list.add(5);
        list.add(49);
        list.add(23);
        list.add(4);
        System.out.println("Before Sorting");
        list.forEach((n)->System.out.print(n+" "));
        // Vector<Integer> v=new Vector<>();
        // v.add(5);
        // v.add(6);
        // v.add(7);
        // v.add(3);
        // v.add(4);
        // for(int i:v){
        //     v.forEach((n)->System.out.print(n+" "));
        System.out.println("\nSmallest number in array"+Collections.min(list));
        System.out.println("Largest Number in array"+Collections.max(list));
        System.out.println("After sorting in Ascending order");
        Collections.sort(list);
        list.forEach((n)->System.out.print(n+" "));
        System.out.println("Sorting in Descending Order");
        Collections.sort(list,Collections.reverseOrder());
        list.forEach((n)->System.out.print(n+" "));
        Collections.reverse(list);
        System.out.println("After Reversing the list");
        list.forEach((n)->System.out.print(n+" "));
        System.out.println();
        System.out.println("Searching index of 10 and present at a index of "+Collections.binarySearch(list,23));
    }
}
