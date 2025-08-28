public class ques {
    public static void main(String[] args) {
        int n=1;
        while(n<=100){
            if(n%3==0){
                n++;
            }
            else{
                System.out.println(n);
            }
            n +=1;
        }
    }
}
// skip the numbers divisible by 3 between 1 to 100 
