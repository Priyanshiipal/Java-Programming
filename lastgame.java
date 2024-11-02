import java.util.*;
  import java.io.*;
  
  public class lastgame {
    public static int lastRemNum(int n, int[] arr){
      Arrays.sort(arr);
      if(n%2==1)
      return arr[n/2];

      else{
        return Math.min(arr[n/2-1], arr[n/2]);
      }
    }
    
    public static void main(String args[]) throws IOException {
      
      //write your code here
      Scanner sc=new Scanner(System.in);
      int T=sc.nextInt();
      for(int t=0;t<T;t++){
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
          arr[i]=sc.nextInt();
        }
        System.out.println(lastRemNum(n,arr));
      }
    }
  }