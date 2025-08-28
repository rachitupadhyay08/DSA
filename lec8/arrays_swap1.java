package lec8;

public class arrays_swap1 {
    public static void main(String[] args) {
        int arr[] = {3, 5, 1, 7, 8}; // c type declaration
        System.out.println(arr[0]+" "+arr[1]);
        swap(arr[0],arr[1]);
        System.out.println(arr[0]+" "+arr[1]);
    }

    public static void swap(int a, int b) {
        int temp=a;
        a=b;
        b=temp; 
        System.out.println(b);   
        System.out.println(a);   
    }    
}

// this is not a method to swap the vales in array.
