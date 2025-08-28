package lec27;

public class palindromic_substrings {
    public static void main(String[] args) {
        String s="nitin";
        System.out.println(axisorbit(s));  
    }
    public static int axisorbit(String s){
        int odd=0;
        for(int axis=0;axis<s.length();axis++){
            for(int orbit=0;axis-orbit>=0 && axis+orbit <s.length(); orbit++){
                if(s.charAt(axis-orbit)!=s.charAt(axis+orbit)){
                    break;
                }
                odd++;
            }
        }
        int even=0;
        for(double axis=0.5;axis<s.length();axis++){
            for(double orbit=0.5;axis-orbit>=0 && axis+orbit <s.length(); orbit++){
                if(s.charAt((int)(axis-orbit))!=s.charAt((int)(axis+orbit))){
                    break;
                }
                even++;
            }
        }
        return odd+even;
    }
}
// leetcode 647

//concept---> axis-orbit
