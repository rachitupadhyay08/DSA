package lec27;

public class partition_in_array {
    public static void main(String[] args) {
        int[] arr={5,7,2,1,8,3,4};
        int idx=partition(arr,0,arr.length-1);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println(idx);
    }

    public static int partition(int[] arr,int si,int ei){
        //agr last index ki jgah kisi kth index wale ko  shi krna h to yha pr 
        //ei aur k ka pehle swapping kr denge.... baaki same 
        int item=arr[ei];
        int idx=si;
        for(int i=si;i<ei;i++){
            if(arr[i]<item){
                int temp=arr[i];
                arr[i]=arr[idx];
                arr[idx]=temp;
                idx++;
            }
        }
        int temp=arr[ei];
        arr[ei]=arr[idx];
        arr[idx]=temp;
        return idx;
    }  
}
