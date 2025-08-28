package lec16;

public class Wrapper_class_demo {
    public static void main(String[] args) {
        int a = 9;          //primitive data   //    stack me bnega aur whi save ho jaega.
        Integer a1 = 9;     //Non-primitive data  // heap memory me kisi loaction pr 9 save hoga aur uska address aakr a1 me save hoga...
        //                                           jo stack memory me save hoga.
        //****                                    // same for all float,boolean etc.....
        System.out.println(a);
        System.out.println(a1); // dono content hi print krega ... Reason OOps me pdenge..

    //  Auto-boxing
    // jab ek primitive data ko uske corresponding wale non-primitive data me assign krte h to isse bolte h auto-boxing.
    a1=a;   // a heap me chla gya **autoboxing


    int b=11; 
    System.out.println(b);
    Integer b1=189;
    System.out.println(b1);

    //  Unboxing
    // jb ek Non-primitive dat ko uske corrsponding* primitive data me assign krte h to isse bolte h Unboxing.
    b=b1;  //Unboxing
    System.out.println(b);


    // refer the image in the file.
    }
    
}

// koi bhi class ho (Non-primitive) hoti hai.

// java ne ye feature diya hai ki jaha primitive data type allowed na ho  non-primitive allowed ho to .... corresponding class
// ko use kr lena hota hai(Wrapper class) 


//       Primitive type                              Wrapper class 

//         byte          ------------------->           Byte
//         char          ------------------->         Character
//         float         ------------------->           Float
//          int          ------------------->          Integer
//         long          ------------------->           Long
//         short         ------------------->           Short
//        double         ------------------->           Double 