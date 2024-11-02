import java.util.*;
  import java.io.*;
  
  public class findfirstone {
    public static void main(String args[]) throws IOException {
      
      //write your code here
      Scanner sc=new Scanner(System.in);
      int T=sc.nextInt();
      for(int t=0;t<T;t++){
        int N=sc.nextInt();
        int[] A=new int[N];
        for(int i=0;i<N;i++){
        A[i]=sc.nextInt();
        }
        System.out.println(findFirstOne(A));
      }
    }
    
    public static int findFirstOne(int[] A){
      int low=0;
      int high=A.length-1;
      
      while(low<=high){
        int mid=low+(high-low)/2;
        if(A[mid]==1){
          if(mid==0 || A[mid-1]==0){
            return mid;
          }
          else{
            high=mid-1;
          }
        }
        else{
          low=mid+1;
        }
      }
      return -1;
    }
  }