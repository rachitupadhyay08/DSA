package lec15;

public class string {
    public static void main(String[] args) {
        String s1="hello"; // string pool/intern pool me bnega (duplicate allow nhi h ) eg.location 2K
        String s2="hello"; // location 2K
        String s3=new String("hello"); // heap me bnega string pool me nhi bnega  (loaction--> 4K) (duplicate allowed).
        String s4=new String("hello"); // location--> 6K
        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s1 == s4);
        System.out.println(s1.length()); // to find the length of string.
        int[] arr=new int[5];
        System.out.println(arr.length); 
        // array ki length array class ka variable hai  and string ki length string class ka method hai.*****
    }
    
}
// String is a class in java.
// it is a non-primitive data type.
// non-primitive data type heap memory me store hota h. 
