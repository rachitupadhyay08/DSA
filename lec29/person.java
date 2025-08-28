package lec29;

public class person {
    private String name="kaju"; // bahar ka banda access nhi kr paega private access modifier.. data hiding 
    private int age=17;
    // public person(){
    //     //defaulr contructor bna leta h jbtk
    //     // hum khud nhi bnate hai
    // }

    public person(String name,int age){
        this.name=name;
        this.age=age;  
    } // ye humne bna diya
    
    public void setAge(int age){ //data modification
        this.age=age;
    } //setter

    public int getAge(){  // data access krna 
        return age;
    } //Encapsulation 
      //getter   
}