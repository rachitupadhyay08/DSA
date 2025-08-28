package lec34;

import lec30.Stack;

public class dynamic_stack extends Stack {
    @Override
    public void push(int item) throws Exception{
        if(isfull()){
            int[] ar=new int[2*arr.length];  // arr accessible nhi hai kyuki wo private hai isliye usse protected bnaenge--> check Stack
            for(int i=0;i<arr.length;i++){
                ar[i]=arr[i];
            }
            arr=ar;
        }
        super.push(item);  // child class me parent class ka method call kre ke liye super keyword use hota hai..
 
    }
    public static void main(String[] args) throws Exception { // ye chlega jisse default constructor chlega aur phir 5 size ka array bnega 
                                             // jaise hi full hoga double size ka ek array bnega aur sb usme copy hoga phir index
                                             // ek se bdega aur naya item add hoga.... 
        dynamic_stack ds=new dynamic_stack();
        ds.push(10);
        ds.push(20);
        ds.push(30);
        ds.push(40);
        ds.push(50);
        ds.push(60);
        ds.Display();
    }
}
