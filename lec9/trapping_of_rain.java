package lec9;

public class trapping_of_rain {
    public static void main(String[] args) {
        int[] arr={0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(rain(arr));
    }
    public static int rain(int[] arr){
        int n=arr.length;
        int[] leftmax=new int[n];
        int[] rightmax=new int[n];

        leftmax[0]=arr[0];
        for(int i=1;i<n;i++){
            leftmax[i]=Math.max(leftmax[i-1],arr[i]);
        }
        rightmax[n-1]=arr[n-1];
        for(int j=n-2;j>=0;j--){
            rightmax[j]=Math.max(rightmax[j+1], arr[j]);
        }
        int total_rain=0;
        for(int i=0;i<n;i++){
            total_rain += Math.min(leftmax[i],rightmax[i]) - arr[i];
        }
        return total_rain;
    }
}


