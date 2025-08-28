package lec18;

import java.util.ArrayList;

public class array_list_2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(7);  // agr 7 () ke andr likh du to whi initial capacity bn jaega.
        //initially 10 size ki capacity ka array bnta h by default
        //pr is samay iski size 0 hai

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(6);
        list.add(112); 
        list.add(200);
        list.add(301);  // yaha aane ke baad ye ek nayi ArrayList bnaega jiski capacity 1.5*old_capacity kr lega --> here 1.5 * 7= 11 ...
        list.add(62);   // phir saare existing elements nayi array me copy kr lega  // Array 1.5 se grow hota hai.
        System.out.println(list);
    }   
}


// initial capacity--> 1            growing by 2x(for example)
//                             
//                                no of operations...    
// 1st element 10                        1          #capacity=1*2=2
// 2nd element 20                        2=1(1st ko naye arraYlist me copy krne ke liye)+1(naye element) #capacity=2*2=4
// 3rd element 30                        3=2+1
// 4th element 40                        1(sift 4th element add hua copy kuch nhi hua)  #capacity=4*2=8
// 5th element 50                        5=4+1
// .....so on
// for 8 elements ----> 15 operations
// for 1 element average 2 operations hi lg rhe hai.(same in where 1.5x grow hoga)..                     