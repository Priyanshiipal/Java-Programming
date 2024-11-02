import java.util.*;
  import java.io.*;
  
  public class Main {
    
    public static int missingElement(int N, int[] ap){
      int d=(ap[N-1]-ap[0]/N);
      for (int i=1;i<N-1;i++){
        if(ap[i]-ap[i-1]!=d){
          return ap[i-1]+d;
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
        int[] ap=new int[N];
        for(int i=0;i<N;i++){
          ap[i]=sc.nextInt();
        }
        System.out.println(missingElement(N, ap));
      }
      sc.close();
    }
  }