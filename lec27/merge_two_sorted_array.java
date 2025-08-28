package lec27;

public class merge_two_sorted_array {
    public static void main(String[] args) {
        int[] a1={2,3,4,5,7,8,11};
        int[] a2={1,2,5,6,9,11,13,14};
        int[] result=merge(a1, a2);
        for(int i=0;i<result.length;i++){
            System.out.print(result[i]+" ");
        }
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
