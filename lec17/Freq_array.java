package lec17;

public class Freq_array {
    public static void main(String[] args) {
        String s="fregwyuegryegywgdiuwguhwuofhfuohwofhowh";
        int[] fre=new int[26];
        for(int i=1;i<s.length();i++){
            char ch=s.charAt(i);
            fre[ch-'a']++;    //fre[ch-'a']=fre[ch-'a']+1; 
        }
        for(int i=0;i<fre.length;i++){
            System.out.print(fre[i]+" ");
        }
    }    
}
