package lec13;

public class Two_D_array {
    @SuppressWarnings("ImplicitArrayToString")
    public static void main(String[] args) {
        int[][] arr=new int [3][4];
        System.out.println(arr);
        int[][] other=arr;
        System.out.println(other);

        System.out.println(arr.length); // row ki length
        System.out.println(arr[0].length);  // column ki length

        System.out.println(arr[1][3]);  // koi value fetch krne ko
        // transverse krne ke liye
        for (int i=0; i<arr.length; i++) {
            for(int j=0; j<arr[0].length; j++){
                System.out.print(arr[i][j]+" ");
            }
        }
    }   
}
// int [][] arr = new int[n][m];
// no. of 1-D array created --> n+1 


