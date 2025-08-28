package lec8;

public class linear_search {
    public static void main(String[] args) {
        int[] arr = {3, 5, 1, 6, 8};
        int item=7;
        System.out.println(search(arr, item));
    }
    public static int search(int[] arr,int item){
        for(int i=0; i<arr.length; i++){
            if(arr[i]==item){
                return i;
            }
        }
        return -1;
    }
    
}