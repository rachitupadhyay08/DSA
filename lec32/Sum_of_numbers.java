package lec32;

public class Sum_of_numbers {
    public static void main(String[] args) {
        System.out.println(Add(2, 3));
        System.out.println(Add(2, 3, 11));
        System.out.println(Add(2, 3, 8.9));
        System.out.println(Add(2,3,4,4,5,5,5,5,5,5,5,5,5,5));
    }
    public static int Add(int a,int b){
        return a+b;
    }
    public static int Add(int a,int b,int c){
        return a+b+c;
    }
    public static int Add(int a,int b,double c){
        return (int)(a+b+c);
    }
    // triple dot argument( datatype ...)
    public static int Add(/*int x(aisa kr skte hai)),*/ int ...ar /*int x (not allowed)*/){ // jb no of arguments hi na pata ho ki kitne aayenge to use hoga jisse ek array bn jaega
                        // is case me pehle argumnet x me jaega baaki ka array me  
                         // puure method me ek hi ...(triple dot) argument ho skta hai jo ki bilkul right me hoga 
        int sum=0;
        for(int i=0;i<ar.length;i++){
            sum+=i;
        }
        return sum;
    }
}
// Method Overloading --> same class me hoga 
// return type and name of method remains same 
// only the number of arguments or type of arguments passes inside the method different ho ska hai.

// overriding and all ---> polymorphism
