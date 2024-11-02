import java.util.*;
  import java.io.*;
  
  public class rotsorted {

    public static int canRotate(int[] arr,  int x){
        int low=0;
        int high=arr.length-1;
        while(low<=high){
            int mid=(low+high)/2;

            if(arr[mid]==x){
             return mid;
            }

            if(arr[low]<=arr[mid]){ //left sorted
                if(arr[low]<=x && arr[mid]>x){
                    high=mid-1;
                }
                else{
                    low=mid+1;
                }
            }
            else {
                if(arr[high]>=x &&  arr[mid]<x){
                low=mid+1;
               }
                else{
                high=mid-1;
               }
            }
        }
        return -1;
    }

    public static void main(String args[]) throws IOException {
      
      //write your code here
      Scanner sc=new Scanner(System.in);
      int T=sc.nextInt();
      for(int t=0;t<T;t++){
      int N=sc.nextInt();
      int[] arr=new int[N];
      for(int i=0;i<N;i++){
        arr[i]=sc.nextInt();
      }
      int x=sc.nextInt();
       System.out.println(canRotate(arr, x));

      }
      sc.close();
    }
  }