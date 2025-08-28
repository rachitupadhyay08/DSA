package lec24;
import java.util.*;

public class two_D_list {
    public static void main(String[] args) {
        List<Integer> ll=new ArrayList<>();
        ll.add(1);
        ll.add(2);
        ll.add(3);

        List<Integer> lll=new ArrayList<>();
        lll.add(10);
        lll.add(20);
        lll.add(30);

        List<Integer> llll=new ArrayList<>();
        llll.add(101);
        llll.add(201);
        llll.add(301);

        List<List<Integer>> ans= new ArrayList<>();
        ans.add(ll);
        ans.add(lll);
        ans.add(llll);

        System.out.println(ans);   
    }
}