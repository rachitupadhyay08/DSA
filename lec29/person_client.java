package lec29;

public class person_client {
    public static void main(String[] args) {
        System.out.println("hello");
        person p=new person("raj",22);
                    //contructor calling
                //---object---     
        //System.out.println(p.name); // private bna diya isliye ye error de rha hai,, isse dikhega hi nhi
        //System.out.println(p.age);
        person p1=new person("pooja",21);
        //System.out.println(p1.name);   // yaha bhi isliye hi error aayega..
        //System.out.println(p1.age);
        //p1.age=-91;  // aise koi bhi akr change na krde iske liye pdenge access modifier
        p1.setAge(19);
        System.out.println(p1.getAge());
    }  
}

// Constructor has no return type.
// kaam hai class ke data member ko initialize krna..

// contructor call hone par bhi 
// sbse pehle kisi 2k location pr name null aur age me 0 save hoga i)memory allocation
// phir hogi ---> ii)parsing isme jo variable bna rkhe h wo aayenge like kaju and 17 
// iske baad constructor ke andr code ka flow aayega aur phir name Raj aur age 21 hoga ...
// debug console me jaakr 5th line breakpoint bna kr dekho.



// Access Modifier
// i) public ---> koi bhi khi bhi access ho skta h 
// ii) private --> jis class me jo variable/method bna hai wo whi accessible hoga.
// iii) protected --> jis package me bna hai bs whi dikhega 
// iv) default ---> 