package lec30;

public class StudentClient {
    public static void main(String[] args) /*throws Exception*/ {
        Student s=new Student("Raj",19);
        System.out.println(s.getAge());
        s.setAge(-9);
        System.out.println(s.getAge());
        System.out.println("hey");
    }
}
