package lec32;

public class Client {
    public static void main(String[] args) {
        P obj=new P();                // Normal Case   //Case 1
        System.out.println("Case-1");
        System.out.println(obj.d);
        System.out.println(obj.d2);
        obj.fun();
        obj.fun2();

       
        System.out.println();

        //Case-2
        System.out.println("Case-2");

        P obje=new C(); // sbse pehle new C() chlega aur usse C class aur P class dono ke data members ko ek location allocate hoga aur phir woh 
                        // location objec me jaakr save ho jaega..
        System.out.println(obje.d);  // 2  jis type ka reference variable hai --> common variable ussi ka call hoga....
        System.out.println(obje.d2); // 20
                    
        System.out.println(((C)(obje)).d1);  // particular line ke liye obje ka type C type ka bna denge ...
        System.out.println(((C)(obje)).d);   

        obje.fun();  // fun in C    //yaha pr common method me  updated wala clega "new wala".... phonepe app ka example
                     //jiska object bna hai ussi ka method chlega . 
        obje.fun2(); // fun2 in P //pehel C me check hoga ki kya fun2 hai jb nhi milega to P me check hoga
        
        ((C)(obje)).fun1();
        obje.fun();   // phonepe ke app me upgrade aane ke baad purana nhi chl skta that's why--> fun in P-->aa hi nhi skta hai.

        System.out.println();

        //Case-3;
        // System.out.println("Case-3");

        // C objec=new P();  // new P(); krne se sirf P ke data members ko location allocate hoga (d and d2)
        //                  // compile time error is always better than run time error 
        // System.out.println(objec.d);
        // System.out.println(objec.d2); 
        // System.out.println(objec.d1); // pr runtime pr ye error dega // accesible nazar aa rha hai kyuki obj ka type C hai..
        //
        //Isliye Case-3 is not eligible..

        System.out.println();
        System.out.println("Case-4");

        C object=new C();

        System.out.println(object.d); //jiska object uska chlega 
        System.out.println(object.d2);
        System.out.println(object.d1);
        System.out.println(((P)(object)).d); //  sirf common access krne ke liye object ko typecast krna pdega 

        object.fun();
        object.fun1();
        object.fun2();
        
        ((P)(object)).fun(); // phonepe ke app me upgrade aane ke baad purana nhi chl skta that's why--> fun in P-->aa hi nhi skta hai.
        // typecast krne se kuch nhi hoga hmesha upgraded hi chlega..
    } 
}
