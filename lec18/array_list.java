package lec18;
import java.util.*;
public class array_list {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();  //Syntax....  //dusre data type bhi use kr skte h String,Boolean etc.....
        System.out.println(list);

        // element add
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(6);
        System.out.println(list);
        list.add(1,-9);  // 1 index pr -9 add krne ke liye ....index ka range 0 to size.
        System.out.println(list);

        //get krna
        System.out.println(list.get(1)); //index 0 to size-1

        //remove krna
        list.remove(1); //index 0 to size-1
        System.out.println(list);

        //update krna 
        list.set(3,-11);
        System.out.println(list);

        //size
        System.out.println(list.size());

        //sort
        Collections.sort(list);
        System.out.println(list);

        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }
        System.out.println();

        for(int val:list){
            System.out.print(val+" ");
        }
    }   
}
// ArrayList is a pre-defined class of java.
// It is a Non-primmitive data type.
// location is in heap memory.
// continious order me data rehta hai.

// used as a dynamic array --> array static hota h mtlb size fix hoti h pr Arraylist ki size dynamic hoti h time time pr grow hota chlta hai.

//Syntax to create
//element add krna
//get krna 
//remove krna 
//update krna 
//size 
//display
//sort


//***** foreach Loop == reverse nhi chlta h bas badta jaata hai. end point--> according to condition.

// Syntax
// for(:){
// 


