import java.util.*;
  import java.io.*;
  
  public class flooor {
    public static void main(String args[]) throws IOException {
      
      //write your code here
      Scanner sc=new Scanner(System.in);
      int T=sc.nextInt();
      for(int t=0;t<T;t++){
        int N=sc.nextInt();
        int x = sc.nextInt();
        int[] A=new int[N];
        for(int i=0;i<N;i++){
          A[i]=sc.nextInt();
          
        }
        int floorIndex=findFloorIndex(A,x);
         System.out.println(floorIndex);
      }
      sc.close();
    }
    public static int findFloorIndex(int[] A,int x){
  int left=0;
  int right=A.length-1;
  int floorIndex=-1;
  
  while(left<=right){
    int mid=left+(right-left)/2;
    
    if(A[mid]<=x){
      floorIndex=mid;
      left=mid+1;
    }
    else{
      right=mid=1;
    }
    
  }
    return floorIndex;
  }
   
  }
  
  public static int findFloorIndex(int[] A,int x){
  int left=0;
  int right=A.length-1;
  int floorIndex=-1;
  
  while(left<=right){
    int mid=left+(right-left)/2;
    
    if(A[mid]<=x){
      floorIndex=mid;
      left=mid+1;
    }
    else{
      right=mid=1;
    }
    
  }
    return floorIndex;
  }
  
  
  
  
  
  
  