package arrays;

public class SortedOrNot {
    public static void main(String[] args) {
        int[] arr = {1,3,5,7,10,12};
        System.out.println("is Sorted: "+isSorted(arr,0));
//        concept of && operator
        int a=1;
        if(++a==2)
            System.out.println(a); // prints 2
        if(0==1 && ++a==3){
            System.out.println(a); // prints nothing because ++a is not executed since 0==1 is false and that's sufficient for && operator to output false
        }
        System.out.println(a); // prints 2 since ++a was not executed above
        if(0==1 || ++a==3){
            System.out.println(a); // prints 3
        }
    }

    private static boolean isSorted(int[] arr, int index) {
//        base condition
        if(index==(arr.length-1))
            return true;
        return arr[index]<arr[index+1] && isSorted(arr,index+1);
    }
}
