package lec28;

public class recursion_time_complexity {
    public static void main(String[] args) {
        
    }
    
}
// time complexity = (no. of frames * work done by each frame)

// public class factorial {
//     public static void main(String[] args) {
//         int n=5;
//         System.out.println(fact(n));
//     }
//     public static int fact(int n){
//         if(n==0){
//             return 1;    // solution to the problem given below 
//         }
//         int fn=fact(n-1);  // smaller problem
//         return fn*n;
//     }  
// }

// time compelxity--> n*1 ====> O(n)



// public static int pow(int a,int b){
//         if(b==0){
//             return 1;
//         }
//         int ans=pow(a,b-1);
//         return 3*ans;
//     }  

//time complexity--> n*1====> O(n)


//first occurance
// public static int Index(int[] arr,int item,int idx){
//         if(idx==arr.length){
//             return -1;
//         }
//         if(arr[idx]==item){
//             return idx;
//         }
//         return Index(arr,item,idx+1);
// } 

//time complexity--> O(n)


// public static int fib(int n){
//         if(n==0 || n==1){
//             return n;
//         }
//         int f1=fib(n-1);
//         int f2=fib(n-2);
//         return f1+f2;   
//     }
// no. of frames == 2^0 + 2^1 + 2^2 ... +2^n-1  **gP== a((r^n)-1)/r-1   (ar^0 + ar^1 + ar^2....ar^n-1)
// (2^n -1) x 1

// time complexity --> O(2^n)

// agr ek jagah se 3 recursive call nikal rhe h to no. of frames ===> 3^0 + 3^1 +.....+3^n-1


// Recurrance relation of a recursive call
//
// T(n)=T(n-1)+1
// T(n-1)=T(n-1)+1
// T(n-2)=T(n-3)+1
//..
//...
//when add lhs and rhs
//**** T(n) = n

// this will not be applicable for
// T(n)=T(n-1)+T(n-2)

// public static int fib(int n){
//         if(n==0 || n==1){
//             return n;
//         }
//         int f1=fib(n-1);
//         int f2=fib(n-2);
//         return f1+f2;   
//     }


// way to solve 

// T(n-1) +T(n-2) < T(n-1) + T(n-1)

//           f(n) <= Cg(n)

// then f(n) ki time complexity is equal to O(g(n))...

// T(n) = 2*T(n-1) + 1
// 2*T(n-1)= 2^2*T(n-2) + 1*2
// 2^2*T(n-2)=2^3*T(n-3) + 1*2^2 
//....
// 2^(n-1)T(n-(n-1)) = 1 * 2^(n-1)                           (n-(n-1))=1
// final...

// T(n) = 2^0 + 2^1 + 2^2 .... + 2^n-1


// Binary search 

// T(n)=T(n/2)+1
// T(n/2)=T(n/4)+1
// T(n/4)=T(n/8)+1
// T(n/8)=T(n/16)+1
// ...
//...
// T(1)=1
// final ...

// (n/2^k)=1
// 2^k=n
// k=log(n)

// Merge sort 

// public static int[] sort(int[] arr, int si,int ei){
//         if(si==ei){
//             int[] bs=new int[1];
//             bs[0]=arr[si];
//             return bs;
//         }
//         int mid=(si+ei)/2;
//         int[] fa=sort(arr,si,mid);
//         int[] sa=sort(arr,mid+1,ei);
//         return merge(fa,sa);
//     }

// T(n)=T(n/2)+T(n/2) (sorting me ) + n (merge krne me)
// T(n)=2^2*T(n/2) + n
// 2*T(n/2)=2^2*T(n/4) + (n/2)*2
// 2^2*T(n/4)=2^2*T(n/8) + (n/4)*2^2
// 2^3*T(n/8)=2^3*T(n/16) + (n/8)*2^3
//...
//..
// 2^k*T(n/2^k (=1)) = 1*2^k (=n/2^k)

// final...
// T(n)=n*k(n ko k times add krna h katne ke baad)
// k=log(n)
// T(n)=n(log(n)) 
// same for quick sort **********



// merge sort ki (best, worst, avg) time complexity 
// teeno ki hi ----> O(n*log(n))

// quick sort 
// avg and best ---> O(n*log(n))
// worst ---> O(n^2)