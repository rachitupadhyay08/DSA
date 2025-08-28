package lec15;

public class String_add {
    public static void main(String[] args) {
        String s1="hello";  // eg. ye 2K location pr h inside pool
        String s2="bye";    // eg. ye 3K location pr h inside pool

        String s=s1+" "+s2;  // hello aur bye ki ek copy heap me bnegi(pool ke bahar) aur  heap ke location me bnegi 
        System.out.println(s);  //on for example location--> 6K in heap
        
        String s3="kaju"+s1;   //ye String pool ke bhar heap me bnegi with a copy of s1
        System.out.println(s3);

        String s4="kaju"+"katli"; // ye String pool me kisi location pr bnegi
        System.out.println(s4);  // for eg. at 6K location in String pool

        System.out.println("hey"+ 10 + 30 + "bye" + 4 + 2);
        // String plus anything is always treted as a string 
        System.out.println(2+3+"bye"+5+5);
        //String ke left wale number normal add honge aur right wale as it is print honge .
        System.out.println("hey"+(10+30)+"bye"+4+2);

        // String is Immutable.
        // ****we can modify a String but not on the same location..
        // Eg. s1=s1+"bye"
        // s1 ki ek copy  heap me bnegi nayi location pr phir usme "bye add hoga" aur nayi wali location s1 ko assign ho jaegi.
        // s1="hey"  eg 3K in pool... this loaction becomes garbage.
        // s1="bye"  eg. 5K in pool ...ye bhi nayi location pr bnega.
        
    }
}
