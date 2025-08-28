package lec10;

public class insertion_sort {
    public static void main(String[] args) {
        int[] arr={3,4,2,1,7};
        sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }

    }
    public static void sort(int[] arr){
        for(int i=1;i<arr.length;i++){
            insertlastElement(arr, i);
        }
    }
    public static void insertlastElement(int[] arr,int i){
        int item=arr[i];
        int j=i-1;
        while(j>=0 && arr[j]>item){
            arr[j+1]=arr[j];
            j--;
        }
        arr[j+1]=item;
    }
    
}
// ek ek krke bdte jana h 
