package lec15;

public class Sub_string {
    public static void main(String[] args) {
        String s="HelloBye";
        System.out.println(s.substring(2,5));// yaha endIndex +1 krke likhte h ... jaise  yaha 'llo' print hoga 2,3aur4 index wala 5 wala nhi hoga. 
        
        System.out.println( s.substring(2)); // 2 se lekr aakhir tk print hoga.
    }
}

// substring--> continious part of the string.
