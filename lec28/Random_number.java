package lec28;

import java.util.Random;

public class Random_number {
    public static void main(String[] args) {
        int si=10;
        int ei=100;
        Random rn=new Random();
        for(int i=0;i<10;i++){
            int item=rn.nextInt(ei-si+1)+si;    // +si isliye kyuki bracket ke andr ki value bound hoti h jo ki 91 h to ye 0 se 90 tk ka
                                                //hi generate krega isliye + si hota h 10 se 100 tk keliye laane ke liye 
            System.out.print(item + " ");
        }
    }
}