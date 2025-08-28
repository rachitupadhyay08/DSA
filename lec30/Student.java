package lec30;

public class Student {
    private String name="kaju";
    private int age=17;

    public Student(String name,int age){
        this.age=age;
        this.name=name;
    }
    public void setAge(int age) {  
        try {//try block isme danger code likhte h jisme exception aa skta hai ,, agr exception aayega to catch block usse handle kr lega
            if(age<0){
            throw new Exception("bklol age -ve nhi hota hai");  // throw krwana // iska kaam hai exception ko generate krna  
        }
        this.age=age;   
        } catch (Exception e) { // e me exception ka address assign ho jaega.
            e.printStackTrace(); // kis line se error aa rha hai btane ke liye.
        }
        finally{
            System.out.println("I am in finally block");
            //System.exit(1);// program ko terminate krwane le liye 
        }
    }
    // public void setAge(int age) throws Exception{  //method ka signature bta rha hai ki may be isme exception aa skta hai.
    //     if(age<0){
    //         throw new Exception("bklol age -ve nhi hota hai");  // throw krwana // iska kaam hai exception ko generate krna  
    //     }
    //     this.age=age;               (2nd way)
    // }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public int getAge(){
        return age;
    }   
}
// error cannot be handled it can only be resolved.. 
// exception can be handled and resolved..