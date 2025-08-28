package lec14;

public class book_allocation_problem {
    public static void main(String[] args) {
        int[] page={10,20,30,40};
        int nos=2;
        System.out.println(minpages(page,nos));   
    }

    public static int minpages(int[] page,int nos){
        int low=0;
        int high=0;
        for(int i=0;i<page.length;i++){
            high+=page[i];
        }
        int ans=0;
        while(low<=high){
            int mid=(low+high)/2;
            if(isitpossible(page, nos, mid)==true){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }

    public static boolean isitpossible(int[] page,int nos,int mid){
        int student = 1;;
        int read_page = 0;
        for(int i=0;i<page.length;){
            if(read_page+page[i]<=mid){
            read_page+=page[i];
            i++;
            }
            else{
            read_page=0;
            student++;
            }
            if(student>nos){
            return false;
            }
        }
        return true;   
    }   
}
