// not working for input:
// 1
// 5
//-4 6 9 -1 3
// output:-4 -1 3 6 9 

// use merge program for that
import java.util.*;

public class stones{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        for(int t=0;t<T;t++){
            int n=sc.nextInt();
            int[] a=new int[n];
            for(int i=0; i<n; i++){
                a[i]=sc.nextInt();
            }

            int mid=n/2;
            int[] tinahalf=Arrays.copyOfRange(a, 0, mid);
            int[] rahulhalf=Arrays.copyOfRange(a, mid, n);

            int i=0, j=0, k=0;
            while(i<mid && j<n-mid){
                if(tinahalf[i]<rahulhalf[j]){
                    a[k]=tinahalf[i];
                    i++;
                }
                else{
                    a[k]=rahulhalf[j];
                    j++;
                }
                k++;
            }
            while(i<mid){
                 a[k]=tinahalf[i];
                 i++;
                 k++;
            }
            while(j<n-mid){
                a[k]=rahulhalf[j];
                j++;
                k++;
            }

            for(int l=0;l<a.length;l++){
                System.out.print(a[l]+ " ");
            }
            System.out.println();
        }
    
    sc.close();
    }

}