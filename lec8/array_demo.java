package lec8;

import java.util.Arrays;

public class array_demo {
    public static void main(String[] args) {
        int a=5;
        int[] arr=new int[5]; // java type declaration.
        System.out.println(a);
        System.out.println(Arrays.toString(arr));
        int[] other=arr;   // same address will be assigned to both 'arr' and 'other' both.
        System.out.println(Arrays.toString(other));
        arr[0]=10;
        arr[1]=20;
        arr[2]=30;
        arr[3]=40;
        arr[4]=9;
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);
        System.out.println(other.length);// gives the length of the array.
    }   
}
// array is a class in java.
// array is the collection of same type of data.
// 0 based indexing is done in array because if it is done in 1 based indexing , then the first block will be skipped.