import java.util.ArrayList;

public class intersectionOfSortedArray {
    public static void main(String [] args){
        int arr1[]={1,2,3,4,5,6};
        int arr2[]={4,5,6,7,8,9};
        int n=6;
        int m=6;
        ArrayList<Integer> ans=new ArrayList<>();
        int i=0;
        int j=0;
        // ################### OPTIMAL ####################
        
        while(i<n&&j<m){
            if(arr1[i]<arr2[j]){
                i++;
            }
            else if(arr2[j]<arr1[i]){
                j++;
            }else{
                ans.add(arr1[i]);
                i++;
                j++;
            }
        }
        for(Integer num:ans){
            System.out.print(num+" ");
        }
    }
}
