package lec12;

public class time_and_space_complexity {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        for(int i=0;i<1000000;i++){

        }
        long end=System.currentTimeMillis();
        System.out.println(end-start);  // Experimental way
        // ye tarika galat h kyuki isme ardware dependancy h .
    }
    
}
// ek program ko execute hone me kitna time lgta h. is known as time complexity.
// 
// There are two ways to find time complexity;
// 1) Experimentally.
// 2) Asymptotic notation.

// Asymptotic Notation***  hardware independent , based on input size and code.
// 1) worst case --> sbse jyada time lgega.
// 2) best case --> sbse kam time lgega.
// 3) avg case --> worst aur best ke beech me .
//
// O(g(n)) // worst case  //big -Oh Notation

// Omega(g(n) // best case 

// f(n)=3n^7+4n^2+5
// c=3+4+5
// g(n)=n^7
// f(n)<=c*g(n) if true then O(g(n)) is the time complexity .

// trick--> puri equation ki sbse bs=adi term ko g(n) lelo.
// constant time ko define kro??
// ans=independent of N.(n=input size)

// code ki complexity kaise nikale??? refer Time_and_space_1.java

// ******Space complexity

// input ke alawa agr koi extra array  array list aapne code me use kiya h .
// for example 

// public static int[] product(int[] arr) {
//         int n=arr.length;
//         int[] left= new int[n];   ** yaha pr 2 array use kiye h n size ke (2 n)
//         int[] right= new int[n];

//         left[0]=1;
//         for(int i=1;i<n;i++){
//             left[i]=left[i-1]*arr[i-1];
//         }

//         right[n-1]=1;
//         for(int i=n-2;i>=0;i--){
//             right[i]=right[i+1]*arr[i+1];
//         }
//         for(int i=0; i<n; i++){
//             left[i]= left[i]*right[i];
//         }
//         return left;
//     }

// here 
// Space complexity = O(n).

// input ke alawa agr koi extra variable use kiya h to use O(1) constanr bolenge .
    
