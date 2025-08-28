package lec19;

public class first_occurence {
    public static void main(String[] args) {
        int[] arr={2,4,3,5,6,3,7,3,56,3,11};
        int item=3;
        int idx=0;
        System.out.println(Index(arr, item, idx));
    }

    public static int Index(int[] arr,int item,int idx){
        if(idx==arr.length){
            return -1;
        }
        if(arr[idx]==item){
            return idx;
        }
        return Index(arr,item,idx+1);
    }  
}
// Tail Recursion....
