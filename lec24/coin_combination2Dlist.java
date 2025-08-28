package lec24;
import java.util.*;

public class coin_combination2Dlist {
    public static void main(String[] args) {
        int[] coin={2,3,5};
        int amount=8;
        List<Integer>ll=new ArrayList<>();
        List<List<Integer>> ans= new ArrayList<>();
        Combination(coin, amount, ll, 0,ans);
        System.out.println(ans);
    }
    public static void Combination(int[] coin,int amount,List<Integer>ll,int idx, List<List<Integer>> ans){
        if(amount==0){
            // System.out.println(ll);
            ans.add(new ArrayList<>(ll));   // ek copy bn jaegi 
            return;
        }
        for(int i=idx; i<coin.length;i++){
             if(amount>=coin[i]){
                ll.add(coin[i]);
                Combination(coin, amount-coin[i], ll, i,ans);
                ll.remove(ll.size()-1);
            }
        }
    }
}
//leetcode 39
