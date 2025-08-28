package lec32;

public class Inheritance {
}
// Child class and Parent class..
// Child class can access parent class methods but parent class can not access child class methods..

//       P            obj            =  new       P();
//   classname   ref-variable-name   =  new   classname();  
//         (compiler)                     (JVM)
//             LHS                   /          RHS
//            P Obj                      new P();  (Normal case)
//            P Obj                      new C();     case-1
//            C Obj                      new P();     case-2
//            C Obj                      new C();     case-3