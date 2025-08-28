package lec27;

public class merge_sort {
    public static void main(String[] args) {
        int[] arr={7,5,1,4,3};
        int[] ans=sort(arr, 0, arr.length-1);
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }
    }
    public static int[] sort(int[] arr, int si,int ei){
        if(si==ei){
            int[] bs=new int[1];
            bs[0]=arr[si];
            return bs;
        }
        int mid=(si+ei)/2;
        int[] fa=sort(arr,si,mid);
        int[] sa=sort(arr,mid+1,ei);
        return merge(fa,sa);
    }

    public static int[] merge(int[] a1,int[] a2){
         int n=a1.length;
        int m=a2.length;
        int[] result=new int[n+m];
        int i=0;
        int j=0;
        int k=0;
        while(i<n && j<m){
            if(a1[i]<a2[j]){
                result[k]=a1[i];
                i++;
                k++;
            }
            else{
                result[k]=a2[j];
                k++;
                j++;
            }
        }
        while(i<n){
            result[k]=a1[i];
                i++;
                k++;
        } 
        while(j<m){
            result[k]=a2[j];
                k++;
                j++;
        }
        return result;
    }  
}


