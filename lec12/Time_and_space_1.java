package lec12;

public class Time_and_space_1 {
    public static void main(String[] args) {
        System.out.println("Hello"); // O(1)
        System.out.println("Hello");
        System.out.println("Hello");
        System.out.println("Hello");
        System.out.println("Hello"); // sbko milakr O(1) hi bolenge 

        // Linear Search ki time complexity
//  public static int search(int[] arr,int item){
//         for(int i=0; i<arr.length; i++){
//             if(arr[i]==item){
//                 return i;
//             }
//         }
//         return -1;
//     }


// worst case ;
// har ek iteration chlegi mtlb item array me h hi nhi .
// har i ke liye ek baar chlega phir loop se nhar nikal kr ek baar chlega f(n)=(n+1)
// time complexity = O(n)  constant ko ignore kr diya.
// aise hi max value ke liye hoga.

// reverse array ke liye 
//  public static void reverse(int[] arr){
//         int i=0;
//         int j=arr.length-1;
//         while(i<j){
//             int temp=arr[i];
//             arr[i]=arr[j];
//             arr[j]=temp;
//             i++;
//             j--;
//         }
//     }   

// **here f(n)=n/2
// time complexity= O(n) // ignore the constant. (worst case)

// Binary search ki time complexity.

// public static int search(int[] arr,int item){
//         int low=0;
//         int high=arr.length-1;
//         while(low<=high){       
//             int mid=(low+high)/2;
//             if(arr[mid]==item){ 
//                 return mid;
//             }
//             else if(arr[mid]>item){ **O(1)
//                 high=mid-1;
//             }
//             else{            
//                 low=mid+1;
//             }
//         }
//         return -1;
//     } 

// ** sbko milakr ek hi constant maanenge --> **O(1)
// N/2^0 --> 1
// N/2^1 --> 1 
// N/2^2 --> 1
// N/2^3 --> 1
//..
//..
// N/2^k --> 1

// jitni baar loop chla utna time lga hoga .
//n=2^k
//k=log n(base 2)
// time complexity = O(log n(base2))


    int n=10000;
    int i=0;
    while(i<n){
        System.out.println("hey");
        i++;
        //O(n) time complexity
    }

    while(i<=n){
        System.out.println("hey");
        i *=2;
        //O(log n (base 2)) 
    }

    while(n>0){
        System.out.println("hey");
        n /= 2;
        //O(log n (base 2))      ditto binary search
    }

    while(i<=n){
        System.out.println("hey");

        i += 2;
        i += 3;
        // O(n)   (n/5) times chlega 
    }

    while(i<=n){
        System.out.println("hey");

        i *= 2;
        i *= 3;
        // O(log n (base 6))    
    }
    int k=3; 
    while(i<=n){
        System.out.println("hey");

        i += k;
        // O(n/k)  k constant hua to O(n).   
    }
    while(i<=n){
        System.out.println("hey");

        i *= k;
        // O(log n (base k))    
    }

    for(i=1;i<=n;i++){
        for(int j=n;j<=n;j++){
            System.out.println("hey");
        }
        //**  O(n^2)  **time comeplexity  n*n=n^2    f(n)=n^2  // i aur j dono n baar chlenge .
        // kyuki yaha dono loop independent hai. i=1 me n baar chlega i=2 me n baar chlega  i=n me bhi n baar chlenga 
        // n ko n times add krenge to n^2 aayega ..(mathematical proof) 
    }

    for(i=1;i*i<=n;i++){
        System.out.println("hey");
        //i^2 <= 10000
        // i=100
        // 100 times chlega loop
        // O(100) time complexity
        // O(sqrt(n))**   
    }
    for(i=1;i<=n;i++){
        for(int j=1;j<=i*i;j++){
            for(k=1;k<=n/2;k++){
                System.out.println("hey");
            }
        }
        //i--> n baar chlega 
        //j--> n^2 baar chlega  
        //k--> n/2 baar chlega 
        //time comeplexity = (n)*(n^2)*(n/2) = (n^4/2) = O(n^4)  ignore the constant
    }

    for(i=1;i<=n;i*=2){
        System.out.println("hey");
        //O(log n (base 2))      ditto binary search   
    }


    for(i=n/2;i<=n;i++){
        for(int j=1;j<=n/2;j++){
            for(k=1;k<=n;k=k*2){
                System.out.println("hey");
            }
        }
        // i --> n/2 baar chlega 
        // j--> n/2 baar chlega 
        // k--> log n(base 2) baar chlega 
        // O((n^2)log n(base 2))  here (n/2)*(n/2)*log n(base 2)= (n^2*log n(base 2)).
    }
    for(i=1;i<=n; i++){
        for( int j=1; j<=n;j += i){
            System.out.println("hey");
        }
        //i ki value 1 pr j n baar chlega 
        // i value 2 pr j n/2 baar chlega
        // i value 3 pr j n/3 baar chlega  
        // i value 4 pr j n/4 baar chlega
        // i value 5 pr j n/5 baar chlega  
        // i value n pr j (n/n)=1 baar chlega 
        // log n = n[1 + 1/2+ 1/3 + 1/4...... + 1/n]

        // time complexity = O(n*log n(base 2))
    }



//bubble sort

//    public static int[] sort(int[] arr){
//         for(int turn=1; turn<arr.length;turn++){
//             for (int i = 0; i < arr.length-turn ; i++) {
//                 if(arr[i]>arr[i+1]){
//                     int temp=arr[i];
//                     arr[i]=arr[i+1];
//                     arr[i+1]=temp;
//                 }   
//             }
//         }
//         return arr;
//     }

// here 
// O(n^2)  sum of (n-1) natural numbers = (n(n-1))/2

// Insertion sort

//  public static void sort(int[] arr){
//         for(int i=1;i<arr.length;i++){
//             insertlastElement(arr, i);
//         }
//     }
//     public static void insertlastElement(int[] arr,int i){
//         int item=arr[i];
//         int j=i-1;
//         while(j>=0 && arr[j]>item){
//             arr[j+1]=arr[j];
//             j--;
//         }
//         arr[j+1]=item;
//     }

// here 

// sum of natural numbers as well
// time complexity = O(n^2)


// Selection sort

//  public static int[] sort(int[] arr){
//         for(int i=0; i<arr.length;i++){
//             int idx=minidx(arr,i);
//             int temp=arr[i];
//             arr[i]=arr[idx];
//             arr[idx]=temp; 
//         }
//         return arr;

//     }
//     public static int minidx(int[] arr,int i){
//         int mini=i;
//         for(int j=i+1;j<arr.length;j++){
//             if(arr[j]<arr[mini]){
//                 mini=j;
//             }
//         }
//         return mini;
//     }

// here 
// sum of natural numbers 
// time complexity= O(n^2)

//** worst case time complexity of bubble, insertion and selection sort is O(n^2).

// teeno me se best case time complexity 
// minimum swapping selection sort me hoti hai.
//***** insertion sort ka best case time complexity o(n) hota h . jab array already sorted ho tb



// kadens 

// public static int maxSum(int[] arr){
//         int ans=Integer.MIN_VALUE;
//         int sum=0;
//         for(int i=0;i<arr.length;i++){
//             sum += arr[i];
//             ans=Math.max(ans,sum);
//             if(sum<0){
//                 sum=0;
//             }
//         }
//         return ans;
// }

// here 
// time complexity --> O(n)

// max sum

// public static int max(int[] arr){
//         int temp= Integer.MIN_VALUE;  // -2^31
//         // Integer.MAX_VALUE               (2^(31) -1)
//         for(int i=0; i<arr.length; i++){
//             if(arr[i]>temp){
//                 temp=arr[i];
//             }
//         }
//         return temp;
// }

//here 
// time complexity --> O(n) .

// max subarray

// public static int maxSum(int[] arr){
//         int ans=Integer.MIN_VALUE;
//         for (int i = 0; i < arr.length; i++) {
//             int sum=0;
//             for (int j = i; j < arr.length; j++) {
//                 sum += arr[j];
//                 ans=Math.max(ans,sum);
//             }   
//         }
//         return ans;
//     } 


// here
// time complexity--> O(n^2).


    }
}




