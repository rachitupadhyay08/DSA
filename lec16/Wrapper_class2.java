package lec16;

public class Wrapper_class2 {
    public static void main(String[] args) {
        Integer c1=18;  // ye cache ki range  me bnega isliye duplicate nhi hoga to dono ko same location assign hogi
        Integer c2=18;  // isliye neeche compare krne par true aa rha hai.
        Integer c3=189; // ye cache ki range se bahar bnega isliye duplicate hoga to dono ka location alg alg hoga 
        Integer c4=189; // isliye neeche compare krne par false aa rha hai.
        System.out.println(c1 == c2); // true

        System.out.println(c3 == c4); // out  of range. false
    }  
}
//*****Cache ka value hota h -128 to 127 aur isme duplicate value nhi bnta hai........
