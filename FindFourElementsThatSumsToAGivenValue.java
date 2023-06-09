import java.io.*;
import java.util.* ;

public class Solution {
  public static String fourSum(int[] arr, int target, int n) {
      Arrays.sort(arr);
        for(int i =0;i<n-3;i++){
            for(int j =i+1;j<n-2;j++){
                long t = (long)target-(long)arr[i]-(long)arr[j];
                int k = j+1;
                int l = n-1;
                while(k<l){
                long val = (long)arr[k]+(long)arr[l];
                if(val<t)k++;
                else if(val>t)l--;
                else{
                    return "Yes";
                }
            }
            }
        }
      return "No"; 
  }
}
