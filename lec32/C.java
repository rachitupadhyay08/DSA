package lec32;

public class C extends P /*ye likhne se ye child class bn jaati h*/{
    int d=1;
    int d1=10;
    
    @Override //ensure krne ke liye ki override hua ya nhi (annotation)
    public void fun(){ //method overriding --> purane wale method (class P ke fun) ko override kr diya.
        System.out.println("fun in C");
    }

    public void fun1(){
        System.out.println("fun1 in C");
    }   
}
