package lec29;

public class Student {
    String name;   // class ka data memeber
    int age;       //----//
    public void Intro_yourself(){        // non-static method
        SayMentorname();
        // par Non-static me Static accesible hota hai..
        System.out.println("My name is " + this.name +" and age is " + this.age);
    }
    public void SayHi(String name){
        System.out.println(this.name + " say hey " + name);
    }
    public static void SayMentorname(){
        //Intro_yourself();
        // Static field me non-Static accessible nhi hota hai.... error aayega
        System.out.println("Mentor name Monu Bhaiya");
    }
    static{
        System.out.println("I am in static blocks"); // program me sbse pehle chlega main method se pehle.
    }
}