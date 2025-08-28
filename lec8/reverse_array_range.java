package lec8;

public class reverse_array_range {
    public static void main(String[] args) {
        int[] arr={3,5,1,7,8,6,9,11,15,17,18,16,23,27};
        reverse_range(arr,3,12);
        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }
    public static void reverse_range(int[] arr,int i,int j){
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }  
}
