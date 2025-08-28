package lec29;

public class StudentClient {
    public static void main(String[] args) {
        System.out.println("hello");
        Student s=new Student();   
                 //Instance or Object
    // s is reference variable...
        System.out.println(s.name);
        System.out.println(s.age);
        s.name="arjun";
        s.age=21;
        Student s1=new Student();
        s.Intro_yourself();
        s1.name="kamal";
        s1.age=22;
        s1.Intro_yourself();
        s1.SayHi("ramesh");
        // jis reference varible ke aage dot lgate h uska address this keyword me pass hota hai..

        Student.SayMentorname();
        s1.SayMentorname(); // read the warning
    }
    static{
        System.out.println("I am in static blocks in main "); // program me sbse pehle chlega main method se pehle.
    }
}
// ye class(StudentClient) --> Student class pr dependent h 

// class is the blueprint.(heap-memory me hota h)
// new Student se Stack memory me 2k location pr name=null.age=0 default set hua h 