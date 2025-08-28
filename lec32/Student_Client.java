package lec32;

public class Student_Client {
    public static void main(String[] args) {
        Student s=new Student();
        System.out.println(s);// aisa krne pr by default wali Object class ka toString wala Method chlta hai.output dekh lo..
        //har class ka ek by default parent class(Object class) hota hai. 
        //dot ke baad whi sb by default wali Object class ke sb method dikhte hai. 
        //jb khud override krke naya toString method likh doge to whi aa jaeha jaisa likhoge..check in Student class file.. 
    }    
}
// content String me isliye print hota hai kyuki jb reference variable ko call krte hai to apne aap toString method call hota hai 
// ye "String class" ka call hota hai...."Object class" ka nhi... 

// MultiLevel Inheritance 

// A class ne B ko Inherit kr rha h (A ke paas A B C D E pancho ki prperty)
// B class ne C ko Inherit kr rha h (B ke paas B C D E charo ki property)
// C class ne D ko Inherit kr rha h (C ke paas C D aur E teeno ki property)
// D class ne E ko Inherit kr rha h (E ke paas bs E ki property)(D ke paas D aur E dono ki)


// Multiple Inheritance 

// Ek A class B aur C dono ko Inherit kr rhi h 
// means A ke 2 parent class h B and C.

// for example ek fun method A ke paas nhi hai pr B aur C ke paas hai to ye decide nhi ho pata hai ki kiska wala chlae
// Isliye java Multiple Inhertance allow nhi krta hai..

// pr multiple inheritance ko achive kiya jata h interface ki maddat se .... tree ke baad pdenge...

