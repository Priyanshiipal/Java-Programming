import java.util.*;
  import java.io.*;
  
  public class countsort {
    
    void countingsort(int [] a, int n, int k){
      int[] c=new int[k+1];
      int[] b=new int[n];
      
      
      for(int i=0;i<=k;i++){
        c[i]=0;
      }
      
       for(int i=0;i<n;i++){
         c[a[i]]=c[a[i]]+1;
       }
       
        for(int i=1;i<=k;i++){
          c[i]=c[i]+c[i-1];
        }
        
         for(int i=n-1;i>=0;i--){
           b[c[a[i]]-1]=a[i];
           c[a[i]]--;
         }
         
          for(int i=0;i<n;i++){
            a[i]=b[i];
          }
    }
    
    void print(int[] a, int n){
       for(int i=0;i<n;i++){
         System.out.print(a[i]+ " ");
       }
       System.out.println();
    }
    public static void main(String args[]) throws IOException {
      
      //write your code here
      Scanner sc= new Scanner(System.in);
      int T=sc.nextInt();
     
      for(int t=0;t<T;t++){
        int k = 10000000;
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
          a[i]=sc.nextInt();
        }
        countsort m=new countsort();
        
        m.countingsort(a, n, k);
        m.print(a, n);
        System.out.println("");
      }
    }
  }